package lab3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 5;
        int userGuess;

        do {
            System.out.print("Вгадайте число: ");
            userGuess = scanner.nextInt();
            if (userGuess != secretNumber) {
                System.out.println("Невірно! Спробуйте ще раз.");
            }
        } while (userGuess != secretNumber);

        System.out.println("Вітаємо! Ви вгадали число.");
    }
}
