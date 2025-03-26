package lab3;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть індекс елемента для зміни: ");
        int index = scanner.nextInt();
        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();

        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
            System.out.println("Масив після зміни:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Невірний індекс!");
        }
    }
}
