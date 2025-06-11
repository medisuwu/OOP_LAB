package lab1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть довжину прямокутника: ");
        double length = scanner.nextDouble();
        System.out.print("Введіть ширину прямокутника: ");
        double width = scanner.nextDouble();
        double area = length * width;
        System.out.println("Площа прямокутника: " + area);

        scanner.close();
    }
}