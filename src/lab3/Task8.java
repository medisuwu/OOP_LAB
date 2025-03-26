package lab3;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};  // Фіксований масив
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число для пошуку: ");
        int searchValue = scanner.nextInt();
        boolean found = false;

        for (int num : arr) {
            if (num == searchValue) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число знайдено!");
        } else {
            System.out.println("Число не знайдено.");
        }
    }
}
