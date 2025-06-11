package lab5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice;

        do {
            System.out.println("\nМеню:");
            System.out.println("1. Переглянути поточний баланс");
            System.out.println("2. Внести кошти на рахунок");
            System.out.println("3. Зняти кошти з рахунку");
            System.out.println("4. Завершити роботу програми");
            System.out.print("Виберіть операцію (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    balance = deposit(balance, scanner);
                    break;
                case 3:
                    balance = withdraw(balance, scanner);
                    break;
                case 4:
                    System.out.println("Програма завершена. До побачення!");
                    break;
                default:
                    System.out.println("Невірний вибір, спробуйте ще раз.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.printf("Ваш поточний баланс: $%.2f\n", balance);
    }

    static double deposit(double balance, Scanner scanner) {
        System.out.print("Введіть суму для внесення: $");
        double depositAmount = scanner.nextDouble();
        if (depositAmount > 0) {
            balance += depositAmount;
            System.out.printf("Ви внесли $%.2f. Поточний баланс: $%.2f\n", depositAmount, balance);
        } else {
            System.out.println("Сума внесення повинна бути більшою за 0.");
        }
        return balance;
    }

    static double withdraw(double balance, Scanner scanner) {
        System.out.print("Введіть суму для зняття: $");
        double withdrawAmount = scanner.nextDouble();
        if (withdrawAmount > 0) {
            if (withdrawAmount <= balance) {
                balance -= withdrawAmount;
                System.out.printf("Ви зняли $%.2f. Поточний баланс: $%.2f\n", withdrawAmount, balance);
            } else {
                System.out.println("Недостатньо коштів на рахунку для цієї операції.");
            }
        } else {
            System.out.println("Сума зняття повинна бути більшою за 0.");
        }
        return balance;
    }
}
