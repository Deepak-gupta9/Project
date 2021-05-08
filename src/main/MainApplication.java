package main;
import java.awt.Toolkit;
import java.awt.event.KeyListener;
import java.awt.Dimension;
import javax.swing.*;
//import java.awt.*;


public class MainApplication {
	public static JFrame mainwindow;
	public static void main(String args[])
	{
		mainwindow = new JFrame("Game");
		mainwindow.setLayout(null);
		mainwindow.setSize(600,600);
		mainwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainwindow.setResizable(false);
		//mainwindow.setLocation(80,10);
		Dimension dimension  =  Toolkit.getDefaultToolkit().getScreenSize();
		int x = dimension.width/2 - mainwindow.getWidth()/2;
		//System.out.println(dimension.width);
		//System.out.println(x);
		int y = dimension.height/2 - mainwindow.getHeight()/2;
		//System.out.println(dimension.height);
		//System.out.println(y);
		mainwindow.setLocation(x,y);
		
		//LevelManager.StartLevelOne();
		StartMenu.StartScreen();
		
		mainwindow.setVisible(true);
		
	}

}
