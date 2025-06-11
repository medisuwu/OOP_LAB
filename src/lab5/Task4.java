package lab5;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int numDice;
        int totalSum = 0;

        System.out.print("Введіть кількість кубиків для кидання: ");
        numDice = scanner.nextInt();

        if (numDice <= 0) {
            System.out.println("Кількість кубиків повинна бути більше нуля!");
        } else {
            for (int i = 1; i <= numDice; i++) {
                int roll = random.nextInt(6) + 1;

                System.out.println("Кидок " + i + ":");
                print(roll);

                totalSum += roll;
            }

            System.out.println("\nЗагальна сума всіх кидків: " + totalSum);
        }

        scanner.close();
    }

    static void print(int roll) {
        switch (roll) {
            case 1:
                System.out.println(" ----- ");
                System.out.println("|     |");
                System.out.println("|  *  |");
                System.out.println("|     |");
                System.out.println(" ----- ");
                break;
            case 2:
                System.out.println(" ----- ");
                System.out.println("|*    |");
                System.out.println("|     |");
                System.out.println("|    *|");
                System.out.println(" ----- ");
                break;
            case 3:
                System.out.println(" ----- ");
                System.out.println("|*    |");
                System.out.println("|  *  |");
                System.out.println("|    *|");
                System.out.println(" ----- ");
                break;
            case 4:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|     |");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
            case 5:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|  *  |");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
            case 6:
                System.out.println(" ----- ");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println("|*   *|");
                System.out.println(" ----- ");
                break;
        }
    }
}
