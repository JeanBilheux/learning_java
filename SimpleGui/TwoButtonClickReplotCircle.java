package SimpleGui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class TwoButtonClickReplotCircle  {

	MyDrawPanelCircle panel;
	JFrame frame;
	JLabel label;

	public static void main(String [] args) {

		TwoButtonClickReplotCircle gui = new TwoButtonClickReplotCircle();
		gui.go();

	}

	public void go() {

		frame = new JFrame();
		panel = new MyDrawPanelCircle();

		JButton button = new JButton("Change color");
		button.addActionListener(new Button1Listener());

		JButton buttonLabel = new JButton("Change label");
		buttonLabel.addActionListener(new Button2Listner());

		label = new JLabel("before");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(BorderLayout.NORTH, label);
		frame.getContentPane().add(BorderLayout.CENTER, panel);
		frame.getContentPane().add(BorderLayout.SOUTH, button);
		frame.getContentPane().add(BorderLayout.EAST, buttonLabel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	class Button1Listener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			frame.repaint();
		}
	}

	class Button2Listner implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			label.setText("After");
		}
	}


}