package lab5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal, monthlyDeposit, annualRate, totalAmount;
        int years, timesCompounded;

        System.out.print("Введіть початкову суму вкладу (principal): ");
        principal = scanner.nextDouble();

        System.out.print("Введіть місячний платіж: ");
        monthlyDeposit = scanner.nextDouble();

        System.out.print("Введіть річну процентну ставку (у відсотках): ");
        annualRate = scanner.nextDouble();

        System.out.print("Введіть кількість років: ");
        years = scanner.nextInt();

        System.out.print("Введіть кількість нарахувань відсотків на рік: ");
        timesCompounded = scanner.nextInt();

        double rateDecimal = annualRate / 100;

        totalAmount = principal * Math.pow(1 + rateDecimal / timesCompounded, timesCompounded * years);

        totalAmount += monthlyDeposit * (Math.pow(1 + rateDecimal / timesCompounded, timesCompounded * years) - 1) / (rateDecimal / timesCompounded);

        System.out.printf("Підсумкова сума після %d років: $%.2f\n", years, totalAmount);

        scanner.close();
    }
}
