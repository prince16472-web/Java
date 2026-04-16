
public class VariableSwap {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before Swap:");
        System.out.println("a = " + a + ", b = " + b);

        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
