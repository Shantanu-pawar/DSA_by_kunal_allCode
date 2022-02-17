package lec4_BinarySearch;

public class ex10_SearchIn_MountainArray {
    public static void main(String[] args) {

//hard ques: https://leetcode.com/problems/find-in-mountain-array/description/

    int [] arr  ={ 1, 2, 3, 5, 6, 4, 3 , 2};
    int ans = MountainArray(arr);
        System.out.println(ans);

}
    static int MountainArray(int [] arr){

        int start  = 0;
        int end  = arr.length -1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;
            }
            else {
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start; // or return end as both are =
    }
}

