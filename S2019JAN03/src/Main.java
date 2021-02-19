import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        BufferedReader br = new BufferedReader(new FileReader("mountains.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("mountains.out"));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Mountain> mountains = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            mountains.add(new Mountain(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }
        Collections.sort(mountains);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((mountains.get(j).y - mountains.get(i).y) >= Math.abs(mountains.get(j).x - mountains.get(i).x)) {
                    count--;
                    break;

                }

            }
            count++;
        }
        pw.print(count);
        br.close();
        pw.close();
    }
}

class Mountain implements Comparable<Mountain> {
    public int x;
    public int y;

    public Mountain(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Mountain m) {
        if (this.y < m.y) {
            return 1;
        }
        else if (this.y > (m).y) {
            return -1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}


