package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double x[] = new double[3];
		double y[] = new double[3];
		
		double p[] = new double[2];
		double areas[] = new double[2];
		
		for(int i = 0; i < 3; i++) {
			x[i] = Double.parseDouble(bf.readLine());
			p[0] += x[i];
		}
		
		p[0] /= 2;
		areas[0] = Math.sqrt(p[0] * (p[0] - x[0]) * (p[0] - x[1]) * (p[0] - x[2]));
		
		for(int i = 0; i < 3; i++) {
			y[i] = Double.parseDouble(bf.readLine());
			p[1] += y[i];
		}
		
		p[1] /= 2;
		areas[1] = Math.sqrt(p[1] * (p[1] - y[0]) * (p[1] - y[1]) * (p[1] - y[2]));
		
		bw.write(new StringBuilder()
				.append(String.format("Triangle X area: %.4f%n", areas[0]))
				.append(String.format("Triangle Y area: %.4f%n", areas[1]))
				.append(String.format("Larger Area: %s", areas[0] > areas[1]? "X" : "Y"))
				.toString());
		
		bw.flush();
	}
}
