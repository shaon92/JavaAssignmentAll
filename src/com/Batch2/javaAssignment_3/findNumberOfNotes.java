/* 5. Find the number of notes from input amount in given array [1000,500,100,50,20,10,5,2] */

package com.Batch2.javaAssignment_3;
import java.util.Scanner;

public class findNumberOfNotes {
    public static void main(String[] args) {
        int[] arrNotes = {1000, 500, 100, 50, 20, 10, 5, 2};
        int amount, note;
        Scanner input = new Scanner(System.in);
        System.out.print("Input Amount: ");
        amount = input.nextInt();
        for (int iterator = 0; iterator < arrNotes.length; iterator++) {
            note = amount / arrNotes[iterator];
            if ((amount > 0) && (note > 0)) {
                System.out.println("Number of " + arrNotes[iterator] + " taka note = " + note);
                amount = amount % arrNotes[iterator];
            }
        }
    }
}
