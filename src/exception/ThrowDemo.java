package exception;

public class ThrowDemo {
    // it is used to throw the exception
    //
    static void method() {
        try {
            throw new ArithmeticException("Demo");
        } catch (ArithmeticException e) {
            System.out.println("caught Exection");
        }

    }

    public static void main(String[] args) {
        method();
    }
}
