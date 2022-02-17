package lec1_loops.lecturesCode;

import java.util.Scanner;

public class ch4_Switch_cases_fruitexample {
    public static void main(String[] args) {

        System.out.print("enter your fruit in this : ");
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();



//        switch (fruit) {
//
//            case "mango" :
//                System.out.println("this is the king of fruit");
//                break;
//
//            case "apple":
//                System.out.println("good for your health ");
//                break;
//
//            case "grapes":
//                System.out.println("this is like green in colour ");
//                break;
//
//            case "cherry":
//                System.out.println("little red balls ");
//                break;
//
//            default :
//                System.out.println("enter the correct type of fruit");
//
//        }



//other wise this code is other way for print this enhanced switch cases code

//        switch (fruit) {
//            case "mango" -> System.out.println("this is the king of fruit");
//            case "apple" -> System.out.println("good for your health ");
//            case "grapes" -> System.out.println("this is like green in colour ");
//            case "cherry" -> System.out.println("little red balls ");
//            default -> System.out.println("enter the correct type of fruit");
//        }


//        int day = in.nextInt();
//
//        switch (day){
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("wed");
//            case 4 -> System.out.println("thrus");
//            case 5 -> System.out.println("friday");
//            case 6 -> System.out.println("saturday");
//            case 7 -> System.out.println("sunday");
//        }

        int day = in.nextInt();
        switch(day){
            case 1,2,3,4,5 -> System.out.println("weekdays ");
            case 6,7 -> System.out.println("weekend");

        }




    }
}
