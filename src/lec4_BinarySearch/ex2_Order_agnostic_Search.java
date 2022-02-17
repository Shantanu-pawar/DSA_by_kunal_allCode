package lec4_BinarySearch;

public class ex2_Order_agnostic_Search {
    public static void main(String[] args) {

//        int [] arr = {-18, -12, -4, 0 , 2, 3, 4, 15, 16, 18, 22, 45};
        int [] arr = {99, 87, 45, 23, 15, 8, 2, 0};
        int target = 87;

        int ans = orderAgnostic(arr, target);
        System.out.println(ans);
    }

    static int orderAgnostic(int[] arr, int target) {

        int start = 0;
        int end  = arr.length -1 ;

//        find whether the arrays is shorted is ascending or descending this is the
        // meaning of order agnostic search that we dont know the arrays order

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start) /2 ;

            if(arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if(target < arr[mid]){
                    end = mid -1 ;

                }
                else {
                    start  = mid +1 ;
                }
            }

            else{
                if(target > arr[mid]){
                    end = mid -1 ;

                }
                else{
                    start  = mid +1 ;
                }
            }
        }
        return -1;

    }
}
