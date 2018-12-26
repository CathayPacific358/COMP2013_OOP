/**
 * 
 * @author frank
 *
 */

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCreate extends View<ControllerCreate> {

	private JTextField t1;
	private JTextField t2;
	private JComboBox<String> cb;
	
	public ViewCreate(ElectricityCompany m, ControllerCreate c) {
		super(m, c);
		
		t1 = new JTextField("Type a new consumer name here");
		t2 = new JTextField("Type an amount of power here");
		cb = new JComboBox<String>();
		cb.addItem("House");
		cb.addItem("Power Plant");
		cb.addItem("Solar House");
		JButton btn_create = new JButton("Create");
		GridLayout gl = new GridLayout(4, 1);
		
		this.setTitle("View Create");
		this.setSize(400, 300);
		this.setLocation(400, 0);
		this.setLayout(gl);
		this.add(t1);
		this.add(t2);
		this.add(cb);
		this.add(btn_create);
		
		btn_create.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// Print the result in window
				JOptionPane.showMessageDialog(null, c.create(t1.getText(), t2.getText(), cb.getSelectedIndex()), "Message", JOptionPane.INFORMATION_MESSAGE);
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
