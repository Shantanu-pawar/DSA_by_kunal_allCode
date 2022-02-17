package lec3_ArraysCode.LinearSearch_questions;

public class Q9_findout_Richest_person_problem {
    public static void main(String[] args) {

//        question : https://leetcode.com/problems/richest-customer-wealth/description/



    }

    public int maxWealth(int [][] accounts) {
//        person = row
//        account = col

        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
//            when you start a new col ,take a new sum for that row

            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];

            }
            /*
           now we have sum of accounts of person
           check with overall ans
            */

            if(sum > ans){
                ans = sum ;
            }
        }

        return ans;
    }


}
