package main;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BucketMoverListener implements KeyListener
{
	@Override
	public void keyPressed(KeyEvent e)
	{
		KeyIdentify(e);
	}
	@Override
	public void keyReleased(KeyEvent e)
	{
		KeyIdentify(e);
	}
	@Override
	public void keyTyped(KeyEvent e)
	{
		KeyIdentify(e);	
	}
	
	void KeyIdentify(KeyEvent e)
	{
		if(ScoreBoard.isPaused)
		{
			return;
		}
		int keycode = e.getKeyCode();
		switch(keycode)
		{
			case KeyEvent.VK_LEFT:
			{
				moveBucket(false);
				break;
			}
			case KeyEvent.VK_RIGHT:
			{
				moveBucket(true);
				break;
			}
		}//Switch Case End here
	} //KeyIdentify Method End Here
	public void moveBucket(Boolean isMoveForward)
	{
		Point point = MainBackground.bucket.getLocation();
		int x = point.x;
		int y = point.y;
		x=x+(isMoveForward?+5:-5);
		//System.out.println(x);
		if(x<=-3 || x>=320)
			return;
		MainBackground.bucket.setLocation(x,y);
	}
}   //BucketMoverListener Class End Here
