package main;

public class LevelManager {
	public static void StartLevelOne()
	{
				// Set_Background
				MainBackground.setBackground();
				
				MainBackground.background.requestFocus();
				// Move Bucket Left/Right
				MainBackground.background.addKeyListener(new BucketMoverListener());
				
				// Move Attacker
				AttackerMoverThread attackermoverthread = new AttackerMoverThread();
				attackermoverthread.start();
				
				// Duck Creator
				DuckInitiatorThread duckinitiatorthread = new DuckInitiatorThread();
				duckinitiatorthread.start();
				
				// Set ScoreBoard
				ScoreBoard.setScoreBoard();
				
	}

}
