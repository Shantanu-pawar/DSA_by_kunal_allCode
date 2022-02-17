package lec3_ArraysCode.lectures;
import java.util.Arrays;

/*
question:
swap the numbers with the help of using ArraysPrint

 */
public class ch7_swapQue {
    public static void main(String[] args) {

        int [] arr = {1, 33, 4, 55, 7};
        swap(arr , 1 ,3 );

        System.out.println(Arrays.toString(arr));
    }
    static void swap (int [] arr, int index1 ,int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
