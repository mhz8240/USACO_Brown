package com.michael;

import java.io.*;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException{
	    // resources
        BufferedReader br = new BufferedReader(new FileReader("test.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
        pw.println("Hi");
        //line 1
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st1.nextToken());
        int n = Integer.parseInt(st1.nextToken());
        System.out.println(k + " " + n);
        pw.println(k + " " + n);

        //line2
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int count = st2.countTokens();
        double[] dA = new double[count];
        for (int i = 0; i < count; i++) {
            dA[i] = Double.parseDouble(st2.nextToken());
        }
        for (Double d : dA) {
            System.out.print(d + " ");
            pw.print(d + " ");
        }
        System.out.println();
        pw.println();

        //line3
        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int strC = st3.countTokens();
        String[] sA = new String[strC];
        for (int i = 0; i < strC; i++) {
            sA[i] = st3.nextToken();
        }
        for (String s : sA) {
            System.out.print(s + " ");
            pw.print(s + " ");
        }
        System.out.println();
        pw.println();

        //line4
        String st4 = br.readLine();
        String[] strings = st4.split(" ");
        for (String s : strings) {
            System.out.print(s + " ");
            pw.print(s + " ");
        }

        //close resources
        br.close();
        pw.close();
    }
}
