
import java.util.*;

public class single_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //    System.out.print("Enter the size of array : ");
        //    int n = sc.nextInt();
        int[] arr = {1, 2, 3, 4, 5};
        int i;
        //    System.out.print("Enter the elements if an array : ");
        //    int n = sc.nextInt();
        for (i = 0; i < arr.length; i++) {
            System.out.println("Array Elements : " + arr[i]);
        }
        sc.close();
    }
}
