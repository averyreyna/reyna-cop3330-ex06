/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.time.YearMonth;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // inputs 1 and 2 contains the user's age and age in which they'd like to retire, turned into ints
        Scanner input = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int inputAge = Integer.parseInt(input.nextLine());

        Scanner input2 = new Scanner(System.in);
        System.out.print("At what age would you like to retire? ");
        int inputRetireAge = Integer.parseInt(input2.nextLine());

        // these lines do the math for the output and store the current year we are in into a variable
        int retireTime = inputRetireAge - inputAge;
        int getYear = YearMonth.now().getYear();
        int retireYear = getYear + retireTime;

        // to avoid having two output statements, i format the ints back into strings and then print them out
        // in the next line
        String retireTimeOutput = String.format("You have %d years left until you can retire.", retireTime);
        String yearsOutput = String.format("It's %d, so you can retire in %d", getYear, retireYear);

        System.out.println(retireTimeOutput + "\n" + yearsOutput);
    }
}