// A simple Java program to print the Fibonacci series up to 7 terms
package week1;

//public is the access modifier. It allows the class to be accessible from other classes.
public class FibonacciSeries {
    /**
     * The main method is the entry point of any Java program. Static means it can
     * be called without creating an instance of the class.
     * args is an array of strings that stores command-line arguments. Here, it is
     * not used.
     */
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= 7; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    }
}