package utspraktikum;

import java.util.Scanner;

public class nomor3 {
    public static int reverse(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Masukan bilangan bulat : ");
        int inputNumber = scanner.nextInt();

        // Check if the input number is a palindrome
        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " adalah bilangan palindrom.");
        } else {
            System.out.println(inputNumber + " bukan bilangan palindrom.");
        }
    }
}