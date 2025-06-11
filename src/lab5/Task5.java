package lab5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] questions = {
                "Яка столиця України?",
                "Скільки буде 5 + 7?",
                "Яка національна валюта України?"
        };

        String[][] options = {
                {"1. Київ", "2. Львів", "3. Харків", "4. Одеса"},
                {"1. 10", "2. 12", "3. 15", "4. 17"},
                {"1. Євро", "2. Долар", "3. Гривня", "4. Рубль"}
        };

        int[] correctAnswers = {1, 2, 3};

        Scanner scanner = new Scanner(System.in);

        int correctCount = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Введіть номер відповіді: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Правильна відповідь!");
                correctCount++;
            } else {
                System.out.println("Неправильна відповідь!");
            }
            System.out.println();
        }

        System.out.println("Ви відповіли вірно на " + correctCount + " з " + questions.length + " питань.");

        scanner.close();
    }
}
