package com.developer.mastercard;

/***
 * Plain Old Java Object that stores and returns a word as well as the the length of the word.
 */
public class WordNode {

    private String word;
    private int length;

    public WordNode(String word, int length) {
        this.word = word;
        this.length = length;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "com.developer.mastercard.WordNode{" +
                "word='" + word + '\'' +
                ", length=" + length +
                '}';
    }
}
