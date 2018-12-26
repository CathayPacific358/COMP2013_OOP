/**
 * 
 * @author Frank Ng
 *
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

	private Model m;
	private ControllerClicks c;
	
	public MyPanel(Model m, ControllerClicks c) {
		this.m = m;
		this.c = c;
		
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON1) {
					c.mouseClicked(e.getPoint());
				}
			}
		});
	}
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		if(m.getPoints().size() == 1) {
			Point p = m.getPoints().get(0);
			g.drawRect((int)p.getX(), (int)p.getY(), 1, 1);
		}else {
			for(int i = 1; i < m.getPoints().size(); i++) {
				Point start = m.getPoints().get(i - 1);
				Point end = m.getPoints().get(i);
				g.drawLine((int)start.getX(), (int)start.getY(), (int)end.getX(), (int)end.getY());
			}
		}
	}
}