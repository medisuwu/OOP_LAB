package lab8;

public class Task2 {
    static class Vehicle {
        protected int speed;

        public void showSpeed() {
            System.out.println("Швидкість: " + speed);
        }
    }

    static class Car extends Vehicle {
        public void accelerate() {
            speed += 10;
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.accelerate();
        car.showSpeed();
        car.accelerate();
        car.showSpeed();
    }
}
