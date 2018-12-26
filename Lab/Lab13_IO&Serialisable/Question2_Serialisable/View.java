/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class View <T extends Controller> extends JFrame implements ModelListener {

	protected Model m;
	protected T c;
	
	public View(Model m, T c) {
		this.m = m;
		this.c = c;
		//m.addListener(this);
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				c.shutdown();
			}
		});
	}
	
	@Override
	public abstract void update();
}
