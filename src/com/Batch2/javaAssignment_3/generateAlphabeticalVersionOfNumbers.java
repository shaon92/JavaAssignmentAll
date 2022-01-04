/* 4. Write a program to generate random number from 1 to 10 but print by its alphabetical version. suppose random
number is 3. But it will print Three.Each time you will press enter, it will generate new random numbers from 1-10 and
will show its alphabetical version. */

package com.Batch2.javaAssignment_3;

import java.util.Random;
import java.util.Scanner;

public class generateAlphabeticalVersionOfNumbers {
    public static void main(String[] args) {
        System.out.println("Press 'Enter' to see alphabetical version of a randomly generated number..");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String input = scanner.nextLine();
        while (true) {
            if (input.isEmpty()) {
                switch (random.nextInt(10)) {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    case 10:
                        System.out.println("Ten");
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Wrong Input!!");
            }
            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
            }
        }
    }
}
