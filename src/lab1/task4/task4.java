import java.util.Scanner;

public class task4 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        System.out.println(isAdult);
    }
}