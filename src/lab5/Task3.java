package lab5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        String operator;

        System.out.print("Введіть перше число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введіть оператор (+, -, *, /, ^): ");
        operator = scanner.next();

        System.out.print("Введіть друге число: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.printf("Результат: %.2f\n", result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("Результат: %.2f\n", result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("Результат: %.2f\n", result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Помилка: Ділення на нуль!");
                } else {
                    result = num1 / num2;
                    System.out.printf("Результат: %.2f\n", result);
                }
                break;
            case "^":
                result = Math.pow(num1, num2);
                System.out.printf("Результат: %.2f\n", result);
                break;
            default:
                System.out.println("Помилка: Некоректний оператор!");
                break;
        }

        scanner.close();
    }
}
