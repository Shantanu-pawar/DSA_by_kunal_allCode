package lec3_ArraysCode.lectures;

import java.util.ArrayList;
import java.util.Scanner;

public class ch6_multidimentionalArraylist {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        ArrayList <ArrayList <Integer> >list = new ArrayList<>();

//        initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

//        add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);

//        note: when we change into elements like in I and J
//        so there is multiply and then decide that how many arrays get filled

    }
}
