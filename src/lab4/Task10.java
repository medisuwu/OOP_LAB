package lab4;

public class Task10 {
    public static void main(String[] args) {
        printNumbers("Ці числа:", 1, 2, 3, 4, 5);
    }

    public static void printNumbers(String message, int... numbers) {
        System.out.print(message + " ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
