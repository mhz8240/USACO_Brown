package com.michael;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner stdin = new Scanner(new File("word.in"));
        PrintWriter out = new PrintWriter(new FileWriter("word.out"));

        int n = stdin.nextInt();
        int k = stdin.nextInt();
        stdin.nextLine();
        String str = stdin.nextLine();
//        System.out.println(n);
//        System.out.println(k);
//        System.out.println(str);
        String[] sA = str.split(" ");
        String line = "";
        int length = 0;
        for(String s : sA) {
            if (length + s.length() <= k) {
                out.print(s + " ");
                length += s.length();
            }
            else {
                out.println();
                length = s.length();
                out.print(s + " ");
            }
//            if (length + s.length() > 7) {
//                line.strip();
//                out.println(line);
//                line = s + " ";
//                length = s.length();
//                if (s == sA[sA.length - 1]) {
//                    line.strip();
//                    out.println(line);
//                }
//            }
//
//            else {
//                line = line + s + " " ;
//                length += s.length();
//                if (s == sA[sA.length - 1]) {
//                    line.strip();
//                    out.println(line);
//                }
//            }


        }






        out.close();
        stdin.close();
    }
}

