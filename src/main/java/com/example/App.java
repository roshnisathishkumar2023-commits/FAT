package com.example;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final int ALLOWED_DAYS = 14;
    private static final double FINE_PER_DAY = 2.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        
        System.out.print("How many books are being issued? ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); 

        List<String> books = new ArrayList<>();
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter title for book " + (i + 1) +: ");
            books.add(scanner.nextLine());
        }
        System.out.print("Enter number of days borrowed: ");
        int daysBorrowed = scanner.nextInt();
        int extraDays = Math.max(0, daysBorrowed - ALLOWED_DAYS);
        double totalFine = extraDays * FINE_PER_DAY;
        System.out.println("\n--- Library System Receipt ---");
        System.out.println("User: " + name + " (ID: " + userId + ")");
        System.out.println("Books Issued: " + books);
        System.out.println("Days Borrowed: " + daysBorrowed);
        
        if (extraDays > 0) {
            System.out.println("Status: OVERDUE");
            System.out.println("Fine Amount: $" + totalFine);
        } else {
            System.out.println("Status: ON TIME");
            System.out.println("Fine Amount: $0.00");
        }
        
        scanner.close();
    }
}
