/* 1. Write a program to calculate difference between today and your birthday */

package com.Batch2.javaAssignment_3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDifferenceFromBirthDate {
    public static void main(String[] args) throws ParseException {
        String birthDate = "16/07/1993 02:20:00 PM";
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        Date birthDay = formatter.parse(birthDate);
        Date today = new Date();
        long dateDifference = today.getTime() - birthDay.getTime();
        long year = dateDifference / (1000l * 60 * 60 * 24 * 365);
        long day = dateDifference / (1000 * 60 * 60 * 24) % 365;
        long hour = (dateDifference / (1000 * 60 * 60)) % 24;
        long minutes = (dateDifference / (1000 * 60)) % 60;
        long second = (dateDifference / 1000) % 60;

        System.out.println("Year " + year);
        System.out.println("Day " + day);
        System.out.println("Hour " + hour);
        System.out.println("Minute " + minutes);
        System.out.println("Second " + second);
    }
}
