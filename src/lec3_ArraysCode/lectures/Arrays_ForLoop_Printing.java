package lec3_ArraysCode.lectures;

public class Arrays_ForLoop_Printing {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6,7 , 6 };

        for (int i = 0; i < arr.length; i++) {
            System.out.println("elements of index "+ i + " : " +arr[i]);

        }
    }
}
