package SimpleGui;

import java.awt.*;
import javax.swing.*;

class MyDrawPanelCircle extends JPanel {

	public void paintComponent(Graphics g) {

		g.fillRect(10, 10, this.getWidth()-20, this.getHeight()-20);

		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		Color randomColor = new Color(red, green, blue);
		g.setColor(randomColor);
		g.fillOval(70, 70, 100, 100);

	}


}