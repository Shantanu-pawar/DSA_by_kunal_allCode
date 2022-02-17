package lec1_loops.lecturesCode;

public class practice{
    public static void main(String[] args){
//else if ladder

//       this is for looping

//       for (int a=1 ; a<=10; a++){
//           System.out.println(a);
//
//           if (a==6){
//               System.out.println("End the loop");
//               break;
//           }
//       }

           int b=15 ;

           while (b>2){
               System.out.println(b);
               b--;
               if(b==3){
                   System.out.println("end of this loop:");
                   continue;
               }
               System.out.println("shantanu is coder");
           }


    }
}