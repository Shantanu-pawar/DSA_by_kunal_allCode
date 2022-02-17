package lec2_methodsCode;

import java.util.Scanner;

public class ex4_Stringexample {
    public static void main(String[] args) {
//        String message = greet();

        Scanner in = new Scanner(System.in);
        System.out.print("enter your name :");
        String name = in.next();

        String personalise = Mygreet(name);
        System.out.println(personalise);

    }

     static String Mygreet(String name) {
    String message = "hello "+ name;
    return message;
    }


}
