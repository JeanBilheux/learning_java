package SimpleGui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class ButtonClickReplotCircle  {

	MyDrawPanelCircle panel;
	JFrame frame;
	JLabel label;

	public static void main(String [] args) {

		ButtonClickReplotCircle gui = new ButtonClickReplotCircle();
		gui.go();

	}

	public void go() {

		frame = new JFrame();
		panel = new MyDrawPanelCircle();

		JButton button = new JButton("Change color");
		button.addActionListener(event -> {
			frame.repaint();
		});

		JButton buttonLabel = new JButton("Change label");
		buttonLabel.addActionListener(event -> {
			label.setText("after!");
		});

		label = new JLabel("before");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(BorderLayout.NORTH, label);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.EAST, buttonLabel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}