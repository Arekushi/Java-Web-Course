package exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exercicio2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int value = Integer.parseInt(bf.readLine());
		
		bw.write(new StringBuilder()
				.append(value % 2 == 0? "Par\n" : "Impar\n")
				.toString());
		
		bw.flush();
	}
}
