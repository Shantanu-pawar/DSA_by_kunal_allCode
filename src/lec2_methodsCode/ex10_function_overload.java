package lec2_methodsCode;

/*
in function overloading when we create the two same functions but they
have different variables like int. or String. then this is called function overload
 */

public class ex10_function_overload {
    public static void main(String[] args) {
//        fun(45);
//        fun ("ratan");
        int ans =sum(78 , 7 ,45);
        System.out.println(ans);

    }
//    now this is the case in which both int are running in the ex11_sum method
    static int sum(int a , int b){
        return a + b ;
    }
    static int sum(int a , int b ,int c){
        return a + b +c ;
    }

    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println(name);

    }
}
