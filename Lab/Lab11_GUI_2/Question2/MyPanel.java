
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

public class MyPanel extends JPanel {

	private int x = -1;
	private int y = -1;
	
	public MyPanel() {
		// this.setBackground(Color.RED);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton() == MouseEvent.BUTTON1);// check is left button or right button
				if (e.getButton() == MouseEvent.BUTTON1) {//if the clicked button is left button, print the position
					System.out.println("Position: (" + e.getX() + "," + e.getY() + ")");
					x = e.getX();
					y = e.getY();
				}
				repaint();//to repaint the panel after every click
			}

		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);//to clean the panel before drawing anything
		g.setColor(Color.RED);
		g.drawRect(x, y, 1, 1);
	}
}
