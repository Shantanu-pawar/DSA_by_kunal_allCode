package lec1_loops.questions;

import java.util.Scanner;

public class ex5_1_findout_largest_no_usingloops {
    public static void main(String[] args) {

        System.out.print("enter your 3 no.: ");

//        q: find the largest of the 3 numbers.

        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int largeno = a ;
        if (b > largeno){
            largeno = b;
        }

        if (c > largeno){
            largeno = c;
        }

        System.out.println(largeno);


//        2nd method for solving this type of problem

//        int max = 0;
//        if (a < b){
//            max = a;
//        }else {
//            max = b;
//        }
//
//        if(max < c){
//            max = c;
//        }
//        System.out.println(max);
//

    }
}

