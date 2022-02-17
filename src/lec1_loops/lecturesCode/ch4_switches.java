package lec1_loops.lecturesCode;

import java.util.Scanner;

public class ch4_switches {
    public static void main(String[] args) {

        int age=25;
        System.out.println("enter your age : ");

        Scanner sc= new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("you are hot");
                break;
            case 19:
            System.out.println("you are going to gym right now");
            break;
                case 20:
            System.out.println("you are going to join job");
            break;
            default:

//                now this applies to other defaults
                System.out.println("enjoy your life");


        }

    }
}
