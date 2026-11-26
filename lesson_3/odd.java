
package lesson_3;

import java.util.Scanner;

class odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        String result = (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result);

        scn.close();
    }
}
