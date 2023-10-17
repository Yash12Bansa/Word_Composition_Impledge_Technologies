package WordsComp;

import java.io.*;
import java.util.*;

public class WordsComp {
    public static boolean isComp(String word, Set<String> wordSet) {
        for (int i = 1; i < word.length(); i++) {
            String st_prefix = word.substring(0, i);
            String lt_suffix = word.substring(i);
            if (wordSet.contains(st_prefix) && (wordSet.contains(lt_suffix) || isComp(lt_suffix, wordSet))) {
                return true;
            }
        }
        return false;
    }

    public static List<String> findLongestCompounds(List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        String longestCompound = "";
        String secondLongestCompound = "";

        for (String word : wordList) {
            if (isComp(word, wordSet)) {
                if (word.length() > longestCompound.length()) {
                    secondLongestCompound = longestCompound;
                    longestCompound = word;
                } else if (word.length() > secondLongestCompound.length()) {
                    secondLongestCompound = word;
                }
            }
        }

        List<String> result = new ArrayList<>();
        result.add(longestCompound);
        result.add(secondLongestCompound);
        return result;
    }

    public static void main(String[] args) {
        String inputFilePath = "out/production/PROBLEM SOLVING/WordsComp/input1.txt";

        List<String> wordList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                wordList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long startTime = System.currentTimeMillis();

        List<String> compoundWords = findLongestCompounds(wordList);

        long endTime = System.currentTimeMillis();
        double processingTime = (endTime - startTime) / 1000.0;

        System.out.println("Longest Compound Word: " + compoundWords.get(0));
        System.out.println("Second Longest Compound Word: " + compoundWords.get(1));
        System.out.println("Time taken to process: " + processingTime + " seconds");
    }
}
