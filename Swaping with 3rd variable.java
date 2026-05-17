
public class SwapWithThird {

    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
