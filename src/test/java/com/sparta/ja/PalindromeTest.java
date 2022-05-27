package com.sparta.ja;

import static org.junit.jupiter.api.Assertions.*;
import static com.sparta.ja.Palindrome.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PalindromeTest
{
    @Test
    @DisplayName("should return true racecar")
    public void shouldReturnTrueRacecar() {
        assertTrue(isPalindrome("racecar"));
    }

    @Test
    @DisplayName("should return true helicopter")
    public void shouldReturnFalseHelicopter() {
        assertFalse(isPalindrome("helicopter"));
    }

    @Test
    @DisplayName("should return true radar")
    public void shouldReturnTrueRadar() {
        assertTrue(isPalindrome("radar"));
    }

    @Test
    @DisplayName("should return reversed bottle")
    public void shouldReturnReversedBottle() { assertEquals("elttob", reverse("bottle"));}

    @Test
    @DisplayName("should return reversed speaker")
    public void shouldReturnReversedSpeaker() { assertEquals("rekaeps", reverse("speaker"));}

    @Test
    @DisplayName("should return list of longest palindromes length 5")
    public void shouldReturnListOfLongestPalindromesLength5() {
        String palindromeStringTest = "kayak deed peep wow noon civic level mom bird rib taco cat";
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("kayak", "civic", "level"));
        assertArrayEquals(expectedResult.toArray(), findLongestPalindrome(palindromeStringTest).toArray());
    }

    @Test
    @DisplayName("should return list of longest palindromes length 6")
    public void shouldReturnListOfLongestPalindromesLength6() {
        String palindromeStringTest = "ALULA ANANA CIVIC DEKED DELED DERED DEWED KAIAK KAYAK LEMEL LEVEL MADAM MALAM MINIM RADAR REFER ROTOR SAGAS SAMAS" +
                "SEDES SELES SEMES SERES SEXES SHAHS SIMIS SIRIS SOLOS STATS STETS STOTS SULUS SUSUS TENET TOROT ARAARA ATAATA";
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("ARAARA", "ATAATA"));
        assertArrayEquals(expectedResult.toArray(), findLongestPalindrome(palindromeStringTest).toArray());
    }

    @Test
    @DisplayName("should return list of longest palindromes with extra words")
    public void shouldReturnListOfLongestPalindromesWithExtraWords() {
        String palindromeStringTest = "ALULA ANANA CIVIC DEKED DELED DERED DEWED KAIAK KAYAK LEMEL LEVEL MADAM MALAM MINIM RADAR REFER ROTOR SAGAS SAMAS " +
                "SEDES SELES SEMES SERES SEXES SHAHS SIMIS SIRIS SOLOS STATS STETS STOTS SULUS SUSUS TENET TOROT ARAARA ATAATA kayak deified rotator " +
                "repaper deed peep wow noon civic racecar level mom bird rib taco cat UFO tofu Borrow or rob? Never odd or even. We panic in a pew. " +
                "Won’t lovers revolt now? Ma is a nun, as I am. Don’t nod. Sir, I demand, I am a maid named Iris. Was it a car or a cat I saw? Yo, " +
                "Banana Boy! Eva, can I see bees in a cave? Madam, in Eden, I’m Adam. A man, a plan, a canal, Panama! Never a foot too far, even.";
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("deified", "rotator", "repaper", "racecar"));
        assertArrayEquals(expectedResult.toArray(), findLongestPalindrome(palindromeStringTest).toArray());
    }

    @Test
    @DisplayName("should return false from isPalindrome null value")
    public void shouldReturnFalseFromIsPalindromeNullValue() { assertFalse(isPalindrome(null));}

    @Test
    @DisplayName("should return null message from reverse")
    public void shouldReturnNullMessageFromReverse() { assertEquals("Null value provided", reverse(null));}

    @Test
    @DisplayName("should return array with null message from findLongestPalindrome")
    public void shouldReturnArrayWithNullMessageFromFindLongestPalindrome() {
        ArrayList<String> expected = new ArrayList<>(Collections.singletonList("Null value provided"));
        assertArrayEquals(expected.toArray(), findLongestPalindrome(null).toArray());}
}
