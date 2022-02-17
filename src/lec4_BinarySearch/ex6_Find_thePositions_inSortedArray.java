package lec4_BinarySearch;

// this is Leetcode question ask in facebook interview
// and for open the link just ctrl and click

//    https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


public class ex6_Find_thePositions_inSortedArray {
    public static void main(String[] args) {

    int [] arr  = {1, 2, 3, 4, 4, 4, 4, 8, 8, 9};
    int target = 4;



    }

    public int[] SearchRange(int [] nums, int target){

//        check for first occurrence of target first
        int [] ans = {-1 ,-1};
        int start  = search(nums , target ,true);
        int end = search(nums , target , false);

        ans[0] = start;
        ans[1] = end ;

        return ans;
    }

//    this function is just return the index value of target
    int search (int [] nums , int target , boolean findStartIndex){

        int ans  = -1 ;
        int start  = 0;
        int end  = nums.length -1 ;

        while (start <= end){
            int mid  = start + (end - start)/2;

            if (target < nums[mid]){
                end = mid -1 ;

            }else if(target > nums[mid]){
                start  = mid + 1;

            }else{
//                potential answer is found
                ans =  mid;
                if (findStartIndex){
                    end = mid -1;
                }
                else   {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
