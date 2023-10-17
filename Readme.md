WordsComp - Longest and Second-Longest Compound Words Finder

Overview:
WordsComp is a Java program that finds the longest and second-longest compound words from a list of words provided in an input file. It uses a recursive algorithm to identify compound words and determine their length.

Explanation:
This program is designed to assist in the identification of compound words within a list of input words. A compound word is defined as a word that can be formed by combining two or more smaller words found in the list. The program uses a recursive algorithm to check for compound words and determine their length. It then provides the two longest compound words found in the input.

Prerequisites:
1) Java Development Kit (JDK)
2) A text editor or integrated development environment (IDE) such as IntelliJ IDEA.

Usage:
1) Clone or download this repository to your local machine. 
2) Open the Java file WordsComp.java in your preferred Java development environment. 
3) Replace "inputFilePath" with the actual path to your input file. The input file should contain a list of words, with one word per line. 
4) Build and run the program. 
5) The program will read the input file, identify the longest and second-longest compound words, and display the results along with the processing time in seconds.

Example Input:
An example input file (input1.txt & input2.txt) containing a list of words is provided in the repository.

Code Explanation:
1) This code begins by importing the necessary Java libraries, including java.io for file input/output and java.util for various utility classes and data structures. 
2) Then, The code defines a Java class named WordsComp.
3) Here, isComp is a method that checks if a given word is a compound word. It takes two parameters: the word to be checked and a set of words for reference.
4) Then, This loop iterates through the characters of the word, starting from the second character (index 1). The loop considers different possible splits of the word into a prefix and a suffix.
5) st_prefix represents the substring of word from the beginning up to index i. This is the potential prefix of the compound word.
6) lt_suffix represents the substring of word starting from index i. This is the potential suffix of the compound word.
7) The code checks whether both the prefix (st_prefix) and the suffix (lt_suffix) are in the set of words (wordSet). If they are, it indicates that the word can be split into smaller words. 
8) If lt_suffix is not found in the set but is itself a compound word (recursively checked using the isComp method), it is still considered a compound word. If either of these conditions is met, the method returns true, indicating that the word is a compound word.
9) If none of the potential splits makes a compound word, the method returns false. The method returns false when all possible splits have been checked, and none result in a compound word.
10) findLongestCompounds is a method that finds the longest and second-longest compound words in a list of words. It takes a list of words as a parameter.
11) A set is created from the list of words. This set is used to efficiently check whether a word is in the list of words.
12) Two variables, longestCompound and secondLongestCompound, are initialized to store the longest and second-longest compound words.
13) A loop iterates through each word in the list of words. The isComp method is called to check if the current word is a compound word.
14) If the current word is a compound word and its length is greater than the length of longestCompound, it becomes the new longestCompound.
15) The previous longestCompound becomes the new secondLongestCompound, and the current word becomes the new longestCompound.
16) If the current word is a compound word and its length is greater than the length of secondLongestCompound but not greater than the length of longestCompound, it becomes the new secondLongestCompound.
17) The loop continues through all the words in the list, updating longestCompound and secondLongestCompound as needed.
18) The two longest compound words are added to a list called result. The method returns a list containing the longest and second-longest compound words.
19) The main method is the entry point of the program. The inputFilePath variable is set to the path of the input file. You should replace this with the actual path to your input file.
20) An empty list called wordList is created to store the words from the input file. 
21) A try block is used to open and read the input file. The code reads each line from the input file and adds it to the wordList. If there is an error while reading the file, it is caught and an error message is printed.
22) The current time in milliseconds is stored as the start time to measure the processing time. The findLongestCompounds method is called with wordList, and the result is stored in the compoundWords list.
23) The current time in milliseconds is stored as the end time. The processing time is calculated by finding the difference between the end time and start time, and then converting it to seconds.
24) The code prints the longest compound word, second-longest compound word, and the processing time in seconds to the console.
