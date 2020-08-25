package exercises.pdf;

import java.io.*;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /*
            Domingo = 1
            Segunda = 2
            Terça = 3
            Quarta = 4
            Quinta = 5
            Sexta = 6
            Sábado = 7
         */

        int day = Integer.parseInt(bf.readLine());
        bw.write(String.format("Este fatídico dia é %s",
                day > 1 && day < 7?
                        "dia da semana, bora trabalhar :c" : "fim de semana aehooo!"));

        bw.flush();
    }
}
