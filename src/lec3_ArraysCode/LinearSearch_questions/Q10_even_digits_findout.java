package lec3_ArraysCode.LinearSearch_questions;

public class Q10_even_digits_findout {
    public static void main(String[] args) {
        /*
        Que :  findout how many even digits number in the perticular array and
                then print that number

                https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

        Q3_Search_In_Arrays arr= {34 ,44 ,67 ,78 ,3}
        so here ans = 3
         */

        int [] nums = {12, 345, 5, 6, 8896};

        System.out.println(findNums(nums));


//        if i want to findout and run digit example then this code
//        this will be print out how many numbers you have that in the above box input

        System.out.println(digits2(-1234564839));


    }
    static int findNums(int [] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)){
                count   ++;
            }
        }
        return count ;
    }

//    function to check whether a number contains even digits or not
    static boolean even(int num){

        int numberOfDigit= digits(num);
        if (numberOfDigit % 2 == 0){
            return true;
        }
        return false;
    }

//    2nd way to find digits shortcut formula that explain in DSA
    static int digits2(int num){


//        basically this both conditions is for 1st one is measure -nums also and zeros also
        if( num < 0 ){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        return (int)(Math.log10(num)) + 1 ;
    }

    //    1st way to find digits count number of digits in a number

    static int   digits (int num){

        if( num < 0 ){
            num = num * -1;
        }

        if(num == 0){
            return 1;
        }

        int count = 0;

        while (num >0 ){
            count++;
            num = num / 10 ; // OR  num/= 10
        }
        return count;
    }
}
