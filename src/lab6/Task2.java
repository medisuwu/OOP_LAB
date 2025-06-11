package lab6;

public class Task2 {
    static void procedural() {
        String brand = "Toyota";
        String model = "Corolla";
        int speed = 0;
        speed += 30;
        System.out.println("Марка: " + brand + ", Модель: " + model + ", Швидкість: " + speed);
    }

    static class Car {
        String brand;
        String model;
        int speed;

        Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
            this.speed = 0;
        }

        void accelerate(int increment) {
            speed += increment;
        }

        void printInfo() {
            System.out.println("Марка: " + brand + ", Модель: " + model + ", Швидкість: " + speed);
        }
    }

    public static void main(String[] args) {
        procedural();
        Car car = new Car("Toyota", "Corolla");
        car.accelerate(30);
        car.printInfo();
    }
}
