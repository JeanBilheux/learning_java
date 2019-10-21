package Deserializable;

import java.io.*;
import Serializable.Box;


public class Main {

	public static void main(String[] args) {

	try {
		FileInputStream fileStream = new FileInputStream("my_serializable.ser");
		ObjectInputStream os = new ObjectInputStream(fileStream);

		Object objectOne = os.readObject();

		Box myBox = (Box) objectOne;

		System.out.println("MyBox.getHeight(): " + myBox.getHeight());

		os.close();

	} catch (Exception ex) {
		ex.printStackTrace();
	}

	}

}