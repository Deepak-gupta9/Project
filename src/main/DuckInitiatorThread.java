package main;

import java.util.Random;

public class DuckInitiatorThread extends Thread{
	Random random = new Random();
	public void run()
	{
		while(true)
		{
			try{
				Thread.sleep(randomTime());
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			if(ScoreBoard.isPaused)
			{
				continue;
			}
			DuckMoverThread duckmoverthread = new DuckMoverThread();
			duckmoverthread.start();
		}
	} // Run Method Ends Here

	public int randomTime()
	{
		return random.nextInt(2000 - 300 +1) + 300;
	}
}
