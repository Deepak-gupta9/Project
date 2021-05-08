package main;

import java.awt.Point;

public class AttackerMoverThread extends Thread
{
	Boolean isMoveForward = true;
	
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(5);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			if(ScoreBoard.isPaused)
			{
				continue;
			}
			
			moveTop();
		}  // While Loop End Here
	} // Run Method Close Here
	
	public void moveTop()
	{
		Point point = MainBackground.attacker.getLocation();
		int x = point.x;
		int y = point.y;
		x=x+(isMoveForward?+1:-1);
		if(x<=-3)
		{
			isMoveForward = true;
			return;
		}
		else if(x>=350)
		{
			isMoveForward = false;
			return;
		}
		MainBackground.attacker.setLocation(x,y);
		
	}  // MoveTop Method Close Here
	
} //AttackerMoverThread Class End Here
