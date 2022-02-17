package lec1_loops.lecturesCode;

public class ch5_loops_Whileloop {
    public static void main(String[] args) {
//       while loop ;do_while loop ;  for loop .

        System.out.println("using loops ");
        int i = 1;
        while( i<=10){
            System.out.println(i);
            i++;
        }
        System.out.println("here is finishing point");

//        this is for gap between two codes
        System.out.println();

//        quiz : run the numbers between 100 to 200 in while loop

        int a = 100;

        while (a>=100 && a<=200){
            System.out.println(a);

            ++a;
        }


    }
}
