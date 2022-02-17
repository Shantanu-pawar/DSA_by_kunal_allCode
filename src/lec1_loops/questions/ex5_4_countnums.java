package lec1_loops.questions;

import java.util.Scanner;

public class ex5_4_countnums {
    public static void main(String[] args) {

//        question : find the repetation of the numbers like how many times the number
//                is repeted

        System.out.print("enter your repetative number for check condition : ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = 12234578;
        int count = 0;

        while (n > 0) {

            int rem = n % 10 ;

            if (rem == a){  //note i change here simply add scanner and take new int a
                count ++;
            }
           n = n /10;
        }
        System.out.println(count);
    }
}
