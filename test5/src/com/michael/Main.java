package com.michael;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        //Scanner system.in
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 7 integers separated by space");
        int[] iA = new int[7];
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            iA[i] = scanner.nextInt();
            al.add(iA[i]);
        }

        //output to system.out
        for (int i = 0; i < 7; i++) {
            System.out.print(iA[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(al.get(i) + " ");

        }
        System.out.println();
        //Read multiple integers
        scanner.nextLine();
        System.out.println("Please enter multiple integers separated by space");
        ArrayList<Integer> aL = new ArrayList<>();
        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();
        for (int i = 0; i < count; i++) {
            aL.add(Integer.parseInt(st.nextToken()));
        }
        int max = 0;
        //output
        for (int i : aL) {
            System.out.print(i + " ");
            if ( i > max) {
                max = i;
            }
        }
        System.out.println();
        System.out.println("Max = " + max);
    }
}
