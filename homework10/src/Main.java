import java.awt.desktop.SystemEventListener;
import java.time.chrono.JapaneseChronology;
import java.util.Scanner;

public class Main {


    public static double square(int num){
        return num * num;
    }

    // 2. Volume of a cylinder
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // 3. Sum of array elements
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


    public static String reverString(String input){
        String revString= "";

        for (int i= input.length()-1; i >= 0; i--){
            revString += input.charAt(i);
        }

        return revString;
    }

    public static double power(int a, int b){
        return Math.pow(a,b);
    }

    public static void printer(int n, String text){
        for (int i=0; i<n; i++){
            System.out.println(text);
        }
    }


    public static void main(String[] args) {

        //task1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int userInput = scanner.nextInt();
        System.out.println(" the square of the number 5: " + square(userInput));

        // Task 2
        System.out.print("\n Input radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Input height: ");
        double height = scanner.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("Volume of cylinder with radius " + radius + " and height " + height + " = " + volume);

        // Task 3
        System.out.println("\n Array of numbers: [10, 20, 30, 40, 50]");
        int[] array = {10, 20, 30, 40, 50};
        int sum = sumArray(array);
        System.out.println("Sum of all elements in the array: " + sum);


        //task 4
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the word to reverse it: ");
        String scannerString = scanner1.nextLine();
        //Liza -> azil
        System.out.println( "the reversed of " + scannerString + " is: " + reverString(scannerString));

        //task 5
        System.out.println("Calculate the power of numbers: ");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = scanner2.nextInt();
        System.out.println("Enter number 2: ");
        int b = scanner2.nextInt();
        System.out.println("a to the power of b is: " + power(a,b));

        //task6
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter text to repeat it: ");
        String text = scanner3.nextLine();
        System.out.println("Enter a number of times to repeat text: ");
        int n = scanner3.nextInt();
        printer(n, text);
    }

}