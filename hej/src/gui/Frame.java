package gui;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final Frame instance = new Frame();
	
	public Frame() {
		Frame.instance.setSize(300, 400);
		Frame.instance.setLocationRelativeTo(null);
		
	}
	
}
