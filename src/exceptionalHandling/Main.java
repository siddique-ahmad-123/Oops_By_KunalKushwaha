package exceptionalHandling;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 3;
            int b = 0;

            // Custom check
            if (b == 0) {
                throw new MyException("Cannot divide by zero");
            }

            int c = divide(a, b);
            System.out.println(c);
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        } finally {
            System.out.println("always execute");
        }
    }

    static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("please do not use 0");
        }
        return a / b;
    }
}
