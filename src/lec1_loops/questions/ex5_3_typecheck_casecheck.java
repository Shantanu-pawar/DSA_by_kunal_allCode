package lec1_loops.questions;

import java.util.Scanner;


public class ex5_3_typecheck_casecheck {
    public static void main(String[] args) {

//que:
// check where the case is lower or upper

        System.out.print("enter your character for identification: ");
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("lower case");
        } else {
            System.out.println("Upper case");
        }
    }

}
