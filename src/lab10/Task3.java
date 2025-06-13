interface Flyable {
    void fly();
}

abstract class Bird {
    public void layEggs() {
        System.out.println("Laying eggs...");
    }

    public abstract void makeSound();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }

    @Override
    public void fly() {
        System.out.println("Flying...");
    }
}

public class Task3 {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.makeSound();
        sparrow.layEggs();
        sparrow.fly();
    }
}
