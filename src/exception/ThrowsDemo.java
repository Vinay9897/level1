package exception;

public class ThrowsDemo {

    static void method() throws ArithmeticException {
        System.out.println("inside function");
        throw new ArithmeticException("Demo");
    }

    // exception in the main method
    // we are throwing an Arithmetic excetion from the method() function
    public static void main(String[] args) {

        try {
            method();
        } finally {
            System.out.println("Exception caught");
        }
    }
}
