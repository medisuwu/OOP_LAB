package lab2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1: System.out.println("Понеділок"); break;
            case 2: System.out.println("Вівторок"); break;
            case 3: System.out.println("Середа"); break;
            case 4: System.out.println("Четвер"); break;
            case 5: System.out.println("П’ятниця"); break;
            case 6: System.out.println("Субота"); break;
            case 7: System.out.println("Неділя"); break;
            default: System.out.println("Невірне число.");
        }
    }
}
