package lec2_methodsCode;

import java.util.Scanner;

public class ex11_sum {
    public static void main(String[] args) {
//this means when ever we type the total here that time the code is repeat itself


//        int ans =Total2();
//        System.out.println(ans);

        int ans = Total3(45 ,65);
        System.out.println(ans);


    }

//    pass the value of numbers when you are calling the method in main()


    static int Total3(int a, int b){
        int total =a+ b;
        return total;

    }

//    this means return the value
    static int Total2() {
        Scanner in = new Scanner(System.in);

        System.out.println("enter 1st no :");
        int a = in.nextInt();
        System.out.println("enter 2nd no :");
        int b = in.nextInt();

        int total = (a+ b) ;
        return total;
    }

    static void Total(){
        Scanner in = new Scanner(System.in);

        System.out.println("enter 1st no :");
        int a = in.nextInt();
        System.out.println("enter 2nd no :");
        int b = in.nextInt();

        int total = (a+ b) ;
        System.out.println("the ex11_sum = " + total);
    }
}
