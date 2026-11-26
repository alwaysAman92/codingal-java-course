package lesson_6;

import java.util.Scanner;

class rotated {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        int lastDigit = num % 10;
        int remaining = num / 10;

        int digits = String.valueOf(remaining).length();

        int rotated = lastDigit * (int) Math.pow(10, digits) + remaining;

        System.out.println("Rotated number: " + rotated);

        scn.close();
    }
}

