package exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Exercicio1 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int value = Integer.parseInt(bf.readLine());
		int count = 0;
		
		for(int i = 1; i <= value; i++)
			count += (value % i == 0)? 1 : 0;
		
		bw.write(new StringBuilder()
				.append(count == 2? "É primo\n" : "Não é primo\n")
				.toString());
		
		bw.flush();
	}
}
