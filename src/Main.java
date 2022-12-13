public class Main {
    public static void main(String[] args) {

        //Declare the variable 't' and 'f' for the boolean expression 'c'
        boolean t = false;
        boolean f = true;
        boolean a = 2 <= 2 && !true; // first condition is true but the second is false, so final result is false
        boolean b = !false && 3 > 2; // !false is equal to true and 3 > 2 is also true, so final result is true
        boolean c = !(!t || f); // double negation of 't' is false and negation of 'f' is flse too, final result false
        boolean d = 6 > 6 ^ !(true && true); // first condition is false and second too, final result false


        System.out.println("A : false " + a);
        System.out.println("B: true " + b);
        System.out.println("C: false " + c);
        System.out.println("D: false " + d);
    }
}