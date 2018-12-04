/**
 * 
 * @author Frank Ng
 *
 */
import java.awt.Point;
import java.util.ArrayList;

public class Model {

	private ArrayList<Point> points;
	private ArrayList<ModelListener> listeners;
	
	public Model() {
		points = new ArrayList<Point>();
		listeners = new ArrayList<ModelListener>();
	}
	
	public void addListener(ModelListener l) {
		listeners.add(l);
	}
	
	public ArrayList<Point> getPoints() {
		return points;
	}
	
	public void addPoint(Point p) {
		points.add(p);
		notifyListeners();
	}
	
	public void clearAllPoints() {
		points.clear();
		notifyListeners();
	}
	
	public void deleteLastPoint() {
		points.remove(points.size() - 1);
		notifyListeners();
	}
	
	public void notifyListeners() {
		for(ModelListener l: listeners) {
			l.update();// Tell the listener that something changed
		}
	}
	
	public int numberOfPoints() {
		return points.size();
	}
	
	public static void testModel() {
		Model m = new Model();
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 4);
		
		m.addPoint(p1);
		m.addPoint(p2);
		System.out.println(m.getPoints().get(0).getX() == 2.0);
		System.out.println(m.getPoints().get(0).getY() == 3.0);
		System.out.println(m.getPoints().size() == 2);
		m.deleteLastPoint();
		System.out.println(m.getPoints().size() == 1);
		m.clearAllPoints();
		System.out.println(m.getPoints().size() == 0);
	}
}
