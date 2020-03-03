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

public class CartUI extends JFrame {

	/**
	 * 1223, 712
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
	public static void openFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartUI window = new CartUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public CartUI() {
	
		frame = new JFrame();
		frame.setBounds(0, 0, 1223, 710);

		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.setBounds(0, 0, 1370, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		
		
		java.awt.Image image = new ImageIcon("ui/KPLogo.jpg").getImage();
		java.awt.Image cart = new ImageIcon("ui/rsz_shopping_cart_large.png").getImage();
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setBounds(87, 172, 334, 238);
		frame.getContentPane().add(lblNewLabel);
		
		
		JButton btnCart = new JButton("");
		
		
		btnCart.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		btnCart.setForeground(Color.WHITE);
		btnCart.setRequestFocusEnabled(false);
		btnCart.setOpaque(true);
		btnCart.setBorderPainted(false);
		btnCart.setBackground(Color.WHITE);
		btnCart.setBounds(1156, 6, 39, 39);
		frame.getContentPane().add(btnCart);
		btnCart.setIcon(new ImageIcon(cart));
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBorderPainted(false);
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.setOpaque(true);
		btnSearch.setBounds(1045, 6, 99, 39);
		frame.getContentPane().add(btnSearch);
		
		JTextArea txtrSearchBar = new JTextArea();
		txtrSearchBar.setDragEnabled(false);
		txtrSearchBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtrSearchBar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtrSearchBar.setBounds(293, 16, 729, 16);
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
		label.setBounds(250, 6, 799, 39);
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
		homeButton.setBounds(16, 6, 82, 39);
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
		
		JLabel lblYourCart = new JLabel("Your Cart");
		lblYourCart.setBackground(Color.ORANGE);
		lblYourCart.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		lblYourCart.setBounds(34, 92, 193, 39);
		frame.getContentPane().add(lblYourCart);
		
		JLabel label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.LIGHT_GRAY);
		label_4.setBounds(518, 172, 334, 238);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.LIGHT_GRAY);
		label_5.setBounds(939, 172, 334, 238);
		frame.getContentPane().add(label_5);
		
		JButton btnBack = new JButton("<");
		btnBack.setBounds(50, 278, 25, 29);
		frame.getContentPane().add(btnBack);
		
		JButton nextBTN = new JButton(">");
		nextBTN.setBounds(1296, 278, 25, 29);
		frame.getContentPane().add(nextBTN);
		
		JLabel lblProdName = new JLabel("Prod Name");
		lblProdName.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblProdName.setBounds(87, 411, 334, 44);
		frame.getContentPane().add(lblProdName);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		lblPrice.setBounds(87, 452, 334, 16);
		frame.getContentPane().add(lblPrice);
		
		JButton btnNewButton = new JButton("Remove Item");
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(new Color(204, 51, 0));
		btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		btnNewButton.setBounds(87, 480, 334, 16);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label_7 = new JLabel("Prod Name");
		label_7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		label_7.setBounds(518, 411, 334, 44);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Price");
		label_8.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label_8.setBounds(518, 452, 334, 16);
		frame.getContentPane().add(label_8);
		
		JButton button = new JButton("Remove Item");
		button.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		button.setBounds(518, 480, 334, 16);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Remove Item");
		button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		button_1.setBounds(939, 480, 334, 16);
		frame.getContentPane().add(button_1);
		
		JLabel label_9 = new JLabel("Prod Name");
		label_9.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		label_9.setBounds(939, 411, 334, 44);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Price");
		label_10.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		label_10.setBounds(939, 452, 334, 16);
		frame.getContentPane().add(label_10);
		
		JLabel label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBounds(43, 164, 1284, 344);
		frame.getContentPane().add(label_3);
		
		JLabel lblTotalPrice = new JLabel("Total: $");
		lblTotalPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblTotalPrice.setBounds(1106, 520, 99, 44);
		frame.getContentPane().add(lblTotalPrice);
		
		JLabel label_11 = new JLabel("12345678");
		label_11.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		label_11.setBounds(1200, 520, 127, 44);
		frame.getContentPane().add(label_11);
		
		JButton btnNewButton_1 = new JButton("Pay Now");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(1111, 574, 210, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_12 = new JLabel("");
		label_12.setOpaque(true);
		label_12.setBounds(25, 92, 1320, 39);
		frame.getContentPane().add(label_12);
		
		
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
		
		
	}
}


