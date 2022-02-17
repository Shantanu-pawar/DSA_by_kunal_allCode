package lec3_ArraysCode.LinearSearch_questions;

import java.util.Arrays;

public class Q2_SearchIn_Strings {
    public static void main(String[] args) {
        String name = "shantanu";
        char target = 'a';

//       Ques1:  searching of array like if char is consist in the string
        // then it identifies true or false

        System.out.println(search(name , target));

//       Ques2: building of character array for output

        System.out.println(Arrays.toString(name.toCharArray()));


    }
//    this is for true or false identification

    static boolean search2 (String str , char target){
        if(str.length()==0){
            return false;
        }
        for(char ch: str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }


    static boolean search (String str , char target){
        if(str.length()==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
