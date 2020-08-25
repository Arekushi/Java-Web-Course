package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	public double readDouble() {
		try {
			return Double.parseDouble(bf.readLine());
		} catch (NumberFormatException | IOException e) {
			//e.printStackTrace();
		}
		
		return 0;
	}
	
	public int readInt() {
		try {
			return Integer.parseInt(bf.readLine());
		} catch (NumberFormatException | IOException e) {
			//e.printStackTrace();
		}
		
		return 0;
	}
	
	public String readString() {
		try {
			return bf.readLine().trim();
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
		return null;
	}
}
