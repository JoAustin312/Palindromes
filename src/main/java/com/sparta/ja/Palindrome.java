package com.sparta.ja;

import java.util.ArrayList;

public class Palindrome
{
    public static void main( String[] args ) {

//        System.out.println(isPalindrome("racecar"));
//        System.out.println(isPalindrome("helicopter"));
//        System.out.println(isPalindrome("radar"));
//
//        String palindromeStringTest = "ALULA ANANA CIVIC DEKED DELED DERED DEWED KAIAK KAYAK LEMEL LEVEL MADAM MALAM MINIM RADAR REFER ROTOR SAGAS SAMAS " +
//                "SEDES SELES SEMES SERES SEXES SHAHS SIMIS SIRIS SOLOS STATS STETS STOTS SULUS SUSUS TENET TOROT ARAARA ATAATA kayak deified rotator " +
//                "repaper deed peep wow noon civic racecar level mom bird rib taco cat UFO tofu Borrow or rob? Never odd or even. We panic in a pew. " +
//                "Won’t lovers revolt now? Ma is a nun, as I am. Don’t nod. Sir, I demand, I am a maid named Iris. Was it a car or a cat I saw? Yo, " +
//                "Banana Boy! Eva, can I see bees in a cave? Madam, in Eden, I’m Adam. A man, a plan, a canal, Panama! Never a foot too far, even. " +
//                "Red roses run no risk, sir, on Nurse’s order. He lived as a devil, eh? Ned, I am a maiden. Now, sir, a war is won! Evade me, Dave! " +
//                "Dennis and Edna sinned. Step on no pets!";
//        System.out.println(findLongestPalindrome(palindromeStringTest));

        //Replaced this with actual tests
    }

    public static boolean isPalindrome(String wordToCheck){

        String lowerCaseWord = wordToCheck.toLowerCase();
        String reversed = reverse(lowerCaseWord);

        return reversed.equals(lowerCaseWord);
    }

    public static String reverse(String wordToReverse) {
        StringBuilder reversed = new StringBuilder();
        int len = wordToReverse.length();

        for (int i = len-1; i >= 0; i--){
            reversed.append(wordToReverse.charAt(i));
        }
        return reversed.toString();
    }

    public static ArrayList<String> findLongestPalindrome(String sentenceToCheck){
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
    }

}
