
import java.util.*;

public class Count_Digit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            System.out.println(1);
        } else {
            while (n > 0) {
                n /= 10;
                count++;
            }
        }

        System.out.println("Count Of Digit Is : " + count);
        sc.close();
    }
}
