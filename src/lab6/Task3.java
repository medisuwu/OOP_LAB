package lab6;

public class Task3 {
    static class Animal {
        String name;
        String sound;

        Animal(String name, String sound) {
            this.name = name;
            this.sound = sound;
        }

        void makeSound() {
            System.out.println(name + " видає звук: " + sound);
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Кіт", "мяу"),
                new Animal("Собака", "гав"),
                new Animal("Корова", "му")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
