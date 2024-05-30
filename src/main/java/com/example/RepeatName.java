package com.example;

import java.util.Scanner;

/**
 * RepeatName
 */
public class RepeatName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("name:");
        String name = sc.nextLine();
        int i;
        for (i=0; i<10; i++){
            System.out.println(name);
        }
        int j=0;
        while (j<10) {
            System.out.println(name);
            j++;
        }
        int k=0;
        do {
            System.out.println(name);
            k++;
        } while (k<10);
    }
}