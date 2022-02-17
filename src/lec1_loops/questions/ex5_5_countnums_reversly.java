package lec1_loops.questions;

public class ex5_5_countnums_reversly {
    public static void main(String[] args) {
//question : write noteForYouuu for given number and reverse that number:

        int num = 12345678;
        int ans= 0;


        while (num > 0){
            int rem = num % 10;

            num = num / 10; // here we also write as    num /= 10;
            ans = ans *10 + rem;
        }

        System.out.println(ans);
    }
}
