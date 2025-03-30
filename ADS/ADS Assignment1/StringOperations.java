//Assignment 1:Que2.://anagrams:word form by rearranging the given word
import java.util.Arrays;
class StringOperations{
public static void main(String[] args) {
        
        String str1 = "listen";
        String str2 = "silent";
        String sentence = "Practice makes a man perfect";

        // 1. Check if the strings are anagrams
        boolean areAnagrams = areAnagrams(str1, str2);
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + areAnagrams);

        // 2. Find the longest word in the sentence
        String longest = longestWord(sentence);
        System.out.println("Longest word: " + longest);

        // 3. Count vowels and consonants in the sentence
        int[] v_c_count = countVowel_Conso(sentence);
        System.out.println("Vowels: " + v_c_count[0] + ", Consonants: " + v_c_count[1]);
    }


// Method to check if two strings are anagrams of each other
  
    static boolean areAnagrams(String str1, String str2) {
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to char arrays and sort them
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);
    }

    // Method to find the longest word in a sentence
    static String longestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";

        // Iterate through the words to find the longest one
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }

    // Method to count vowels and consonants in a sentence
    static int[] countVowel_Conso(String sentence) {
        int vowels = 0;
        int consonants = 0;

        // Convert sentence to lowercase for easy comparison
        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Check if it's a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Return an array containing the count of vowels and consonants
        return new int[] {vowels, consonants};
    }

    }/*Output:
	Are 'listen' and 'silent' anagrams? true
Longest word: Practice
Vowels: 9, Consonants: 15
*/