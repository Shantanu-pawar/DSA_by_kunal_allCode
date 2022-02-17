package lec3_ArraysCode.lectures;

public class ch4_ColNoFixed_Input {
    public static void main(String[] args) {

        int[][] arr = {
                {23, 34 ,23 ,55},
                {1, 4, 56, 4, 3, 6},
                {45 ,4},
                {2}
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
