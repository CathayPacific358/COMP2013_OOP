/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
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
		
		BorderLayout bl = new BorderLayout();
		/* Constructor of FlowLayout: FlowLayout(int align, int hgap, int vgap)
		 * FlowLayout(int align)
		 * FlowLayout()
		 */
		this.setLayout(bl);
		
		JButton b1 = new JButton("WARNING");
		JButton b2 = new JButton("DISMISS");
		
		//if added two same button will only display one
		this.add(b1);
		this.add(b2);
		
		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[] {"Red", "Green", "Blue"});
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[] {2, 7, -3, 24});
		
		this.add(l, BorderLayout.PAGE_START);
		this.add(tx, BorderLayout.PAGE_START);//if there are two in the same position, the latter one will cover the former one
		
		this.add(cb, BorderLayout.LINE_START);
		this.add(rb, BorderLayout.LINE_END);
		this.add(cb1, BorderLayout.CENTER);
		this.add(cb2, BorderLayout.PAGE_END);

		
		this.setVisible(true);
	}
}
