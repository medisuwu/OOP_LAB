import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();
        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        System.out.println("println: Ім'я: " + name + ", Вік: " + age);
        System.out.printf("printf: Ім'я: %s, Вік: %d\n", name, age);
    }
}
