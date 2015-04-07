/**
 * 
 */
package com.br.mestrado;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.br.mestrado.view.MainForm;

/**
 * @author VitorHugo
 *
 */
public class Main {

	public static void showOnScreen(int screen, JFrame frame)
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice[] gs = ge.getScreenDevices();
		if(screen> -1 && screen <gs.length)
		{
			//gs[screen].setFullScreenWindow(frame);
		}
		else if(gs.length>0)
		{
			//gs[0].setFullScreenWindow(frame);
		}
		else
		{
			throw new RuntimeException( "No Screens Found" );
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main.showOnScreen(0, new MainForm());
	}

}
