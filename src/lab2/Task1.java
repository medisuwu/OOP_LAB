import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число є додатнім.");
        } else if (number < 0) {
            System.out.println("Число є від’ємним.");
        } else {
            System.out.println("Число є нулем.");
        }
    }
}
