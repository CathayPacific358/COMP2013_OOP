/**
 * 
 * @author frank
 *
 */

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class MyPanel extends JPanel {
	
	private int x = 20;
	private int y = 20;
	private int radius = 20;
	
	public MyPanel() {
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//clean everything before draw
		g.setColor(Color.RED);
		g.drawOval(0, 0, radius * 2, radius * 2);
	}
}
