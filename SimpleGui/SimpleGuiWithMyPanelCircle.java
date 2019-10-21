package SimpleGui;

import javax.swing.*;
import java.awt.event.*;


public class SimpleGuiWithMyPanelCircle  {

	MyDrawPanelCircle panel;

	public static void main(String [] args) {

		SimpleGuiWithMyPanelCircle gui = new SimpleGuiWithMyPanelCircle();
		gui.go();

	}

	public void go() {

		JFrame frame = new JFrame();
		panel = new MyDrawPanelCircle();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(panel);

		frame.setSize(300, 300);
		frame.setVisible(true);
	}

}