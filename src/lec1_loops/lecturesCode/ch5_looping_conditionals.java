package lec1_loops.lecturesCode;

public class ch5_looping_conditionals {

    public static void main(String[] args) {

//        int salary = 25000;
//        if (salary > 10000){
//            System.out.println(salary + 2000);
//        }
//        else{
//            salary = salary + 1000;
//        }

//        else if else statements (multiple if else)


        int salary = 50000;


        if (salary > 10000) {
            salary += 2000;  // salary = salary + 50
        }
        else if (salary >20000){
            salary += 3000;
        }
        else {
            salary +=1000;
        }
        System.out.println(salary);
    }
}
