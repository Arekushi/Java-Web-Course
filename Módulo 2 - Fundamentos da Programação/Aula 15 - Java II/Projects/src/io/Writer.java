package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Writer {
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public void writeln(String string) {
		try {
			bw.write(string.concat("\n"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String string) {
		try {
			bw.write(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void flush() {
		try {
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
