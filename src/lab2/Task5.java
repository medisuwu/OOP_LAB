import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        String input = scanner.nextLine();

        System.out.println("Довжина рядка: " + input.length());
        System.out.println("Перший символ: " + input.charAt(0));
        System.out.println("Останній символ: " + input.charAt(input.length() - 1));
        System.out.println("Верхній регістр: " + input.toUpperCase());
        System.out.println("Нижній регістр: " + input.toLowerCase());
        System.out.println("Підрядок: " + input.substring(0, 3));
        System.out.println("Чи містить слово \"Java\"? " + input.contains("Java"));
    }
}
