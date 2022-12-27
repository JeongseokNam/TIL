
import javaByComparison.fizzBuzz.ConsoleBasedFizzBuzz;
import javaByComparison.fizzBuzz.FizzBuzz;
import programmers.*;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = scan.nextInt();
        FizzBuzz fizzBuzz = new ConsoleBasedFizzBuzz();
        fizzBuzz.print(1,max);
    }
}
