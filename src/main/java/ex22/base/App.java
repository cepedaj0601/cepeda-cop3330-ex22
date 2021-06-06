package ex22.base;
/*
 *  UCF COP3330 Summer 2021 Exercise 22 Solution
 *  Copyright 2021 Justin Cepeda
 */

/*
Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not
different, then exit the program. Otherwise, display the largest number of the three.

Example Output
Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.
Constraint
Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.
Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s
already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */

import java.util.Scanner;

import static java.lang.System.exit;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = in.nextInt();

        System.out.println("Enter the second number: ");
        int number2 = in.nextInt();

        System.out.println("Enter the third number: ");
        int number3 = in.nextInt();

        if (number1 == number2 || number1 == number3 || number2 == number3) {
            exit(0);
        }

        int output = 0;

        if (number1 > output){
            output = number1;
        }

        if (number2 > output){
            output = number2;
        }

        if (number3 > output){
            output = number3;
        }

        System.out.println("The largest number is " + output + ".");
    }
}
