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
				Model m = new Model();
				ControllerClicks cc1 = new ControllerClicks(m);
				MyFrame mf1 = new MyFrame(m, cc1);
				m.addListener(mf1);
				Controller ctrler = new Controller(m);
				ViewNumber vn1 = new ViewNumber(m, cc1);
				m.addListener(vn1);
			}
		});
	}
}
