/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;

public class MyFrame extends JFrame {

	public MyFrame() {
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);//to make it in the centre of the screen
		
		BorderLayout bl1 = new BorderLayout();
		/* Constructor of FlowLayout: FlowLayout(int align, int hgap, int vgap)
		 * FlowLayout(int align)
		 * FlowLayout()
		 */
		this.setLayout(bl1);
	
		//Panel 1
		JPanel p1 = new JPanel();
		BorderLayout bl2 = new BorderLayout();
		p1.setLayout(bl2);
		p1.setBackground(Color.BLUE);
		
		JButton b1 = new JButton("WARNING");
		JButton b2 = new JButton("DISMISS");
		
		p1.add(b1, BorderLayout.LINE_START);
		p1.add(b2, BorderLayout.LINE_END);
		
		this.add(p1, BorderLayout.PAGE_START);
		
		//Panel 2
		JPanel p2 = new JPanel();
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER);
		
		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		p2.setLayout(fl);
		p2.setBackground(Color.GREEN);
		
		p2.add(l);
		p2.add(tx);
		
		this.add(p2, BorderLayout.CENTER);
		
		//Panel 3
		JPanel p3 = new JPanel();
		GridLayout gl = new GridLayout(2, 2);
		p3.setLayout(gl);
		p3.setBackground(Color.RED);
		
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[] {"Red", "Green", "Blue"});
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[] {2, 7, -3, 24});

		p3.add(cb);
		p3.add(rb);
		p3.add(cb1);
		p3.add(cb2);

		this.add(p3, BorderLayout.PAGE_END);
		
		//set visible
		this.setVisible(true);
	}
}
