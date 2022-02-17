package lec3_ArraysCode.lectures;

import java.util.ArrayList;
import java.util.Scanner;

public class ch5_arrayList {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        Arraylist
        ArrayList <Integer> list = new ArrayList<>(4);

//        list.add(434);
//        list.add(32);
//        list.add(87);
//        list.add(24);
//        list.add(878);
//        list.add(3);
//
////        here you can also check if this given number is in the list or not
////         so in case if the number is present then it is denoted as true
//        System.out.println(list.contains(87));
//
//        System.out.println(list);
//        list.set(0 , 434734);
//
//        list.remove(3); // this removes basically the integer in the list
//
//        System.out.println(list);
//


//        for taking user input

        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());
        }


        // 1st method of printing the ArrayList :

//        System.out.println(list);



        // 2nd method of printing the ArrayList :

//        get item at any index :
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i));
//            list [index] will not work here
        }


    }
}
