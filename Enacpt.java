
class Locker {

    private int pin = 1234;
    private boolean isopen = false;

    public void openLocker(int Enterpin) {
        if (pin == Enterpin) {
            isopen = true;
            System.out.println("Locker is opened");
        } else {
            isopen = false;
            System.out.println("Wrong pin");
        }
    }

    public void checkstatus() {
        if (isopen) {
            System.out.println("Locker opened");
        } else {
            System.out.println("Locker is locked");
        }
    }

}

public class Encapt {

    public static void main(String[] args) {
        Locker A = new Locker();
        A.checkstatus();
        A.openLocker(1111);
        A.openLocker(1234);
        A.checkstatus();
    }
}
