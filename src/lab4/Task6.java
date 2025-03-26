package lab4;

public class Task6 {
    public static void main(String[] args) {
        // Викликаємо метод printNumber() в main
        printNumber();

        // Спробуємо вивести змінну num у main()
        // Це викликає помилку, оскільки змінна num є локальною змінною в методі printNumber().
        // Вона існує лише в межах цього методу і недоступна в main().
        // Тому тут виникає помилка компіляції - num не може бути знайдена в main().

        // Ось спроба вивести num:
        // System.out.println(num); // num не доступна в main
    }

    public static void printNumber() {
        // Локальна змінна num
        int num = 10;
        // Виведення значення змінної num
        System.out.println("Значення num: " + num);
    }
}

