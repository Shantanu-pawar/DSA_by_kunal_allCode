package lec1_loops.lecturesCode;

import java.util.Scanner;

public class ch4_else_if_ladder {
    public static void main(String[] args) {

//        int age = 40;
//        if (age > 14) {
//            System.out.println("welcome");
//        } else {
//            System.out.println("fuck off bitches");
//        }

//        else if ladder :


//        int age=56;
//        System.out.println("enter your age : ");
//
//        Scanner sc= new Scanner(System.in);
//        age = sc.nextInt();
//
//        if(age>56){
//            System.out.println("you are experienced! ");
//        }
//        else if(age>46){
//            System.out.println("you are semi pro");
//        }
//        else if(age>36){
//            System.out.println("you are semi semi noob");
//        }
//        else{
//            System.out.println("you are Mad ?");
//        }



//        this is the code for user input marks to know the result;

        int marks = 30;

        System.out.print("enter your marks for checking the result :");
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();


        if (marks>=30){
            System.out.println("you'll be passed ");

        }
        else {
            System.out.println("you are fuckin looser  ");
        }

    }
}
