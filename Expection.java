
public class Exception {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {          // Try will find the exception
            int result = a / b;  // This gives exception
        } catch (ArithmeticException e) {   // catch will solve the exception
            System.out.println("Invalid entry");
        } finally {       // whatever you will write and shows always can run
            System.out.println("Enter value > 0");
        }
    }
}
