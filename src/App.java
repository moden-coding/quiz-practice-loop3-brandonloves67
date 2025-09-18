
/**
 *  Write code that reads a series of test scores (as integers) from the user until the user 
 *  enters -1. The test scores should be in a range from 0 to 100. If the user enters an invalid number
 *  tell them to re-enter the value. Keep track of the number of passing and failing test grades. Assume 
 *  that a failing grade is below a 60. When the user enters '-1', print out the number of passing and failing students.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your test scores: ");

        int pass = 0;
        int fail = 0;

        while (true) {
            int score = Integer.valueOf(scanner.nextLine());
            if (score == -1) {
                break;

            }

            if (score > 100 || score < 0) {
                System.out.println("Invalid numbers");

                continue;
            }
            if (score <= 60) {
                    fail++;
                }
                if (score > 60) {
                    pass++;

                }


        }
        System.out.println("Number of passing: " + pass);
        System.out.println("Number of failing: " + fail);
    }
}
