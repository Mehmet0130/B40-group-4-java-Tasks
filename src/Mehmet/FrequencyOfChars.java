package Mehmet;

public class FrequencyOfChars {
 /*
    Write a function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD")); // Output: A3B2C1D2
    }

    public static String frequencyOfChars(String str) {
        String result = "";  // Step 1: to store final frequency result

        for (int i = 0; i < str.length(); i++) {   // Step 2: loop through each character
            char ch = str.charAt(i);              // Step 3: get each character

            if (result.contains("" + ch)) {       // Step 4: skip if already counted
                continue;
            }

            int count = 0;                        // Step 5: counter for this character

            for (int j = 0; j < str.length(); j++) {   // Step 6: compare with all characters
                if (str.charAt(j) == ch) {
                    count++;                      // Step 7: count how many times it appears
                }
            }

            result += ch + "" + count;            // Step 8: add "character + count" to result
        }

        return result;  // Step 9: return final string
    }


}

