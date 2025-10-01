package Bakhrom;

public class T7_findUniqueCharacters {

    public static String unique(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF")); // DEF
    }

}
