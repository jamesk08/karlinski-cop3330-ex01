package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println("What is your name?");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.print(userName + ", ");
        System.out.print("nice to meet you!");
        scanner.close();
    }
}