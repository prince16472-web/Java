
import java.util.*;

public class Magic_Or_Not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int lastdigit, sum = 0;
        while (n > 0) {
            lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println(+sum);
        if (sum == 1) {
            System.out.println(" A Magic number\n");
        } else {
            System.out.println("Not a Magic number\n");
        }
        sc.close();
    }

}
