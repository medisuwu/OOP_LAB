package lab4;

public class Task11 {
    public static void main(String[] args) {
        int max = findMax(1, 5, 8, 3, 9, 4);
        System.out.println("Максимальне число: " + max);
    }

    public static int findMax(int... numbers) {
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
