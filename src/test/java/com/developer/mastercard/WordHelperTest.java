package com.developer.mastercard;

import com.developer.mastercard.WordHelper;
import com.developer.mastercard.WordNode;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class WordHelperTest {

    @Test(expected = IllegalArgumentException.class)
    public void testGetLongestWordWithEmptyString() {
        String input = "";
        WordHelper.getLongestWord(input);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetLongestWordWithNullInput() {
        WordHelper.getLongestWord(null);
    }

    @Test
    public void testGetLongestWord() {
        String input = "The cow jumped over the moon.";
        WordNode result = WordHelper.getLongestWord(input);

        String expectedWord = "jumped";
        assertThat(result.getWord(), equalTo(expectedWord));

        int expectedLength = 6;
        assertThat(result.getLength(), equalTo(expectedLength));

    }

    @Test
    public void testGetLongestWordWithDuplicateWords() {
        String input = "The cow jumped over the moon, then the cow jumped over the moon again";
        WordNode result = WordHelper.getLongestWord(input);

        String expectedWord = "jumped";
        assertThat(result.getWord(), equalTo(expectedWord));

        int expectedLength = 6;
        assertThat(result.getLength(), equalTo(expectedLength));


    }

    @Test
    public void testGetLongestWordWithDuplicateWordsWithOneWord() {
        String input = "supercalifragilisticexpialidocious";
        WordNode result = WordHelper.getLongestWord(input);

        assertThat(result.getWord(), equalTo(input));
        assertThat(result.getLength(), equalTo(input.length()));

    }

    @Test
    public void testGetLongestWordWithSpecialCharacters() {
        String input = "The cow jumped over the moon.@@@";
        WordNode result = WordHelper.getLongestWord(input);

        String expectedWord = "jumped";
        assertThat(result.getWord(), equalTo(expectedWord));

        int expectedLength = 6;
        assertThat(result.getLength(), equalTo(expectedLength));

    }
}
