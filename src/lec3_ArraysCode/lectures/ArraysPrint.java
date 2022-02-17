package lec3_ArraysCode.lectures;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysPrint {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//	 creating arrays of perimetives

//        method 1: which is directly print arrays without making
//          seperate datatype


//        int [] student = {45 , 64 ,456 ,45 ,345, 435, 345 ,3};
//        System.out.println(student[6]);

//   method 2:

//        int [] arr = new int[1];
//        arr [0] = 34 ;
//        arr [1] = 23 ;
//        arr [2] = 67 ;
//        arr [3] = 345 ;
//        System.out.println(arr[2]);


//        method 3: input by using loops



        int [] arr = new int[4];

        for (int i = 0; i <arr.length ; i++) {
            arr [i] = in.nextInt();
        }
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i] + " ");
//        }

        System.out.println(Arrays.toString(arr));


//
    }

}

