package Practice.Exceptions;

import java.util.*;

public class Main {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your age to begin: ");
        int age = scanner.nextInt();
        if (age < 18) {
            throw new RuntimeException("Access Denied - You are too young for this.");
        } else {
            System.out.println("Access granted - Wellcome to the Show!");
        }

        try {
            int[] numbers = {1, 2, 3};
            System.out.print("Type a number to search in Array: ");
            int x = scanner.nextInt();
            System.out.println("The number found is " + numbers[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The size of number is large than that of the Array");
        }

    }
}
