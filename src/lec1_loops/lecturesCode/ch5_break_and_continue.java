package lec1_loops.lecturesCode;

public class ch5_break_and_continue {
    public static void main(String[] args) {
//        now we going to see break and continue

//        for(int a=0 ; a <5 ; a++){
//            System.out.println(a);
//            System.out.println("java is Great");
//
//            if (a==4 ){
//                System.out.println("ending the loop");
//                break;
//            }
//        }

//        see this example in while loop

//        int i=0;
//        while(i<=10){
//            System.out.println(i);
//            System.out.println("java is Great");
//            i++;
//
//            if(i==4){
//                System.out.println("end of loop");
//                break;
//            }
//        }
//        System.out.println("loop ends here");



//    continue using

        for(int a=0 ; a<=10 ; a++){

            if (a==4 ){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(a);
            System.out.println("java is Great");

        }

    }
}
