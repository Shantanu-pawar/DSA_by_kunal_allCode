package lec3_ArraysCode.lectures;
import java.util.Arrays;
import java.util.Scanner;

public class ch1_Arrays_of_objects {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

/*
        arrays of objects :
        basically in this case we have to change the array from extercally
 */

        String[] str = new String [4];
        for (int i = 0; i < str.length ; i++){
            str [i] = in.next();
        }
        System.out.println(Arrays.toString(str));


//        for (int i  =0 ; i< str.length ; i++){
//            System.out.print(str[i] + " ");
//        } // hide this cause for modify they dont need this



//        modify
        str [0] = "rajubaba ki jaiii";// In this Str is reference variable that we change according

        System.out.println(Arrays.toString(str));

    }
}
