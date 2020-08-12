package exercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Exercicio4 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int index = 0;
		
		while(index <= 10) {
			bw.write(String.format("%d * %d == %d%n", 8, index, index++ * 8));
		}
		
		bw.flush();
	}
}
