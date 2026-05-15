
import java.util.*;

public class Multiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int T;
        for (int i = 1; i <= 10; i++) {
            T = n * i;
            System.out.println(n + " * " + i + " = " + T);
        }
        sc.close();
    }
}
