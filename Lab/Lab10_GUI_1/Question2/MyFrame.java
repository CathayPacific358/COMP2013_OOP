/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);//to make it in the centre of the screen
		
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT, 20, 40);
		/* Constructor of FlowLayout: FlowLayout(int align, int hgap, int vgap)
		 * FlowLayout(int align)
		 * FlowLayout()
		 */
		this.setLayout(f1);
		
		JButton b1 = new JButton("WARNING");
		JButton b2 = new JButton("DISMISS");
		
		//if added two same button will only display one
		this.add(b1);
		this.add(b2);
		
		this.setVisible(true);
	}
}
