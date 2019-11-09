package com.soumya.corejava.enumdemo;

import java.util.Scanner;

public class EnumMain{
    public static void main(String[] args)  {
        boolean gotADay = false;
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = Integer.parseInt(input.next());
        for (WeekDays w: WeekDays.values()){
            if (userInput == w.getDayNum()){
                gotADay = true;
                System.out.println("Today is " + w);
                System.out.println(w.getDaysGreeting());
                if(w.getIsWeekend()){
                    System.out.println("Today is weekend  ...... Enjoy !!!");
                    break;
                }
            }
        }
        if (!gotADay){
            System.out.println("Please enter a number between 1 to 7 !!!");
        }
    }
}
