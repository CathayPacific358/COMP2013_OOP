/**
 * 
 * @author frank
 *
 */

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {
	
	private int x = 20;
	private int y = 20;
	private int radius = 20;
	
	public MyPanel() {
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					x = e.getX();
					y = e.getY();
				}
				repaint();
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//clean everything before draw
		g.setColor(Color.RED);
		g.drawOval(x - 20, y - 20, radius * 2, radius * 2);//x - 20 = the centre point of the circle
	}
}
