
/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JPanel;
import java.awt.event.MouseListener;
//import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {

	public MyPanel() {
		// this.setBackground(Color.RED);
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(e.getButton() == MouseEvent.BUTTON1);// check is left button or right button
				if (e.getButton() == MouseEvent.BUTTON1) {//if the clicked button is left button, print the position
					System.out.println("Position: (" + e.getX() + "," + e.getY() + ")");
				}
			}

		});
	}
}
