
/**
 * 
 * @author Frank Ng
 *
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class HistoryPanel extends JPanel {

	private ElectricityCompany m;

	public HistoryPanel(ElectricityCompany m) {
		this.m = m;
	}

	// Function to check the history max value
	private int historyMax(ArrayList<Integer> history) {
		// Check max only when ArrayList have element
		if (history.size() > 0) {
			int size = history.size();
			int checkMax = history.get(0);

			// Use loop to check one by one
			for (int i = 1; i < size; i++) {
				if (checkMax < history.get(i)) {// If the former max is smaller, assign the larger one to max
					checkMax = history.get(i);
				}
			}
			return checkMax;// Return the result
		}
		return 0;
	}

	// Function to check the history min value
	private int historyMin(ArrayList<Integer> history) {
		// Check min only when ArrayList have element
		if (history.size() > 0) {
			int size = history.size();
			int checkMin = history.get(0);

			// Use loop to check one by one
			for (int i = 1; i < size; i++) {
				if (checkMin > history.get(i)) {// If the former min is larger, assign the smaller one to min
					checkMin = history.get(i);
				}
			}

			return checkMin;// Return the result
		}
		return 0;
	}

	// Function to calculate the range between the max and min
	private int historyRange(ArrayList<Integer> history) {
		int max = this.historyMax(history);
		int min = this.historyMin(history);

		if (max - min >= 200) {// If the result is larger than 200
			return max - min;// Return directly
		} else {// If the result is strictly smaller than 200
			return 200;// Return 200
		}
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);// Clear the panel before drawing anything

		int min = historyMin(m.getHistory());
		int range = historyRange(m.getHistory());
		int maxX = this.getWidth() - 1;
		int maxY = this.getHeight() - 1;
		int zero = maxY + min * maxY / range;

		g.setColor(Color.BLUE);
		g.drawLine(0, zero, maxX, zero);// To draw a line to indicate 0

		g.setColor(Color.RED);
		for (int i = 0; i < m.getHistory().size(); i++) {
			int v = m.getHistory().get(i);
			int x = 10 * i;
			int y = zero - v * maxY / range;

			if (i == 0) {// If have only one record, draw a dot
				g.drawLine(x, y, x, y);
			} else {// If have over one records, draw lines between them
				g.drawLine(x, y, 10 * (i - 1), zero - m.getHistory().get(i - 1) * maxY / range);
			}
		}
	}
}
