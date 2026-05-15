
import java.util.*;

public class single_array_user {

    public static void main(String[] args) {
        Scanner bc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = bc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of an array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = bc.nextInt();
        }

        System.out.print("Array's Elements are\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Elements : " + arr[i]);
        }
        bc.close();
    }
}
