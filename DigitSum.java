
import java.util.*;

public class DigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int lastdig, sum = 0;

        while (n > 0) {
            lastdig = n % 10;
            sum = sum + lastdig;
            n = n / 10;
        }

        System.out.println("Sum of digits : " + sum);
        sc.close();
    }
}
