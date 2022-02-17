package lec4_BinarySearch;

public class ex1_binarySrch {

    public static void main(String[] args) {

        int [] arr = {-18, -12, -4, 0 ,2, 3, 4,15, 16, 18, 22, 45};
        int target  = 18 ;
        int ans= binarySearch( arr ,target);
        System.out.println(ans);

    }
    /*
    return the index
    return -1 if it does not exist
     */
    static int binarySearch (int [] arr , int target){
        int start = 0;
        int end  = arr.length-1 ;

       while(start <= end ){
//           find middle element
//           int mid = (start  + end ) / 2;
//           might be possible that the (start + end) we doing exceeds the range of int in java so we have errors

           int mid = start + (end - start) / 2;

           if(target < arr[mid]) {
               end  = mid -1 ;
           }
           else if(target > arr[mid]){
               start = mid + 1 ;
           }
           else{
//               ans found:
               return mid;
           }
       }
       return  -1;
    }
}
