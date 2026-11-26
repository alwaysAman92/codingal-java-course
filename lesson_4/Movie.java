package lesson_4;

import java.util.Scanner;

class Movie {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter movie rating count: ");
        int rating = scn.nextInt();

        String result = (rating > 75000) ? "Out of the world" :
                        (rating > 45000 && rating < 70000) ? "Best" :
                        (rating > 25000) ? "Better" :
                        (rating > 5000) ? "Good" :
                        "Not rated";

        System.out.println("Movie rating: " + result);

        scn.close();
    }
}
