package Bakhrom;

public class T6_removeDuplicates {

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!result.contains("" + ch)) {
                result += ch;
            }


        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));

    }

}
