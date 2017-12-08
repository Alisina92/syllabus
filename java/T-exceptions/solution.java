1.
public class Main {

    public static void main(String[] args) {

        try {
            int x = 10 / 0; // this will throw an exception since you cannot divide by zero
        }
        catch (ArithmeticException e) {
            System.out.println("An exception occurred: " + e);
        }

    }

}
