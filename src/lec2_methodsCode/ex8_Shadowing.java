package lec2_methodsCode;

public class ex8_Shadowing {
    static int x = 78; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // this will be print 78


/*

and scope will begin only when the value is initialised
shadowing is doesn't work for methods it only work for class veriables

 */

        int x = 3478; // this will be print 3478
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
