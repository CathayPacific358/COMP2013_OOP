/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

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
		
		JLabel l = new JLabel("Enter your name: ");
		JTextField tx = new JTextField("Type Text Here");
		JCheckBox cb = new JCheckBox("I agree");
		JRadioButton rb = new JRadioButton("Yes");
		JComboBox<String> cb1 = new JComboBox<String>(new String[] {"Red", "Green", "Blue"});
		JComboBox<Integer> cb2 = new JComboBox<Integer>(new Integer[] {2, 7, -3, 24});
		
		this.add(l);
		this.add(tx);
		this.add(cb);
		this.add(rb);
		this.add(cb1);
		this.add(cb2);
		
		this.setVisible(true);
	}
}
