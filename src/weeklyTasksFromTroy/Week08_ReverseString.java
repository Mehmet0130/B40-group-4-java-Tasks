package weeklyTasksFromTroy;

public class Week08_ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString());
    }
      /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    //Bakhroom will explain
    public static String reverseString(){
        String original ="ABCD";
        String reverse=" ";
        for (int i = original.length()-1; i >=0; i--) {
            reverse+=original.charAt(i);
        }
        return reverse;
    }
}