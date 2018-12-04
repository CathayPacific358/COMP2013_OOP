/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BorderLayout b1 = new BorderLayout();
		this.setLayout(b1);
		
		/* Panel */
		JPanel p = new JPanel();
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
		this.add(p, BorderLayout.PAGE_START);
		p.setLayout(f1);
		
		JButton btnL = new JButton("left");
		JButton btnR = new JButton("right");
		
		p.add(btnL);
		p.add(btnR);
		
		/* MyPanel */
		MyPanel mp1 = new MyPanel();
		this.add(mp1, BorderLayout.CENTER);
		mp1.setLayout(f1);
		
		/* Set things visible */
		this.setVisible(true);
	}
}
