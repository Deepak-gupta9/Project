package main;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class StartMenu {
	public static JLabel background;
	public static JButton playButton;
	public static void StartScreen()
	{
		background = new JLabel();
		background.setLayout(null);
		background.setLocation(0,0);
		background.setSize(594,571);
		background.setVisible(true);
		background.setOpaque(true);
		background.setFocusable(true);
		background.setBackground(Color.ORANGE);;
		MainApplication.mainwindow.add(background);
		
		
		ImageIcon backgroundIcon = new ImageIcon(MainApplication.class.getResource("/resources/startScreen.png"));
		Image backgroundImage = ImageManipulation.getScaledImage(backgroundIcon.getImage(),594,571);
		background.setIcon(new ImageIcon(backgroundImage));
		
		
		playButton = new JButton();
		playButton.setLocation(230,330);
		playButton.setSize(130,40);;
		playButton.setOpaque(false);
		playButton.setContentAreaFilled(false);
		playButton.setBorderPainted(false);
		playButton.setFocusPainted(false);
		background.add(playButton);

		ImageIcon playButtonIcon = new ImageIcon(MainApplication.class.getResource("/resources/playbutton1.png"));
		Image playButtonImage = ImageManipulation.getScaledImage(playButtonIcon.getImage(),120,40);
		playButton.setIcon(new ImageIcon(playButtonImage));
		
		ImageIcon playButtonPressIcon = new ImageIcon(MainApplication.class.getResource("/resources/playbutton2.png"));
		Image playButtonPressImage = ImageManipulation.getScaledImage(playButtonPressIcon.getImage(),120,40);
		playButton.setPressedIcon(new ImageIcon(playButtonPressImage));
		
		StartMenuListener.setPlayButtonAction();
	}
	public static void disableStartMenu(){
		background.removeAll();
		MainApplication.mainwindow.remove(background);
		MainApplication.mainwindow.repaint();
		background = null;
		playButton = null;
		}
}
