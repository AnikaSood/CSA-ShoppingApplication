package ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

public class MainFrameUI extends JFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameUI window = new MainFrameUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrameUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 1370, 57);
		
		
		
		java.awt.Image image = new ImageIcon("ui/15332C7B-8ECE-46FD-895D-292C453BBFA8 (1).jpeg").getImage();
		JLabel logo = new JLabel("ghgfhgfhg");
		
		
		logo.setIcon(new ImageIcon(image));
		//frame.getContentPane().add(logo);
		frame.getContentPane().add(menuBar);
		
		menuBar.add(logo);
		
		//
		frame.setBounds(0, 0, 1370, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}
