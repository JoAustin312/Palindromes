package com.sparta.ja;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Palindrome
{
    public static void main( String[] args ) {

    }

    public static boolean isPalindrome(String wordToCheck){

        if (wordToCheck != null) {
            String lowerCaseWord = wordToCheck.toLowerCase();
            String reversed = reverse(lowerCaseWord);

            return reversed.equals(lowerCaseWord);
        } else return false;
    }

    public static String reverse(String wordToReverse) {
        StringBuilder reversed = new StringBuilder();
        if (wordToReverse != null) {
            int len = wordToReverse.length();

            for (int i = len-1; i >= 0; i--){
                reversed.append(wordToReverse.charAt(i));
            }
            return reversed.toString();
        } else return "Null value provided";
    }

    public static ArrayList<String> findLongestPalindrome(String sentenceToCheck){
        if (sentenceToCheck != null) {
            String[] splitSentence = sentenceToCheck.replaceAll("\\p{Punct}", "").split(" ");//removes punctuation and splits string into array
            ArrayList<String> listOfPalindromes = new ArrayList<>();
            ArrayList<String> listOfLongestPalindromes = new ArrayList<>();
            int longestWordChars = 0;

            for (String word : splitSentence){ //checks word is more than 3 chars and is a palindrome then adds to arraylist
                if (word.length() >= 3 && isPalindrome(word)){
                    listOfPalindromes.add(word);
                }
            }
            for (String word : listOfPalindromes){ //finds length of longest word and assigns to variable
                if (word.length() > longestWordChars){
                    longestWordChars = word.length();
                }
            }
            for (String word : listOfPalindromes){ //adds words to list that match longest length
                if (word.length() == longestWordChars){
                    listOfLongestPalindromes.add(word);
                }
            }
            return listOfLongestPalindromes;
        } else {
            return new ArrayList<>(Collections.singletonList("Null value provided"));
        }
    }

}
