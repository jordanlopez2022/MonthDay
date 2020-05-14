package com.LickingHeights;

import java.util.Scanner;

public class Main {
    // Print Day for a Date
    static int Zellercongruence(int day, int month,
                                 int year)
    {
        if (month == 1)
        {
            month = 13;
            year--;
        }
        if (month == 2)
        {
            month = 14;
            year--;
        }
        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + ((13*(m + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j);
        h = h % 7;
        return h;
    }
    public static void poemDay(int h) {
        switch (h)
        {
            case 0 : System.out.println("Saturday's child works hard for a living,"); break;
            case 1 : System.out.println("But the child born on the Sabbath Day, \n Is fair and wise and good in every way."); break;
            case 2 : System.out.println("Monday's child is fair of face,"); break;
            case 3 : System.out.println("Tuesday's child is full of grace,"); break;
            case 4 : System.out.println("Wednesday's child is full of woe,"); break;
            case 5 : System.out.println("Thursday's child has far to go."); break;
            case 6 : System.out.println("Friday's child is loving and giving,"); break;
        }
    }
    // Driver code
    public static void printPoem() {
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go.");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath Day,");
        System.out.println("Is fair and wise and good in every way.");
    }
    public static void main(String[] args)
    {
        String answer;
        do {

            printPoem();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What month were you born");
            int month = keyboard.nextInt();
            System.out.println("What day were you born");
            int day = keyboard.nextInt();
            System.out.println("What year were you born");
            int year = keyboard.nextInt();


            poemDay(Zellercongruence(day, month, year)); //date (dd/mm/yyyy)
            System.out.println("Do you want to enter another date?");
            keyboard.nextLine();
            answer=keyboard.nextLine();
        }while(answer.equalsIgnoreCase("yes"));


    }
}
