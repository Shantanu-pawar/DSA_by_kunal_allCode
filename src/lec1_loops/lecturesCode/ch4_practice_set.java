package lec1_loops.lecturesCode;

import java.util.Scanner;

public class ch4_practice_set {
    public static void main(String[] args) {

//
////        question 2: Write a noteForYouuu to find out whether a student is pass or fail; if it requires a total
//          of 40%  and at least 33% in each subject to pass. Assume 3 subjects and take marks as input from the user.
//
//        System.out.println("enter your marks in maths");
//        Scanner sc= new Scanner (System.in);
//        int a1= sc.nextInt();
//
//        System.out.println("enter your marks in science");
//        int a2= sc.nextInt();
//
//        System.out.println("enter your marks in physics");
//        int a3= sc.nextInt();
//
//        System.out.println("this is your percentage");
//
//        float total=(a1+a2+a3)/3.0f;
//        System.out.println(total);
//
//        if(total>=40 && a1>=33 && a2>=33 && a3>=33){
//            System.out.println("congos you have been promoted");
//        }
//        else{
//            System.out.println("try again letter");
//        }


        //question 3: Calculate income tax paid by an employee to the government as per the slabs mentioned below:
        //
        //Income Slab	Tax
        //2.5L – 5.0L  	5%
        //5.0L – 10.0L 	20%
        //Above 10.0L	30%
//        Note that there is not tax below 2.5L. Take the input amount as input from the user


//        Scanner in = new Scanner (System.in);
//        int salary = in.nextInt();
//
//        if(salary < 250000){
//            System.out.println("you dont have to pay tax");
//        }
//        else if(salary >= 250000 && salary <= 500000){
//            System.out.println(salary * 0.05);
//        }
//        else if(salary >= 500000 && salary <= 1000000){
//            System.out.println(salary * 0.20 + " is the total tax amount u have to paid");
//        }else{
//            System.out.println(salary * 0.3 + " is the total tax u amount have to paid");
//        }



////        question 4 :Write a Java noteForYouuu to find out the day of the week given the number
//                      [1 for Monday, 2 for Tuesday … and so on!]

//        Scanner sc= new Scanner (System.in);
//        int day = sc.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wednesday");
//            case 4 -> System.out.println("thursday");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }

//            question 6:find which type of website this is !?

            Scanner sc = new Scanner(System.in);
            String website = sc.next();

            if (website.endsWith(".com")){
                System.out.println("it is commercial website");
            }
            else if (website.endsWith(".org")){
                System.out.println("it is organisational website");
            }
            else if (website.endsWith(".in")){
                System.out.println("it is indian website");
            }
            else {
                System.out.println("This is not proper website");
            }



        }
    }


