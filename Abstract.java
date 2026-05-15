
abstract class vechile {

    abstract void show();
}

class car extends vechile {

    void show() {
        System.out.println("Car start with key");
    }
}

class scootery extends vechile {

    void show() {
        System.out.println("scootery start with key");
    }
}

public class Abstract {

    public static void main(String[] args) {
        vechile v = new scootery();
        v.show();
    }
}
