/**
 * 
 * @author Frank Ng
 *
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends View<ControllerClicks> {

	public MyFrame(Model m, ControllerClicks c) {
		super(m, c);
		
		this.setTitle("MyFrame Title");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		MyPanel centrePanel = new MyPanel(m, c);
		this.add(centrePanel, BorderLayout.CENTER);
		JPanel topPanel = new JPanel();
		this.add(topPanel, BorderLayout.PAGE_START);
		
		JButton resetBtn = new JButton("Reset");
		resetBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c.resetClicked();
			}
		});
		topPanel.add(resetBtn);
		
		JButton undoBtn = new JButton("Undo");
		undoBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(m.getPoints().size() != 0) {
				c.undoClicked();
				}
			}
		});
		topPanel.add(undoBtn);
		
		this.setVisible(true);
		
	}
	
	@Override
	public void update() {
		repaint();
	}
}
