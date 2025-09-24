package Ablimit;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {

        //solution 1 ;
        String str =  "AACCFFDSDSFDF";
        String result ="";

        for (int i = 0; i <str.length() ; i++) {
            if(!result.contains(str.charAt(i)+"")){
                result +=str.charAt(i);
            }

        }


        //solution 2 :
        /*
        Set<String> duplicated = new HashSet<>();
        String[] arr = str.split("");
        for (String each : arr) {
            result += each;
        }
         */


        System.out.println("result = " + result);
    }

}
/*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */