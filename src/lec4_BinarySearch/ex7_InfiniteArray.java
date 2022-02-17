package lec4_BinarySearch;

public class ex7_InfiniteArray {

//    ques link :  https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/


    /*
    approach : first here take the box of two elements which consists start and end
    then the question say the array is infinite and you have to find the target in that array
    so here logic is - our that box of two elements is each time multiply by two
    means when target is not found is just goes towards next block which is multiply by 2

    until we get the target this process is run on and on!!
     */


    // let take a example of array assume that our target is present in this array

    public static void main(String[] args) {
        int [] arr = {2, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;

        System.out.println(ans(arr, target));

    }

    static int ans (int [] arr ,int target){
//        first find the range
//        first start with the box of size 2

        int start  = 0;
        int end  =1 ;

//        condition for the target to lie in the range
        while   (target > arr[end]){
            int newStart = end + 1;  // so here basically newStart is temp value

//            double the box value
//            end = previous end + size of box*2

            end  = end + (end - start + 1) * 2;
            start = newStart ;

        }
        return InfiniteArray(arr ,target ,start ,end);
    }

    static int InfiniteArray (int [] arr , int target, int start , int end){
        while(start <= end ){

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
