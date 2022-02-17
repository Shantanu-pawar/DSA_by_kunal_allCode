package lec1_loops.questions;
import java.util.Scanner;

public class countnums_whileLoop {
    public static void main(String[] args) {

//        countnums example here

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int b = 1354616546 ;
        int count = 0 ;

        while (b > 0 )
        {
            int rem = b % 10 ;

            if (rem == a ){
                count ++;
            }
            b = b /10;
        }
        System.out.println(count);


    }
}
