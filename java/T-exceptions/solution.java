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

2.
public class Main {
    public static void main(String[] args) {

        try {
            int x = 10;
        }
        catch (ArithmeticException e) { // the code in this block will only run when an exception has been thrown
            System.out.println("An exception occurred: " + e);
        }
        finally { // the code in this block will always run, regardless if an exception was thrown or not
            System.out.println("You are in the finally block!");
        }

    }
}
