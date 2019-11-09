package com.soumya.corejava.enumdemo;

import java.util.Scanner;

public class EnumMain{
    public static void main(String[] args)  {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = Integer.parseInt(input.next());
        for (WeekDays w: WeekDays.values()){
            if (userInput == w.getDayNum()){
                System.out.println("Today is " + w);
                System.out.println(w.getDaysGreeting());
                if(w.getIsWeekend()){
                    System.out.println("Today is weekend  ...... Enjoy !!!");
                }
            }
        }

    }
}
