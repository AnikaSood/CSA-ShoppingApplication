package UI;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Component;
import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class StartingScreenUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingScreenUI window = new StartingScreenUI();
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
	public StartingScreenUI() {
	
		frame = new JFrame();
		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.setBounds(0, 0, 1370, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		
		
		java.awt.Image image = new ImageIcon("ui/KPLogo.jpg").getImage();
		java.awt.Image cart = new ImageIcon("ui/rsz_shopping_cart_large.png").getImage();
		
		
		JButton btnCart = new JButton("");
		
		//WHEN CART BUTTON IS CLICKED, IT WILL OPEN CARTUI
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartUI frame = new CartUI();
				frame.openFrame();
				
			}
		});
		btnCart.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnCart.setForeground(Color.WHITE);
		btnCart.setRequestFocusEnabled(false);
		btnCart.setOpaque(true);
		btnCart.setBorderPainted(false);
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(1309, 6, 39, 39);
		frame.getContentPane().add(btnCart);
		btnCart.setIcon(new ImageIcon(cart));
		
		JButton btnSearch = new JButton("Search");
		
		StartingScreenControl ssc = new StartingScreenControl();

		
		btnSearch.setBorderPainted(false);
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.setOpaque(true);
		btnSearch.setBounds(1185, 6, 99, 39);
		frame.getContentPane().add(btnSearch);
		
		JTextArea txtrSearchBar = new JTextArea();
		txtrSearchBar.setDragEnabled(false);
		txtrSearchBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtrSearchBar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtrSearchBar.setBounds(308, 17, 778, 16);
		frame.getContentPane().add(txtrSearchBar);
	
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		
		panel.setBounds(147, 6, 144, 39);
		frame.getContentPane().add(panel);
		
		JButton btnCategories = new JButton("   Categories    ");
		btnCategories.setBorderPainted(false);
		btnCategories.setBackground(new Color(211, 211, 211));
		btnCategories.setOpaque(true);
		
		JButton btnCategories_1 = new JButton("     Categories    ");
		btnCategories_1.setOpaque(true);
		btnCategories_1.setBorderPainted(false);
		btnCategories_1.setBackground(new Color(211, 211, 211));
		panel.add(btnCategories_1);
		
		JButton catBooks = new JButton("        Books       ");
		
		catBooks.setOpaque(true);
		catBooks.setBorderPainted(false);
		catBooks.setBackground(Color.LIGHT_GRAY);
		panel.add(catBooks);
		
		JButton catMovies = new JButton("        Movies      ");
		catMovies.setOpaque(true);
		catMovies.setBorderPainted(false);
		catMovies.setBackground(Color.LIGHT_GRAY);
		panel.add(catMovies);
		
		JButton catSchool = new JButton("School Supplies");
		catSchool.setOpaque(true);
		catSchool.setBorderPainted(false);
		catSchool.setBackground(Color.LIGHT_GRAY);
		panel.add(catSchool);
		
		JButton catShoes = new JButton("       Shoes        ");
		catShoes.setOpaque(true);
		catShoes.setBorderPainted(false);
		catShoes.setBackground(Color.LIGHT_GRAY);
		panel.add(catShoes);
		
		JLabel label = new JLabel("            ");
		label.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(169, 169, 169)));
		label.setBounds(259, 6, 952, 39);
		frame.getContentPane().add(label);
		label.setBackground(Color.WHITE);
		label.setOpaque(true);
		
		JButton homeButton = new JButton("");
		homeButton.setRequestFocusEnabled(false);
		homeButton.setOpaque(true);
		homeButton.setForeground(Color.WHITE);
		homeButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		homeButton.setBorderPainted(false);
		homeButton.setBackground(Color.WHITE);
		homeButton.setBounds(28, 6, 82, 39);
		frame.getContentPane().add(homeButton);
		
		homeButton.setIcon(new ImageIcon(image));
		
		JLabel label_1 = new JLabel("            ");
		label_1.setOpaque(true);
		label_1.setBackground(new Color(255, 255, 255));
		label_1.setBounds(0, 0, 1370, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBounds(0, 53, 1370, 7);
		frame.getContentPane().add(label_2);
		
		JLabel topLabel = new JLabel("Today's Top Picks");
		topLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		topLabel.setBounds(55, 84, 253, 39);
		frame.getContentPane().add(topLabel);
		
		JLabel p1IMAGE = new JLabel("");
		p1IMAGE.setOpaque(true);
		p1IMAGE.setBackground(Color.WHITE);
		p1IMAGE.setBounds(55, 135, 334, 238);
		frame.getContentPane().add(p1IMAGE);
		
		JLabel p2IMAGE = new JLabel("");
		p2IMAGE.setOpaque(true);
		p2IMAGE.setBackground(Color.LIGHT_GRAY);
		p2IMAGE.setBounds(518, 135, 334, 238);
		frame.getContentPane().add(p2IMAGE);
		
		JLabel p3IMAGE = new JLabel("");
		p3IMAGE.setOpaque(true);
		p3IMAGE.setBackground(Color.LIGHT_GRAY);
		p3IMAGE.setBounds(966, 135, 334, 238);
		frame.getContentPane().add(p3IMAGE);
		
		JLabel p4IMAGE = new JLabel("");
		p4IMAGE.setOpaque(true);
		p4IMAGE.setBackground(Color.LIGHT_GRAY);
		p4IMAGE.setBounds(55, 442, 334, 238);
		frame.getContentPane().add(p4IMAGE);
		
		JLabel p5IMAGE = new JLabel("");
		p5IMAGE.setOpaque(true);
		p5IMAGE.setBackground(Color.LIGHT_GRAY);
		p5IMAGE.setBounds(518, 442, 334, 238);
		frame.getContentPane().add(p5IMAGE);
		
		JButton p1NAMEbtn = new JButton("Product Name");
		p1NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p1NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p1NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p1NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p1NAMEbtn.setBorderPainted(false);
		p1NAMEbtn.setBounds(38, 377, 207, 29);
		frame.getContentPane().add(p1NAMEbtn);
		
		JLabel p1PRICElbl = new JLabel("$");
		p1PRICElbl.setBounds(62, 404, 65, 16);
		frame.getContentPane().add(p1PRICElbl);
		
		JButton p2NAMEbtn = new JButton("Product Name");
		p2NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p2NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p2NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p2NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p2NAMEbtn.setBorderPainted(false);
		p2NAMEbtn.setBounds(497, 377, 207, 29);
		frame.getContentPane().add(p2NAMEbtn);
		
		JLabel p2PRICElbl = new JLabel("$");
		p2PRICElbl.setBounds(518, 404, 65, 16);
		frame.getContentPane().add(p2PRICElbl);
		
		JButton p3NAMEbtn = new JButton("Product Name");
		p3NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p3NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p3NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p3NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p3NAMEbtn.setBorderPainted(false);
		p3NAMEbtn.setBounds(944, 377, 207, 29);
		frame.getContentPane().add(p3NAMEbtn);
		
		JLabel p3PRICElbl = new JLabel("$");
		p3PRICElbl.setBounds(966, 404, 65, 16);
		frame.getContentPane().add(p3PRICElbl);
		
		JButton p4NAMEbtn = new JButton("Product Name");
		p4NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p4NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p4NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p4NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p4NAMEbtn.setBorderPainted(false);
		p4NAMEbtn.setBounds(32, 682, 213, 29);
		frame.getContentPane().add(p4NAMEbtn);
		
		JLabel p4PRICElbl = new JLabel("$");
		p4PRICElbl.setBounds(55, 709, 65, 16);
		frame.getContentPane().add(p4PRICElbl);
		
		JButton p5NAMEbtn = new JButton("Product Name");
		p5NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p5NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p5NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p5NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p5NAMEbtn.setBorderPainted(false);
		p5NAMEbtn.setBounds(497, 684, 213, 29);
		frame.getContentPane().add(p5NAMEbtn);
		
		JLabel p5PRICElbl = new JLabel("$");
		p5PRICElbl.setBounds(518, 709, 65, 16);
		frame.getContentPane().add(p5PRICElbl);
		
		JLabel p6IMAGE = new JLabel("");
		p6IMAGE.setOpaque(true);
		p6IMAGE.setBackground(Color.LIGHT_GRAY);
		p6IMAGE.setBounds(966, 442, 334, 238);
		frame.getContentPane().add(p6IMAGE);
		
		JButton p6NAMEbtn = new JButton("Product Name");
		p6NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p6NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p6NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p6NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p6NAMEbtn.setBorderPainted(false);
		p6NAMEbtn.setBounds(944, 684, 213, 29);
		frame.getContentPane().add(p6NAMEbtn);
		
		JLabel p6PRICElbl = new JLabel("$");
		p6PRICElbl.setBounds(966, 709, 65, 16);
		frame.getContentPane().add(p6PRICElbl);
		
		JButton btnSeeMoreResults = new JButton("See More Results");
		btnSeeMoreResults.setBackground(Color.ORANGE);
		btnSeeMoreResults.setOpaque(true);
		btnSeeMoreResults.setBorderPainted(false);
		btnSeeMoreResults.setBounds(1202, 718, 162, 29);
		frame.getContentPane().add(btnSeeMoreResults);
		
		
		//CATEGORIES HOVER
		btnCategories_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBounds(147, 6, 144, 175);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBounds(147, 6, 144, 39);
			}
		});
		
		//BOOKS HOVER
		catBooks.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBounds(147, 6, 144, 175);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBounds(147, 6, 144, 39);
			}
		});
		catMovies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBounds(147, 6, 144, 175);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBounds(147, 6, 144, 39);
			}
		});
		catShoes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBounds(147, 6, 144, 175);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBounds(147, 6, 144, 39);
			}
		});
		catSchool.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBounds(147, 6, 144, 175);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBounds(147, 6, 144, 39);
			}
		});
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel.setBounds(147, 6, 144, 175);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				panel.setBounds(147, 6, 144, 39);
			}
		});
/********Setting the top picks*************/		
//Set Images
		java.awt.Image imgP1 = new ImageIcon("ui/binder.jpg").getImage();
		p1IMAGE.setIcon(new ImageIcon(image));
//Set Product Name
//Set Price
		
		
		
/**********WHEN THE SEARCH BUTTON IS CLICKED*************/
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchInput = txtrSearchBar.getText();
			//	ssc.getImages(searchInput); //Returns list of all images needed when search is completed
			}
		});
/*******************************************************/
		
		
		
	}
}


