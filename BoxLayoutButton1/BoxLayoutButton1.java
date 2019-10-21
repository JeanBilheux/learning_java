package BoxLayoutButton1;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutButton1 {
	
	public static void main (String[] args) {

		BoxLayoutButton1 gui = new BoxLayoutButton1();
		gui.go();
	}

	// public void go() {

	// 	JFrame frame = new JFrame();
	// 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 	JButton button = new JButton("click me and I mean it!");
	
	// 	Font bigFont = new Font("serif", Font.BOLD, 28);
	// 	button.setFont(bigFont);

	// 	frame.getContentPane().add(BorderLayout.NORTH, button);
	// 	frame.setSize(200, 200);
	// 	frame.setVisible(true);
	// }

	public void go() {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setBackground(Color.darkGray);

		BoxLayout box = new BoxLayout(panel, BoxLayout.Y_AXIS);
		panel.setLayout(box);

		JButton button1 = new JButton("Shock me");
		JButton button2 = new JButton("Bliss!");
	
		panel.add(button1);
		panel.add(button2);

		frame.getContentPane().add(BorderLayout.NORTH, panel);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}


}