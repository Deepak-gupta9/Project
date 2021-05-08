package main;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DuckMoverThread extends Thread{
	public JLabel duck;
	public JLabel duck_jack;
	public void run()
	{
		duck = new JLabel();
		duck.setLayout(null);
		duck.setLocation(0,0);
		duck.setSize(100,100);
		duck.setVisible(true);
		duck.setOpaque(false);
		//duck.setBackground(Color.orange);
		MainBackground.background.add(duck);
		
		duck_jack = new JLabel();
		duck_jack.setLayout(null);
		duck_jack.setLocation(15,2);
		duck_jack.setSize(40,30);
		duck_jack.setVisible(true);
		duck_jack.setOpaque(false);
		duck.setBackground(Color.BLACK);
		duck.add(duck_jack);
		
		ImageIcon duckIcon = new ImageIcon(MainApplication.class.getResource("/resources/duck.png"));
		Image duckImage = ImageManipulation.getScaledImage(duckIcon.getImage(), 80, 45);
		ImageIcon newUpdatedIcon = new ImageIcon(duckImage);
		
		duck.setSize(newUpdatedIcon.getIconWidth(),newUpdatedIcon.getIconHeight());
		duck.setIcon(newUpdatedIcon);
		Point attackerLocation = MainBackground.attacker.getLocation();
		duck.setLocation(attackerLocation.x, attackerLocation.y);
		while(true)
		{
			try{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			if(ScoreBoard.isPaused)
			{
				continue;
			}
			Boolean isExit = moveDuck();
			if(isExit)
			{
				MainBackground.background.remove(duck);
				MainBackground.background.repaint();
				duck = null;
				break;
			}
		}
	} // Run Method Ends Here
	
	public Boolean moveDuck()
	{
		Point point = duck.getLocation();
		int x = point.x;
		int y = point.y;
		y=y+1;
		if(y>600)
		{
			String ducklost = ScoreBoard.DuckLostCount.getText();
			Long ducklostnumber = Long.valueOf(ducklost) + 1;
			ScoreBoard.DuckLostCount.setText(ducklostnumber.toString());
			return true;
		}
		Rectangle duckJackRect = duck_jack.getBounds();
		Rectangle duckRect = duck_jack.getParent().getBounds();
		duckJackRect.setLocation(duckJackRect.x+duckRect.x , duckJackRect.y+duckRect.y);
		
		Rectangle bucketJackRect = MainBackground.bucket_jack.getBounds();
		Rectangle bucketRect = MainBackground.bucket_jack.getParent().getBounds();
		bucketJackRect.setLocation(bucketJackRect.x+bucketRect.x , bucketJackRect.y+bucketRect.y);
		
		if(duckJackRect.intersects(bucketJackRect))
		{
			String score = ScoreBoard.ScoreNumber.getText();
			Long scorenumber = Long.valueOf(score) + 1;
			ScoreBoard.ScoreNumber.setText(scorenumber.toString());
			return true;
		}
		duck.setLocation(x,y);
		return false;
	}

} // Class Ends Here
