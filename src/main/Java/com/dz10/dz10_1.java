package com.dz10;

import java.util.Scanner;

public class dz10_1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter m");
        int m = getNumber(sc1);
        System.out.println("Enter n");
        int n = getNumber(sc1);

        int array[][] = new int[m][n];
        System.out.println("Before transpose: ");
        System.out.println();
        int number = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = number;
                number++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("After transpose: ");

        int array2[][] = new int[n][m];
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array[j][i];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


    }

    public static int getNumber(Scanner sc1) {
        do {
            if (sc1.hasNextInt()) {
                int temp = sc1.nextInt();
                if (temp > 0) {
                    return temp;
                } else {
                    System.out.println("Number should be more than 0");
                }
            } else {
                System.out.println("Wrong input, try again");
                sc1.next();
            }
        } while (true);
    }
}


