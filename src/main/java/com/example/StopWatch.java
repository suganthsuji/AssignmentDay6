package com.example;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        //Calculate time btwn Start and stop
        System.out.println("Enter 1 to Start the clock");
        Scanner scanner=new Scanner(System.in);
        Long Start=scanner.nextLong();
        Long StartTime=System.currentTimeMillis();
        System.out.println("Enter 0 to Stop the clock");
        Scanner sc=new Scanner(System.in);
        Long Stop=sc.nextLong();
        Long EndTime= System.currentTimeMillis();
        Long Time=EndTime-StartTime;
        System.out.println("Time is "+Time);

    }
}
