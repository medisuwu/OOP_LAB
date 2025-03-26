package lab3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість елементів масиву: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int evenCount = 0;

        // Заповнення масиву вручну
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];

            // Обчислення мінімуму та максимуму
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];

            // Обчислення кількості парних чисел
            if (arr[i] % 2 == 0) evenCount++;
        }

        double average = (double) sum / arr.length;

        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + average);
        System.out.println("Кількість парних чисел: " + evenCount);
    }
}

