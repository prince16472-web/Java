
class transport {

    void move() {
        System.out.println("tansport vechiles can move");
    }

    void fuel() {
        System.out.println("tansport can use fuel");
    }

}

class bus extends transport {

    void move() {
        System.out.println("bus can move in the streets");
    }

    void fuel() {
        System.out.println("bues can use fuel for moving anyware");
    }
}

class train extends transport {

    void move() {
        System.out.println("train can move in the streets with higher speed");
    }

    void fuel() {
        System.out.println("train can use electricity for moving anyware");
    }
}

class aeroplane extends transport {

    void move() {
        System.out.println("Aeroplane can fly in the sky like birds");
    }

    void fuel() {
        System.out.println("Aeroplane uses fuel for moving anyware in the sky");
    }
};

public class overloading {

    public static void main(String[] args) {
        transport t1 = new transport();
        t1.move();
        t1.fuel();

        transport b2 = new bus();
        b2.move();
        b2.fuel();

        transport tr3 = new train();
        tr3.move();
        tr3.fuel();

        transport a1 = new aeroplane();
        a1.move();
        a1.fuel();

    }
}
