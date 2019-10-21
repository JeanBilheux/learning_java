package SimpleGui;

import javax.swing.*;
import java.awt.event.*;


public class SimpleGuiWithMyPanel  {

	MyDrawPanel panel;

	public static void main(String [] args) {

		SimpleGuiWithMyPanel gui = new SimpleGuiWithMyPanel();
		gui.go();

	}

	public void go() {

		JFrame frame = new JFrame();
		panel = new MyDrawPanel();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(panel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}