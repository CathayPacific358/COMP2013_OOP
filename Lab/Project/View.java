/**
 * 
 * @author Frank Ng
 *
 */

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public abstract class View<T extends Controller> extends JFrame implements ModelListener {

	protected ElectricityCompany m;
	protected T c;
	
	public View(ElectricityCompany m, T c) {
		this.m = m;
		this.c = c;
		m.addListener(this);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		// Use window listener to manually save data and shutdown when the close button is clicked
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				c.shutdown();
			}
		});
	}
	
	public abstract void update();
}
