package lab7;

public class Task3 {
    static class Car {
        private String brand;
        private String model;
        private int speed;

        Car(String brand, String model) {
            this.brand = brand;
            this.model = model;
            this.speed = 0;
        }

        public void accelerate(int value) {
            if (value > 0) {
                speed += value;
            }
        }

        public void brake(int value) {
            if (value > 0) {
                speed -= value;
                if (speed < 0) {
                    speed = 0;
                }
            }
        }

        public void displayState() {
            System.out.println("Марка: " + brand + ", Модель: " + model + ", Швидкість: " + speed);
        }
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "X5");
        car.accelerate(60);
        car.brake(20);
        car.displayState();
    }
}
