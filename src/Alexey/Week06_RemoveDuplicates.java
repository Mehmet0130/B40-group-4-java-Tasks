package Alexey;

public class Week06_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

    //Alexey is volunteer

    public static String removeDup(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (!res.contains(ch)) {
                res += ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(removeDup("CCCYDDDDEEEEOOO")); //
    }
}
