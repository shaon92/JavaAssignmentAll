/* 2. Write a program to find if any element is duplicate. If duplicate, show the value. */

package com.Batch2.javaAssignment_3;

public class findDuplicateElementInArray {
    public static void main(String[] args) {
        int [] arrElements = new int [] {1,1,2,3,5,5,8,9,14,14};
        boolean duplicateFlag = false;
        System.out.print("Duplicate element(s) in the given array: ");
        for(int iterator1 = 0; iterator1 < arrElements.length; iterator1++) {
            for(int iterator2 = iterator1 + 1; iterator2 < arrElements.length; iterator2++) {
                if(arrElements[iterator1] == arrElements[iterator2]) {
                    System.out.print(arrElements[iterator2] + ", ");
                    duplicateFlag = true;
                }
            }
        }
        if(duplicateFlag == false){
            System.out.println("No duplicate elements in the given array.");
        }
        else {
            System.out.println("\b\b");
        }
    }
}
