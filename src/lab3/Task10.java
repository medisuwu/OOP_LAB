package lab3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        Set<Integer> duplicates = new HashSet<>();

        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicates.add(arr[i]);
                }
            }
        }

        System.out.println("Дублікати в масиві: " + duplicates);
    }
}
