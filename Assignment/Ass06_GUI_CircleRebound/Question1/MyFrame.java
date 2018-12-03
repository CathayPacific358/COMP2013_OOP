/**
 * 
 * @author frank
 *
 */

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		this.setTitle("My Frame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		/* MyPanel */
		MyPanel mp1 = new MyPanel();
		this.add(mp1);
		
		/* To set visible */
		this.setVisible(true);
	}
}
