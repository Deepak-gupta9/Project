package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class ScoreBoard {
	//private static final Object CENTER = null;
	public static JLabel PlayPauseText;
	public static JLabel ScoreBoardUp;
	public static JLabel ScoreBoardDown;
	public static JButton Play;
	public static JButton Pause;
	public static Boolean isPaused = false;
	public static JLabel ScoreNumber;
	public static JLabel ScoreText; 
	public static JLabel DuckLostCount;
	public static JLabel DuckLostText; 
	
	public static void setScoreBoard()
	{
		setUpScreen();
		setDownScreen();
		addPlayListener();
		addPauseListener();
	}
	
	public static void setUpScreen()
	{
		ScoreBoardUp = new JLabel();
		ScoreBoardUp.setLayout(null);
		ScoreBoardUp.setLocation(394,0);
		ScoreBoardUp.setSize(190,571/2);
		ScoreBoardUp.setBackground(Color.orange);
		ScoreBoardUp.setVisible(true);
		ScoreBoardUp.setOpaque(true);
		ScoreBoardUp.setBorder(new LineBorder(Color.BLACK,5));
		MainApplication.mainwindow.add(ScoreBoardUp);
		
		ImageIcon ScoreBoardIcon = new ImageIcon(MainApplication.class.getResource("/resources/scoreboard.png"));
		Image ScoreBoardImage = ImageManipulation.getScaledImage(ScoreBoardIcon.getImage(), 200, 571/2);
		ScoreBoardUp.setIcon( new ImageIcon(ScoreBoardImage));
		
		// Add Play/Pause Text
		PlayPauseText = new JLabel("Play/Pause");
		PlayPauseText.setLayout(null);
		PlayPauseText.setLocation(50,10);
		PlayPauseText.setSize(100,50);
		PlayPauseText.setBackground(Color.orange);
		PlayPauseText.setVisible(true);
		PlayPauseText.setOpaque(false);
		PlayPauseText.setForeground(Color.ORANGE);
		PlayPauseText.setHorizontalAlignment(0);
		PlayPauseText.setFont(new Font("Arial ",Font.BOLD,18));
		ScoreBoardUp.add(PlayPauseText);
		
		Play = new JButton();
		Play.setLayout(null);
		Play.setLocation(40,70);
		Play.setOpaque(false);
		Play.setEnabled(false);
		Play.setContentAreaFilled(false);
		Play.setBorderPainted(false);
		Play.setSize(50,50);
		ScoreBoardUp.add(Play);
		ImageIcon PlayIcon = new ImageIcon(MainApplication.class.getResource("/resources/play.png"));
		Image PlayImage = ImageManipulation.getScaledImage(PlayIcon.getImage(), 50, 50);
		Play.setIcon( new ImageIcon(PlayImage));
		
		ImageIcon PlayPressedIcon = new ImageIcon(MainApplication.class.getResource("/resources/play-pressed.png"));
		Image PlayPressedImage = ImageManipulation.getScaledImage(PlayPressedIcon.getImage(), 50, 50);
		Play.setPressedIcon( new ImageIcon(PlayPressedImage));
		
		Pause = new JButton();
		Pause.setLayout(null);
		Pause.setLocation(100,68);
		Pause.setOpaque(false);
		Pause.setContentAreaFilled(false);
		Pause.setBorderPainted(false);
		Pause.setSize(55,55);
		ScoreBoardUp.add(Pause);
		ImageIcon PauseIcon = new ImageIcon(MainApplication.class.getResource("/resources/Pause.png"));
		Image PauseImage = ImageManipulation.getScaledImage(PauseIcon.getImage(), 55, 55);
		Pause.setIcon( new ImageIcon(PauseImage));
		
		ImageIcon PausePressedIcon = new ImageIcon(MainApplication.class.getResource("/resources/pause-pressed.png"));
		Image PausePressedImage = ImageManipulation.getScaledImage(PausePressedIcon.getImage(), 55, 55);
		Pause.setPressedIcon( new ImageIcon(PausePressedImage));
		
	}

	public static void setDownScreen()
	{
		ScoreBoardDown = new JLabel();
		ScoreBoardDown.setLayout(null);
		ScoreBoardDown.setLocation(394,571/2);
		ScoreBoardDown.setSize(190,571/2);
		ScoreBoardDown.setBackground(Color.orange);
		ScoreBoardDown.setVisible(true);
		ScoreBoardDown.setOpaque(true);
		ScoreBoardDown.setBorder(new LineBorder(Color.BLACK,4));
		MainApplication.mainwindow.add(ScoreBoardDown);
		
		ImageIcon ScoreIcon = new ImageIcon(MainApplication.class.getResource("/resources/scoreboard.png"));
		Image ScoreImage = ImageManipulation.getScaledImage(ScoreIcon.getImage(), 200, 571/2);
		ScoreBoardDown.setIcon( new ImageIcon(ScoreImage));
		
		// Add Score Text Label
		ScoreText = new JLabel("Score");
		ScoreText.setLayout(null);
		ScoreText.setLocation(33,10);
		ScoreText.setSize(100,70);
		ScoreText.setBackground(Color.orange);
		ScoreText.setVisible(true);
		ScoreText.setOpaque(false);
		ScoreText.setForeground(Color.ORANGE);
		//ScoreText.setHorizontalAlignment(0);
		ScoreText.setFont(new Font("Arial ",Font.BOLD,17));
		ScoreBoardDown.add(ScoreText);
		
		// Add Score
		ScoreNumber = new JLabel("000");
		ScoreNumber.setLayout(null);
		ScoreNumber.setLocation(41,10);
		ScoreNumber.setSize(170,120);
		ScoreNumber.setBackground(Color.orange);
		ScoreNumber.setVisible(true);
		ScoreNumber.setOpaque(false);
		ScoreNumber.setForeground(Color.RED);
		//ScoreNumber.setHorizontalAlignment(0);
		ScoreNumber.setFont(new Font("Arial ",Font.BOLD,20));
		ScoreBoardDown.add(ScoreNumber);
		
		DuckLostText = new JLabel("Duck lost");
		DuckLostText.setLayout(null);
		DuckLostText.setLocation(100,10);
		DuckLostText.setSize(100,70);
		DuckLostText.setBackground(Color.orange);
		DuckLostText.setVisible(true);
		DuckLostText.setOpaque(false);
		DuckLostText.setForeground(Color.ORANGE);
		//ScoreText.setHorizontalAlignment(0);
		DuckLostText.setFont(new Font("Arial ",Font.BOLD,17));
		ScoreBoardDown.add(DuckLostText);
		
		// Add Score
		DuckLostCount = new JLabel("000");
		DuckLostCount.setLayout(null);
		DuckLostCount.setLocation(120,10);
		DuckLostCount.setSize(170,120);
		DuckLostCount.setBackground(Color.orange);
		DuckLostCount.setVisible(true);
		DuckLostCount.setOpaque(false);
		DuckLostCount.setForeground(Color.RED);
		//ScoreNumber.setHorizontalAlignment(0);
		DuckLostCount.setFont(new Font("Arial ",Font.BOLD,20));
		ScoreBoardDown.add(DuckLostCount);


	}
	
	public static void addPlayListener()
	{
		Play.addActionListener(new ActionListener()
				{
					@Override
					public void actionPerformed(ActionEvent e) 
					{
						Play.setEnabled(false);
						Pause.setEnabled(true);
						isPaused = false;
					}
				}
				);
	}
	public static void addPauseListener()
	{
		Pause.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Play.setEnabled(true);
				Pause.setEnabled(false);
				isPaused = true;
			}
		}
		);
	}
}