package lec2_methodsCode;

import java.util.Scanner;

public class ex2_methods {
    public static void main(String[] args) {

//        question: input of 2 numbers and print the ex11_sum


        Scanner in = new Scanner(System.in);
        System.out.print("enter your first number : ");
        float a = in.nextFloat();
        System.out.print("enter your second number : ");
        float b = in.nextFloat();

        float total = (a+b);
        System.out.println(total);
    }
}
