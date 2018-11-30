/**
 * 
 * @author Frank Ng
 *
 */

public class Start {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MyFrame();//if have two object, then one terminated the other terminated too
			}
		});
	}
}
