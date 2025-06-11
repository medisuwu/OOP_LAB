package lab2;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть мінімальне значення: ");
        int min = scanner.nextInt();
        System.out.print("Введіть максимальне значення: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.printf("Згенероване число: %d\n", randomNumber);
        String result = (randomNumber % 2 == 0) ? "Парне" : "Непарне";
        System.out.printf("Число є: %s\n", result);
    }
}
