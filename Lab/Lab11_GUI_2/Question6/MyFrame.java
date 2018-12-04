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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnL = new JButton("reset");
		JButton btnR = new JButton("undo");
		
		p.add(btnL);
		p.add(btnR);
		
		
		/* MyPanel */
		MyPanel mp1 = new MyPanel();
		this.add(mp1, BorderLayout.CENTER);
		mp1.setLayout(f1);
		
		btnL.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//Anonymous class
				mp1.clearAllPoints();//call clearAllPoints function in MyPanel
				repaint();//force to repaint
			}
		});
		
		btnR.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mp1.undoPoint();//call clearAllPoints function in MyPanel
				repaint();
			}
		});
		/* Set things visible */
		this.setVisible(true);
	}
}
