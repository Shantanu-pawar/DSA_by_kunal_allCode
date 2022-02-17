package lec1_loops.questions;

import java.util.Scanner;

public class ex5_2_fibo_number_addition {
    public static void main(String[] args) {

//        que: write down the series of fibonachi number and find out n number

            Scanner in = new Scanner(System.in);
            System.out.print("write down n number here: ");
            int n = in.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;

            while (count <= n){
                int temp = b ;
                b = b + a;

                a = temp;
                count ++;

            }
            System.out.println(b);
        }
    }

