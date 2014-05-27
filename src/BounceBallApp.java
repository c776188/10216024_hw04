//package chapter18;

import java.awt.*;
import javax.swing.*;

public class BounceBallApp extends JFrame {
	public BounceBallApp() {
		BallControl ball = new BallControl();
		add(ball, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		BounceBallApp frame = new BounceBallApp();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("BounceBallApp");
		frame.setSize(400, 320);
		frame.setVisible(true);
	}
}
