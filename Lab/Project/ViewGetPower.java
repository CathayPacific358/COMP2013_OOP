
/**
 * 
 * @author frank
 *
 */

import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ViewGetPower extends View<ControllerGetPower> {

	private JTextField t;

	public ViewGetPower(ElectricityCompany m, ControllerGetPower c) {
		super(m, c);

		JTextField t = new JTextField("Type a consumer name here");
		JButton btn_tellPower = new JButton("Tell me the power");
		GridLayout gl = new GridLayout(2, 1);// GridLayout with 2 rows and 1 column

		this.setTitle("View Power");
		this.setSize(300, 200);
		this.setLayout(gl);
		this.add(t);
		this.add(btn_tellPower);

		// ActionListener for button tellPower
		btn_tellPower.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Print the result in window
				JOptionPane.showMessageDialog(null, c.getPower(t.getText()), "Message",JOptionPane.INFORMATION_MESSAGE);
			}
		});

		this.setVisible(true);
	}

	@Override
	public void update() {
		// Does nothing
	}
}
