package lec4_BinarySearch;

public class ex4_floor_of_numbr {

    public static void main(String[] args) {
        int [] arr = {2 ,3 , 5, 9, 14, 16, 18};
        int target = 15 ;


        /*
        Ques : let consider the target element then the floar in the problem means
        find the number in that array which is equal to or lower integer of the target in array
         */


        int ans = floor(arr ,target);
        System.out.println(ans);

    }

    /*
    return the index greatest number <= target
     */
    static int floor(int [] arr , int target){

//        but what if the target is greater than the greatest number in the array

        if(target > arr[arr.length -1]){
            return -1;
        }

        int start = 0;
        int end  = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(target < arr[mid]){
                end  = mid -1 ;

            }else if (target > arr[mid]){
                start  = mid +1 ;

            }else{
                return mid;
            }
        }
        return end;
    }
}
