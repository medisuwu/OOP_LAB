package lab9;

public class Task2 {
    static class Animal {
        public void makeSound() {
            System.out.println("Some animal sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Bark");
        }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Dog() };
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
