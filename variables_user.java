
import java.util.*;

public class variables_user {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the integer number : ");
        int n = sc.nextInt();

        System.out.print("Enter the Float number : ");
        float f = sc.nextFloat();

        System.out.print("Enter the double number : ");
        double d = sc.nextDouble();

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        sc.nextLine(); // buffer clear

        System.out.print("Enter a character : ");
        char ch = sc.nextLine().charAt(0);

        System.out.print("Enter the Boolean value (true/false): ");
        boolean b = sc.nextBoolean();

        // System.out.println("\n--- OUTPUT ---");
        System.out.println("Integer value : " + n);
        System.out.println("Float value : " + f);
        System.out.println("Double value : " + d);
        System.out.println("String value : " + str);
        System.out.println("Character value : " + ch);
        System.out.println("Boolean value : " + b);

        sc.close();
    }
}
