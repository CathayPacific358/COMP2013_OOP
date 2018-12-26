/**
 * 
 * @author frank
 *
 */

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewMorePower extends View<ControllerMorePower>{

	JTextField t1;
	JTextField t2;
	
	public ViewMorePower(ElectricityCompany m, ControllerMorePower c) {
		super(m, c);
		
		JTextField t1 = new JTextField("Type a consumer name here");
		JTextField t2 = new JTextField("Type an amount of power here");
		JButton btn_morePower = new JButton("More Power");
		GridLayout gl = new GridLayout(3, 1);
		
		this.setTitle("View More Power");
		this.setSize(300, 300);
		this.setLocation(800, 0);
		this.setLayout(gl);
		this.add(t1);
		this.add(t2);
		this.add(btn_morePower);
		
		btn_morePower.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// Print the result in window
				JOptionPane.showMessageDialog(null, c.morePower(t1.getText(), t2.getText()), "Message", JOptionPane.INFORMATION_MESSAGE);
			}catch(NumberFormatException e2) {
				// If input in t2 is not integer, show the exception message
				JOptionPane.showMessageDialog(null, e2.getMessage(), "Message", JOptionPane.INFORMATION_MESSAGE);
			}
			}
		});
		
		this.setVisible(true);
	}
	
	@Override
	public void update() {
		// Does nothing
	}
}
