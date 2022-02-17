package lec1_loops.lecturesCode;

public class ch5_practice {
    public static void main(String[] args) {

//        que4_Merge_sorted_Arrays_OnebyOneElement problem:1.0
//        print a star pattern

//        for(int i =7; i>0 ; i--){
//
//            for(int j=0; j<i ; j++){
//                System.out.print("*");
//
//        }
//            System.out.print("\n");
//        }

//        1.1 user input pattern
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your triangle numbers ");
//        int n=sc.nextInt();
//        for (int a =n; a>0 ; a--){
//            for (int j = 0; j<a ; j++){
//                System.out.print("&");
//            }
//            System.out.print("\n");
//        }
//        System.out.println("FINISH");



//        que4_Merge_sorted_Arrays_OnebyOneElement problem 2
//        sum first even numbers using for loop and take input from users

//        Scanner sc = new Scanner(System.in);
//        int sum =0;
//        System.out.print("Give Me Input : ");
//        int a = sc.nextInt();
//        for (int n= 0; n<=a; n++) {
//            sum = sum + (2*n);
//        }
//        System.out.print("here is your sum : ");
//        System.out.println(sum);


//        question 3:do the table of any numbers by using user input

//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your number here for tables");
//        int n = sc.nextInt(); ;
//
//        for(  int a =1; a<=10 ; a++ ){
//            System.out.printf("%d X %d = %d\n", n,a , n*a);
//
//            note:%D means the input that we have to enter
//            and there is backslash N for the next line
//        }

//        question 4:write a noteForYouuu to find factorial of given
//        number using while loop

//        find the factorial 5! = 5*4*3*2*1

//        int n=5;
//        int i=1;
//        int factorial=1 ;
//
//        while (i<=n){
//            factorial *=i;
//            i++;
//
//        }
//        System.out.println(factorial);


//            question 5: do question 1st replace for loop with while loop that is the excercise

//question 8:
//         ans:true


//        problem 9:

        int n= 8 ;
        int sum = 0;

        for (int i=1;i<=10; i++){
            sum+= n*i;
        }
        System.out.println(sum);

//        problem 10:
//        ans: at least once

//        problem 11:
//        repeat by replacing for to while loop
        
    }
}
