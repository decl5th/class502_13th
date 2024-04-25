package exam04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        br.readLine();
        br.close();
    }
}
