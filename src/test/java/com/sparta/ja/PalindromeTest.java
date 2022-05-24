package com.sparta.ja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeTest
{
    @Test
    @DisplayName("should return true racecar")
    public void shouldReturnTrueRacecar() {
        Assertions.assertTrue(Palindrome.isPalindrome("racecar"));
    }
    @Test
    @DisplayName("should return true helicopter")
    public void shouldReturnFalseHelicopter() {
        Assertions.assertFalse(Palindrome.isPalindrome("helicopter"));
    }
    @Test
    @DisplayName("should return true radar")
    public void shouldReturnFalseRadar() {
        Assertions.assertTrue(Palindrome.isPalindrome("radar"));
    }
    @Test
    @DisplayName("should return list of longest palindromes")
    public void shouldReturnListOfLongestPalindromes() {
        String palindromeStringTest = "ALULA ANANA CIVIC DEKED DELED DERED DEWED KAIAK KAYAK LEMEL LEVEL MADAM MALAM MINIM RADAR REFER ROTOR SAGAS SAMAS " +
                "SEDES SELES SEMES SERES SEXES SHAHS SIMIS SIRIS SOLOS STATS STETS STOTS SULUS SUSUS TENET TOROT ARAARA ATAATA kayak deified rotator " +
                "repaper deed peep wow noon civic racecar level mom bird rib taco cat UFO tofu Borrow or rob? Never odd or even. We panic in a pew. " +
                "Won’t lovers revolt now? Ma is a nun, as I am. Don’t nod. Sir, I demand, I am a maid named Iris. Was it a car or a cat I saw? Yo, " +
                "Banana Boy! Eva, can I see bees in a cave? Madam, in Eden, I’m Adam. A man, a plan, a canal, Panama! Never a foot too far, even. " +
                "Red roses run no risk, sir, on Nurse’s order. He lived as a devil, eh? Ned, I am a maiden. Now, sir, a war is won! Evade me, Dave! " +
                "Dennis and Edna sinned. Step on no pets!";
        ArrayList<String> expectedResult = new ArrayList<>(Arrays.asList("deified", "rotator", "repaper", "racecar"));
        Assertions.assertArrayEquals(expectedResult.toArray(), Palindrome.findLongestPalindrome(palindromeStringTest).toArray());
    }
}
