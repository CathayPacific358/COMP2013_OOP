
/**
 * 
 * @author Frank Ng
 *
 */
import java.awt.Point;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.util.Scanner;
import java.io.ObjectOutputStream;

public class Model implements Serializable {

	private ArrayList<Point> points;
	private ArrayList<ModelListener> listeners;
	private File file;

	public Model() {
		this.points = new ArrayList<Point>();
		this.listeners = new ArrayList<ModelListener>();
		file = new File("points.bin");

		if (file.exists()) {// Check file exists or not
			try {
				// Scanner s = new Scanner(file);
				/*
				 * while (s.hasNext()) { int x = s.nextInt();// nextInt() will automatically
				 * check the next integer int y = s.nextInt(); points.add(new Point(x, y));//
				 * Add the point to the ArrayList } s.close();
				 */

				FileInputStream fi = new FileInputStream(file);
				ObjectInputStream in = new ObjectInputStream(fi);
				points = (ArrayList<Point>) in.readObject();// Get object data from the file

				in.close();
				fi.close();
				
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			} catch (ClassNotFoundException e) {
				System.err.println(e.getMessage());
				System.exit(1);
			}
		}
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
		for (ModelListener l : listeners) {
			l.update();// Tell the listener that something changed
		}
	}

	public int numberOfPoints() {
		return points.size();
	}

	public void saveData() {// Function to save data
		try {
			/*
			 * PrintWriter out = new PrintWriter("points.txt"); for (int i = 0; i <
			 * points.size(); i++) { out.println((int)points.get(i).getX() + " " +
			 * (int)points.get(i).getY());// Print the value in to the file } out.close();//
			 * Close file
			 */
			FileOutputStream fo = new FileOutputStream("points.bin");
			ObjectOutputStream out = new ObjectOutputStream(fo);
			out.writeObject(points);
			out.close();
			fo.close();
		} catch (FileNotFoundException ex) {
			System.err.println(ex.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(1);
		}
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
