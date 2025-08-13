package Bakhrom;

public class T2_FINRA {

    public static void main(String[] args) {

        for (int i = 1; i < 30; i++) {
            if(i % 3 == 0 && i % 5 == 0){ //if number is divisible BOTH 3 and 5, then print "FINRA"
                System.out.println("FINRA");
            }else if(i % 3 ==0){ // but if the number is ONLY divisible by 3, then print "FIN"
                System.out.println("FIN");
            }else if(i % 5 == 0 ){ // but if the number is ONLY divisible by 5, then print "RA"
                System.out.println("RA");
            }else{ // otherwise: if the number is not evenly divisible by 3 or 5 then print number itself
                System.out.println(i);
            }
        }

    }

}
