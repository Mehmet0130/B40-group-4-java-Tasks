package Ablimit;

public class Week05_FrequencyOfCharacters {
    public static void main(String[] args) {
               String str="AAFDF";
        String[] arr = str.split("");

        String result = "";

        for (String each : arr) {
           int count = 0;

            if (!result.contains(each)) {
                for (String eachElement : arr) {
                    if (each.equals(eachElement)) {
                        count++;
                    }
                }

                result += each +count;
            }
        }

        System.out.println(result);
    }
}
/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */