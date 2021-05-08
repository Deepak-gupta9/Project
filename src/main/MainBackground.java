package main;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.*;
public class MainBackground {
	public static JLabel bucket;
	public static JLabel bucket_jack;
	public static JLabel attacker;
	public static JLabel background;
	public static void setBackground()
	{
		// SET_MAIN_BACKGROUND_IMAGE
		background = new JLabel();
		background.setLayout(null);
		background.setLocation(0,0);
		background.setSize(394,571);
		background.setVisible(true);
		background.setOpaque(true);
		background.setFocusable(true);
		background.setBackground(Color.ORANGE);;
		MainApplication.mainwindow.add(background);
		ImageIcon backgroundIcon = new ImageIcon(MainApplication.class.getResource("/resources/background.png"));
		Image backgroundImage = ImageManipulation.getScaledImage(backgroundIcon.getImage(),394,571);
		background.setIcon(new ImageIcon(backgroundImage));
		
		// SET_BUCKET_IMAGE
		bucket = new JLabel();
		bucket.setLayout(null);
		bucket.setLocation(150,538);
		//bucket.setSize(394,571);
		bucket.setVisible(true);
		bucket.setOpaque(false);
		bucket.setBackground(Color.ORANGE);;
		background.add(bucket);
		ImageIcon bucketIcon = new ImageIcon(MainApplication.class.getResource("/resources/bucket.png"));
		bucket.setSize(bucketIcon.getIconWidth(),bucketIcon.getIconHeight());
		bucket.setIcon(bucketIcon);
		
		bucket_jack = new JLabel();
		bucket_jack.setLayout(null);
		bucket_jack.setLocation(2,2);
		bucket_jack.setSize(75,10);
		bucket_jack.setVisible(true);
		bucket_jack.setOpaque(false);
		bucket_jack.setBackground(Color.BLACK);;
		bucket.add(bucket_jack);
		
		//SET_ATTACKER_IMAGE
		attacker = new JLabel();
		attacker.setLayout(null);
		attacker.setLocation(150,0);
		attacker.setVisible(true);
		attacker.setOpaque(false);
		//attacker.setBackground(Color.ORANGE);;
		background.add(attacker);
		ImageIcon attackerIcon = new ImageIcon(MainApplication.class.getResource("/resources/attacker.png"));
		attacker.setSize(attackerIcon.getIconWidth(),attackerIcon.getIconHeight());
		attacker.setIcon(attackerIcon);
	}
/*
public static Image getScaledImage(Image srcImg,int w,int h)
{
	BufferedImage resizedImg = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
	Graphics2D g2 = resizedImg.createGraphics();
	g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);;
	g2.drawImage(srcImg,0,0,w,h,null);
	g2.dispose();
	return resizedImg;
}*/
} // Class Ends Here

