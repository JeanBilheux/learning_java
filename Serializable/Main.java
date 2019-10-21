package Serializable;

import java.io.*;


public class Main {

	public static void main(String[] args) {


		Box myBox = new Box();
		myBox.setHeight(10);
		myBox.setWidth(5);

		try {
			FileOutputStream fs = new FileOutputStream("my_serializable.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(myBox);
			os.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}