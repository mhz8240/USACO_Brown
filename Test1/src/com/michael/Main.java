package com.michael;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner stdin = new Scanner(new File("test.in"));
        int n = stdin.nextInt();
        int m = stdin.nextInt();
        System.out.println("n = " + n);
        int sum = n + m;

        PrintWriter out = new PrintWriter(new FileWriter("test.out"));
        out.print(sum);

        out.close();
        stdin.close();
    }
}
