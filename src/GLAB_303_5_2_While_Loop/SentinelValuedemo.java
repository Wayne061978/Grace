package GLAB_303_5_2_While_Loop;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Controlling a Loop with a Sentinel Value
 *
 * Write a program that reads and calculates the sum of an unspecified number of integers. The input 0 signifies the end of the input.
 * If data is not 0, it is added to the sum, and the next input data are read. If data is 0, the loop body is not executed, and the while loop terminates.
 * If the first input read is 0, the loop body never executes, and the resulting sum is 0.
 */
public class SentinelValuedemo {
    public static void main(String[] args) {
//        create a Scanner
        Scanner input = new Scanner(System.in);
//        Read an initial data
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();
        // Keep reading data until the input is 0
        int sum = 0;
        while(data != 0){
            sum += data;
            // Read the next data
            System.out.println("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);

    }
}
