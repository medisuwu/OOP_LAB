package lab6;

public class Task1 {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void introduce() {
            System.out.println("Привіт, мене звати " + name + ", мені " + age + " років.");
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Даша", 17);
        person.introduce();
    }
}
