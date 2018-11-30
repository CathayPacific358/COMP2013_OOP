/**
 * 
 * @author Frank Ng
 *
 */

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//for cube
		g.setColor(Color.RED);
		g.drawRect(90, 30, 100, 100);
		g.drawRect(50, 50, 100, 100);
		g.drawLine(90, 30, 50, 50);
		g.drawLine(190, 130, 150, 150);
		g.drawLine(190, 30, 150, 50);
		g.drawLine(90, 130, 50, 150);
		
		//for cylinder
		g.setColor(Color.BLUE);
		g.drawOval(200, 30, 100, 20);
		g.drawOval(200, 130, 100, 20);
		g.drawLine(200, 40, 200, 140);
		g.drawLine(300, 40, 300, 140);
	}
}
