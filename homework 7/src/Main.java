import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        Random random = new Random();

        // Заповнення масиву випадковими числами від -100 до 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(201) - 100;
        }

        System.out.println("Елементи масиву: " + Arrays.toString(numbers));

        // Знайдіть та виведіть суму всіх від'ємних чисел в масиві.
        int sumNegative = 0;
        for (int num : numbers) {
            if (num < 0) {
                sumNegative += num;
            }
        }
        System.out.println("Сума від'ємних чисел: " + sumNegative);

        // Знайдіть та виведіть кількість парних і непарних чисел в масиві.
        int evenCount = 0;
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Кількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);

        // Знайдіть найбільший та найменший елементи масиву та їхні індекси.
        int min = numbers[0], max = numbers[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }
        }
        System.out.println("Найменший елемент: " + min + " (з індексом " + minIndex + ")");
        System.out.println("Найбільший елемент: " + max + " (з індексом " + maxIndex + ")");

        // Знайдіть і виведіть середнє арифметичне чисел, розташованих після першого від'ємного числа у масиві (або повідомте, якщо від'ємних чисел немає).
        int firstNegativeIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1 || firstNegativeIndex == numbers.length - 1) {
            System.out.println("Від'ємних чисел немає або вони останні в масиві.");
        } else {
            double sum = 0;
            int count = 0;
            for (int i = firstNegativeIndex + 1; i < numbers.length; i++) {
                sum += numbers[i];
                count++;
            }
            double average = sum / count;
            System.out.printf("Середнє арифметичне чисел після першого від'ємного числа: %.2f\n", average);
        }
    }
}
