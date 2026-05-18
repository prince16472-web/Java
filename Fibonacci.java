
import java.util.*;

public class Fevonacchi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int first = 0, second = 1, next;

        for (int i = 0; i <= n; i++) {
            System.out.println("Fevonacchi Series : " + first);

            next = first + second;
            first = second;
            second = next;
        }
        sc.close();
    }

}
