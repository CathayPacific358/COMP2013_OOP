/**
 * 
 * @author Frank Ng
 *
 */

public class ViewHistory extends View<ControllerHistory> {

	public ViewHistory(ElectricityCompany m, ControllerHistory c) {
		super(m, c);
		
		this.setTitle("View History");
		this.setSize(400, 300);
		this.setLocation(0, 0);
		HistoryPanel hp = new HistoryPanel(m);
		
		this.add(hp);
		this.setVisible(true);
	}
	
	@Override
	public void update() {
		repaint();// To repaint while each update
	}
}
