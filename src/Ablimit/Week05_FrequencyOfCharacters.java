package Ablimit;

public class Week05_FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "AABBCCDDDD";
        String result = "";
        int count = 0;




        for (int i = 0; i < str.length(); i++) {
            char each  = str.charAt(i);
            if(result.contains(each+"")){
                continue;
            }
            for (int j = 0; j <str.length() ; j++) {
              if(str.charAt(j)==each)
                  count++;
            }
            result += each+""+count;
        }
        System.out.println("result = " + result);
    }
}

/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
