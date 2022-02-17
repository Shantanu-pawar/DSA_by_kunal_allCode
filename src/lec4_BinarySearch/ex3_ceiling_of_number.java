package lec4_BinarySearch;

public class ex3_ceiling_of_number {
    public static void main(String[] args) {
        int [] arr = {2 ,3 , 5, 9, 14, 16, 18};
        int target = 17 ;


        //Ques : let consider the target element is 17 s
        // so we ceiling means we have to find that the exact number is present in array
        // or not if not then try to take the next number after the target which is
        // definately present in that array


        int ans = ceiling(arr ,target);
        System.out.println(ans);

    }

    /*
    return the index smallest number >= target
     */
    static int ceiling(int [] arr , int target){
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
        return start;
    }
}
