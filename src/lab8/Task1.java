package lab8;

public class Task1 {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    static class Employee extends Person {
        private double salary;

        public Employee(String name, int age, double salary) {
            super(name, age);
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Олег", 30, 50000);
        System.out.println("Ім’я: " + emp.getName());
        System.out.println("Вік: " + emp.getAge());
        System.out.println("Зарплата: " + emp.getSalary());
    }
}
