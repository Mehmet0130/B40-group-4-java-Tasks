package Bakhrom;

public class T5_frequencyOfCharacter {

    public static String frequencyOfCharacter(String str) {

        String result= "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(result.contains("" + ch))
                continue;

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == ch)
                    count++;
            }
            result += ch + "" + count;
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(frequencyOfCharacter("AAABBCDD"));
    }



}
