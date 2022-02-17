package lec2_methodsCode;

import java.util.Arrays;

public class ex9_variable_Arguments {
    public static void main(String[] args) {
//        fun(454,545,434 ,23,676,43);

        multiple(2 ,4 ,"rada" , "lalala", "bhai");

    }   //note: from here you create a function and then called it in the upper block
    //and functions run only one at a time

    static void multiple (int a ,int b , String...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

     static void fun(int ...v){
         System.out.println(Arrays.toString(v));
    }
}
