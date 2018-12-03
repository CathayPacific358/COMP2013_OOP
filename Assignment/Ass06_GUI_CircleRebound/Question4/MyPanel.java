
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class MyPanel extends JPanel {

	private int x = 20;
	private int y = 20;
	private int radius = 20;
	private int dx = 10;
	private int dy = 10;

	public MyPanel() {

		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) {
					x = e.getX();
					y = e.getY();
				}
				repaint();
			}
		});

		Timer t = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// when getting out of the lower edge of the panel
				if (y + 20 >= MyPanel.this.getHeight()) {
					y = MyPanel.this.getHeight() - 20;// if the circle is stuck, throw it out
					dy = -dy;// change direction
				}
				// when getting out of the left edge of the panel
				if (x + 20 >= MyPanel.this.getWidth()) {
					x = MyPanel.this.getWidth() - 20;// if the circle is stuck, throw it out
					dx = -dx;// change direction
				}
				// when getting out of the upper edge of the panel
				if (y < 20) {
					y = 20;// if the circle is stuck, throw it out
					dy = -dy;// change direction
				}
				// when getting out of the right edge of the panel
				if (x < 20) {
					x = 20;// if the circle is stuck, throw it outs
					dx = -dx;// change direction
				}

				//always keep moving
				x += dx;
				y += dy;

				repaint();// repaint after each movement
			}
		});
		t.start();// start the timer
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);// clean everything before draw
		g.setColor(Color.RED);
		g.drawOval(x - 20, y - 20, radius * 2, radius * 2);// x - 20 = the centre point of the circle
	}
}
