package lec4_BinarySearch;

public class ex5_SmallestLetter {
    public static void main(String[] args) {

//        Que : https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


    }

    public char SmallestLetter(char [] letter , char target){
        int start = 0;
        int end  = letter.length -1;

        while(start <= end){
            int mid = start + (end - start)/2 ;

            if(target < letter[mid]){
                end  = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letter[start % letter.length];
    }
}

