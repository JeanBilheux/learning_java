package WriteAscii;

import java.io.*;

public class Main {

	public	static void main (String[] args) {

		try {
			FileWriter writer = new FileWriter("my_ascii.txt");
			writer.write("Hello you \n");
			writer.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}