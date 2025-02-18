package fouskes;

import java.io.*;

public class My {

	public static String readStr() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1);
		String string = " ";

		try {
			string = br.readLine();
		} catch (IOException ex) {
			System.out.println("\nYphrkse sfalma! Leptomereies:");
			ex.printStackTrace();
		}

		return string;
	}// readStr()

	public static int readInt() {
		try {
			return Integer.parseInt(readStr());
		} catch (Exception ex) {
			System.out.println("Mh apodekto.");
			return 0;
		}
	}// readInt()
	
	public static float readFloat() {
		try {
			return Float.parseFloat(readStr());
		} catch (Exception ex) {
			System.out.println("Mh apodekto.");
			return 0;
		}
	}// readFloat()

	public static double readDouble() {
		try {
			return Double.parseDouble(readStr());
		} catch (Exception ex) {
			System.out.println("Mh apodekto.");
			return -1;
		}
	}// readDouble()

	public static char readChar() {
		IOException e = new IOException();

		try {
			String s = readStr();
			if (s.length() != 1)
				throw e;
			return s.charAt(0);
		} catch (Exception ex) {
			System.out.println("Mh apodekto.");
			return ' ';
		}
	}// readChar()

}// My
