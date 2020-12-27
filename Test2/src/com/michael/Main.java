package com.michael;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner stdin = new Scanner(new File("teleport.in"));
        int a = stdin.nextInt();
        int b = stdin.nextInt();
        int x = stdin.nextInt();
        int y = stdin.nextInt();
        int min1 = Math.min(Math.abs(a-b), (Math.abs(a - x) + Math.abs(b - y)));
        int min = Math.min(min1, (Math.abs(a-y) + Math.abs(b-x)));

        PrintWriter out = new PrintWriter(new FileWriter("teleport.out"));
        out.print(min);

        out.close();
        stdin.close();
    }
}