package exercises.pdf;

import java.io.*;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int age = Integer.parseInt(bf.readLine());
        bw.write(String.format("Rapaz, tu é um %s de idade",
                age >= 18? "maior" : "menor"));

        bw.flush();
    }
}
