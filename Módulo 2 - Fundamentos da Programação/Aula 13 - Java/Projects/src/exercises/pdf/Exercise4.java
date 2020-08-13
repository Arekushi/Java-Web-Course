package exercises.pdf;

import java.io.*;

public class Exercise4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String name = bf.readLine();
        bw.write(String.format("Seja bem vindo ao meu programa %s", name));

        bw.flush();
    }
}
