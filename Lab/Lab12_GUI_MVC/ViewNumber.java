/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JLabel;

public class ViewNumber extends View<Controller> {

	private JLabel label;
	
	public ViewNumber(Model m, Controller c) {
		super(m, c);

		this.setTitle("View Number of Point");
		this.setSize(200, 200);
		
		label = new JLabel();
		this.add(label);
		this.update();
		this.setVisible(true);
	}
	
	@Override
	public void update() {
		label.setText("Number of points: " + m.numberOfPoints());
	}
}
