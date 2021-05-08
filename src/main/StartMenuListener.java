package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenuListener {
	public static void setPlayButtonAction()
	{
		StartMenu.playButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				StartMenu.disableStartMenu();
				LevelManager.StartLevelOne();
				
			}
			
		});
	}

}
