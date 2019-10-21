package SimpleGui;

import javax.swing.*;
import java.awt.event.*;


public class SimpleGui 
{

	public static void main(String [] args) {

		JFrame frame = new JFrame();
		JButton button = new JButton("click me");

		button.addActionListener(event -> {
			button.setText("I've been clicked!");
		});

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(button);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}