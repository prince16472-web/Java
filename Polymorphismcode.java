
class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphismcode {

    public static void main(String[] args) {
        MathOperation obj = new MathOperation();
        System.out.println(obj.add(5, 10));       // Calls int version
        System.out.println(obj.add(5.5, 10.5));   // Calls double version
    }
}
