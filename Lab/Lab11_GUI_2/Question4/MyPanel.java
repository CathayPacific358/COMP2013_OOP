
/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class MyPanel extends JPanel {

	private int x = -1;
	private int y = -1;
	private ArrayList<Point> points;

	public MyPanel() {
		// this.setBackground(Color.RED);
		points = new ArrayList<Point>();// create a ArrayList

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton() == MouseEvent.BUTTON1);// check is left button or right button
				if (e.getButton() == MouseEvent.BUTTON1) {// if the clicked button is left button, print the position
					System.out.println("Position: (" + e.getX() + "," + e.getY() + ")");
					x = e.getX();
					y = e.getY();
					points.add(e.getPoint());// add point to the ArrayList
				}
				repaint();// to repaint the panel after every click
			}

		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);// to clean the panel before drawing anything

		for (int i = 0; i < points.size(); i++) {
			x = (int) points.get(i).getX();
			y = (int) points.get(i).getY();
			g.setColor(Color.RED);
			g.drawRect(x, y, 1, 1);
			
			if (i == 0) {//if have only one point, draw a dot
				g.drawLine(x, y, x, y);
			} else {//if have over two points, link them to become a line
				g.drawLine(x, y, (int) points.get(i - 1).getX(), (int) points.get(i - 1).getY());
			}
		}
	}
}
