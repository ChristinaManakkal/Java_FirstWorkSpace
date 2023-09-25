package question2;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Accept five integers in an array
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter an integer: ");
            n[i] = scanner.nextInt();
        }

        // Step 2: Find maximum and minimum values
        int max = n[0];
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (n[i] > max) {
                max = n[i];
            }
            if (n[i] < min) {
                min = n[i];
            }
        }

        // Step 3: Multiply each element by 5 and store it in another array
        int[] multipliedArray = new int[5];
        for (int i = 0; i < 5; i++) {
            multipliedArray[i] = n[i] * 5;
        }

        // Step 4: Display results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Resulting array after multiplying each element by 5:");
        for (int num : multipliedArray) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}

