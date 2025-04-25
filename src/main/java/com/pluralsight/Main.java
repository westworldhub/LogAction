package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to SearchEngineLogger!");
        LogAction.WriteLogAction("Launched the application");
        while (true) {
            System.out.print("Enter a term to search: ");
            String searchTerm = read.nextLine();

            if (searchTerm.equalsIgnoreCase("X")) {
                System.out.println("Exiting aplication... ");
                LogAction.WriteLogAction("Exited the application");
                break;
            } else if(!searchTerm.isEmpty()) {
                LogAction.WriteLogAction("Search: " + searchTerm);
            }
            read.close();
        }
    }
}