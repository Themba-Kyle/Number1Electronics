/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronicsreport;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Number1ElectronicsReport {

 

    public static void main(String[] args) {

        // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: rows = consoles, columns = cities
        int[][] sales = {
            {1000, 2000, 1500},   // PS5
            {2000, 3000, 1100},   // XBOX
            {3000, 4000, 1200}    // SWITCH
        };

        // Single-dimensional array for city totals
        int[] cityTotals = new int[cities.length];

        // Calculate total sales for each city
        for (int c = 0; c < cities.length; c++) {
            for (int r = 0; r < consoles.length; r++) {
                cityTotals[c] += sales[r][c];
            }
        }

        // Find the city with the most sales
        int maxIndex = 0;
        for (int c = 1; c < cityTotals.length; c++) {
            if (cityTotals[c] > cityTotals[maxIndex]) {
                maxIndex = c;
            }
        }

        // ----- Display the report -----
        System.out.println("NUMBER 1 ELECTRONICS");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("=====================================================");

        // Header row with city names
        System.out.printf("%-10s", "");
        for (int c = 0; c < cities.length; c++) {
            System.out.printf("%-18s", cities[c]);
        }
        System.out.println();

        // Sales rows per console
        for (int r = 0; r < consoles.length; r++) {
            System.out.printf("%-10s", consoles[r]);
            for (int c = 0; c < cities.length; c++) {
                System.out.printf("%-18d", sales[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("=====================================================");

        for (int c = 0; c < cities.length; c++) {
            System.out.printf("%-18s", cities[c]);
        }
        System.out.println();

        for (int c = 0; c < cities.length; c++) {
            System.out.printf("%-18d", cityTotals[c]);
        }
        System.out.println();

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
    }
}
