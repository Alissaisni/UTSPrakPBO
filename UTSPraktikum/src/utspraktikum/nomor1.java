package utspraktikum;

import java.util.Scanner;

public class nomor1 {
    public static boolean isThreeDigitNumber(int number) {
        return number >= 100 && number <= 999;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
    
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan tiga digit integer: ");
        int bilangan = scanner.nextInt();

        if (isThreeDigitNumber(bilangan)) {
            if (isPalindrome(bilangan)) {
                System.out.println(bilangan + " adalah palindrom");
            } else {
                System.out.println(bilangan + " bukan palindrom");
            }
        } else {
            System.out.println("Harap masukkan bilangan dengan tiga digit.");
        }

        scanner.close();
    }

}
