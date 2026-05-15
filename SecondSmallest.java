// public class SecondSmallest {
//     public static void main(String[] args) {

//         int arr[] = {5, 2, 8, 1, 3};
//         int smallest = Integer.MAX_VALUE;
//         int second = Integer.MAX_VALUE;
//         for (int num : arr) {
//             if (num < smallest) {
//                 second = smallest;
//                 smallest = num;
//             } 
//             else if (num < second && num != smallest) {
//                 second = num;
//             }
//         }
//         System.out.println("Second Smallest = " + second);
//     }
// }
// second smallest in java using sorting.
import java.util.Arrays;

public class SecondSmallest {

    public static void main(String[] args) {

        int arr[] = {5, 2, -1, 1, 3};

        Arrays.sort(arr);   // sorting array

        int secondSmallest = arr[1];

        System.out.println("Second Smallest = " + secondSmallest);
    }
}
