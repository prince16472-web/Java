
class Locker {

    private boolean isOpen = false;
    private final String pin = "1234";

    public void openLocker(String enterPin) {
        if (enterPin.equals(pin)) {
            isOpen = true;
            System.out.println("Locker opened successfully");
        } else {
            System.out.println("Incorrect PIN");
        }
    }

    public void checkStatus() {
        if (isOpen) {
            System.out.println("Locker is open");
        } else {
            System.out.println("Locker is closed");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Locker A = new Locker();
        A.checkStatus();
        A.openLocker("1111");
        A.openLocker("1234");
        A.checkStatus();
    }
}
