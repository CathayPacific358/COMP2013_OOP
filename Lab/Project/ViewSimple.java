
/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JLabel;
import javax.swing.JFrame;

public class ViewSimple extends View<Controller> implements ModelListener{

	private JLabel label;

	public ViewSimple(ElectricityCompany m, ControllerSimple c) {
		super(m, c);

		this.setTitle("View Simple");
		this.setSize(300, 200);

		// Create a label
		label = new JLabel();
		label.setText("Total power consumption: " + m.totalConsumption());
		this.add(label);// Add label to the frame
		
		m.addListener(this);// Add the view to the ModelListener
		this.setVisible(true);// Make visible
	}

	@Override
	public void update() {
		label.setText("Total power consumption: " + m.totalConsumption());// Update the info.
	}
}
