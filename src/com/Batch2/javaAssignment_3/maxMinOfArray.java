/* 3. Find the max and min number from a given array */

package com.Batch2.javaAssignment_3;
import java.util.Arrays;

public class maxMinOfArray {
    public static void main(String[] args) {
        int [] arrElements = new int [] {2,3,5,5,8,19,14,1};
        Arrays.sort(arrElements);
        System.out.println("Max element is the array is: "+arrElements[arrElements.length-1]);
        System.out.println("Min element is the array is: "+arrElements[0]);
    }
}
