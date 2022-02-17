package lec1_loops.questions;

import java.util.Scanner;

public class how_to_make_userinput_percentages {

    public static void main(String[] args) {
//question : enter your 5 subjects marks and output will be comes
//        in the form of your %tage

        System.out.println("here is your SSC boards MARKS");

        Scanner sc =new Scanner(System.in);

        System.out.println("enter your maths marks :");
        float maths = sc.nextFloat();

        System.out.println("enter your science marks :");
        float science = sc.nextFloat();

        System.out.println("enter your core marks :");
        float core = sc.nextFloat();

        System.out.println("enter your thermo marks :");
        float thermo = sc.nextFloat();

        System.out.println("enter your fluid marks :");
        float fluid = sc.nextFloat();

        System.out.println("this is your percentage");
        float total =(maths+thermo+science+fluid+core)/5;
        System.out.println(total);


    }
}
