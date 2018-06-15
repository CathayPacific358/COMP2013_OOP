import java.awt.*;
import javax.swing.*;

public class Snooker extends JFrame{//Make windows able to appear

	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x = 100;// x-axis
	double y = 100;// y-axis
	boolean right = true;//Set direction
	
	//Make the window
	public void paint(Graphics g) {
		System.out.println("Fresh for one time");
		g.drawImage(ball, (int)x, (int)y, null);//Use (int) to make double become integer
		g.drawImage(table, 0, 0, null);

		if(right) {
			x += 10;
		}else {
			x -= 10;
		}
		
		if(x > 856 - 40 - 30) {//856 is the length of table, 40 is the width of the frame of the table, 30 is diameter
			right = false;
		}
		else if(x < 40) {//40 is the width of the frame of the table
			right = true;
		}
		
	}
	
	//Load the game window
	void launchFrame() {
		setSize(300,300);
		setLocation(400,400);
		setVisible(true);
		
		//Refreshing images
		while(true) {
			repaint();
			try {
				Thread.sleep(40); //40ms, 1s = 1000ms, 40ms means refresh 20 times per sec
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("First Java Test");
		Snooker game = new Snooker();
		game.launchFrame();
	}
}
