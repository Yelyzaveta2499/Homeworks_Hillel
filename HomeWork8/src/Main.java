import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         *
         * Create a Java program that performs the following tasks using a one-dimensional array:
         *
         * Create an array of integers with 15 elements.
         * Fill the array with random integers in the range 1 to 100.
         * Output the initial form of the array.
         * Sort the array using the Insertion Sort algorithm in ascending order.
         * Output the sorted array.
         * Ask the user to enter a number to search for in the array.
         * Using the binary search algorithm, find and print the index of the user-entered number in a sorted array, or report if the number does not exist.
         * Upload the completed project to your GitHub repository, and include a link to it in your LMS.
         * Example:
         *
         * Initial array: [45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91]
         *
         * Sorted array: [2, 7, 12, 23, 32, 34, 41, 45, 55, 65, 67, 78, 88, 91, 98]
         *
         * Enter the number to search for: 34 Index of number 34 in sorted array: 5
         *
         */


        Random random = new Random();
        int[] nums = new int[15];
        for (int i = 0; i < 15 ; i++){
            nums[i] = random.nextInt(100)+1;
        }

        System.out.print("Initial array : ");
        for (int i = 0; i < 15; i++){
            System.out.print(nums[i] + " ");

        }


        // Sort the array using the Insertion Sort algorithm in ascending order
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int prev = i - 1;
            while (prev >= 0 && nums[prev] > temp) {
                nums[prev + 1] = nums[prev];
                prev= prev - 1;
            }
            nums[prev + 1] = temp;
        }
        System.out.print("\nSorted array : ");
        for (int i = 0; i < 15; i++){
            System.out.print(nums[i] + " ");

        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to search for: ");
        int target = scanner.nextInt();

        // Perform binary search and print the index or report if the number does not exist
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                System.out.println("We found the number at index" + mid);
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


    }
}