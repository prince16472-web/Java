
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter " + n + " Elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int Even = 0;
        int Odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                Even++;
            } else {
                Odd++;
            }
        }

        System.out.println("Even = " + Even);

        System.out.println("Odd = " + Odd);

        sc.close();
    }
}
