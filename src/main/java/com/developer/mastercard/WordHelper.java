package com.developer.mastercard;

/***
 * Static Class that can find the longest word from a String and remove Punctuations and Special Characters.
 */

public class WordHelper {

    public static WordNode getLongestWord(String sentence) {

        if (sentence == null || sentence.length() < 1) {
            throw new IllegalArgumentException("This is not a valid sentence to determine the longest word");
        }

        String[] words = extractWordsFromSentence(sentence);
        String longestWord = getLongestWord(words);


        return new WordNode(longestWord, longestWord.length());
    }

    /***
     * Extracts words from the input and does not consider punctuation and special characters as a part of a word.
     * @param sentence String input
     * @return String[] array of words
     */
    private static String[] extractWordsFromSentence(String sentence) {
        String regex = "[^A-Za-z]+";
        return sentence.split(regex);
    }


    /***
     * Iterates through a array of String and returns the longest word.
     * @param sentence String .. sentence, holding words
     * @return String the longest word
     */
    private static String getLongestWord(String... sentence) {
        String longestWord = "";

        for (String word : sentence) {
            int currentWordLength = word.length();
            if (currentWordLength > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}
