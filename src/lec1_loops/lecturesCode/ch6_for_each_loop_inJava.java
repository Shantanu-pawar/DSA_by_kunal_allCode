
package lec1_loops.lecturesCode;
public class ch6_for_each_loop_inJava {
    public static void main(String[] args) {
//        int []marks = {45,42,65,456,78,45};

////we can make float also using this array,
//        float  []marks = {45.45f,42.488f,65.78f,45.776f,78,45};
//        System.out.println(marks[2]);
//
//
//        System.out.println("here is your entry marks length of data");
//        System.out.println(marks.length);
//
//
//        String [] students = {"shantanu", "rohit ","ankit ", "raja banks","aashish","rohan"};
//        System.out.println(students[2]);


        int [] marks = {1,2,3,4,5};
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);


//        Desplaying the Arrays

        System.out.println("");
        System.out.println("Print using FOR loop ");
        for(int i=0 ; i<marks.length; i++) {
            System.out.println(marks[i]);
        }

//        Quiz: write java Program to print the arrays in reverse orders


        System.out.println();
        System.out.println("Print using FOR loop in reverse now;");

        for(int a = marks.length -1 ; a >=0 ; a--){
                System.out.println(marks[a]);
        }
//            Quiz: write java Program to print the arrays in For_each loop

            System.out.println("this is for_each loop");

            for(int element : marks){
            System.out.println(element);
            }

    }
}
