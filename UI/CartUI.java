package UI;

import java.awt.Color;
import java.util.ArrayList; 
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

import code.Cart;
import code.InCart;
import code.Product;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
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
		

	//	List<java.awt.Image> images = new ArrayList<java.awt.Image>(); 
		
	
		frame = new JFrame();
		frame.setBounds(0, 0, 1223, 710);

		frame.setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		
		frame.setBounds(0, 0, 1370, 775);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().setLayout(null);
		
		
		
		java.awt.Image image = new ImageIcon("ui/KPLogo.jpg").getImage();
		java.awt.Image cart = new ImageIcon("ui/rsz_shopping_cart_large.png").getImage();
		
		JLabel img1 = new JLabel("");
		img1.setOpaque(true);
		img1.setBackground(SystemColor.window);
		img1.setBounds(53, 172, 334, 238);
		frame.getContentPane().add(img1);
		
		
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
		lblYourCart.setBounds(16, 92, 193, 39);
		frame.getContentPane().add(lblYourCart);
		
		JLabel img2 = new JLabel("");
		img2.setOpaque(true);
		img2.setBackground(SystemColor.window);
		img2.setBounds(450, 172, 334, 238);
		frame.getContentPane().add(img2);
		
		JLabel img3 = new JLabel("");
		img3.setOpaque(true);
		img3.setBackground(SystemColor.window);
		img3.setBounds(871, 172, 334, 238);
		frame.getContentPane().add(img3);
		
		JButton btnBack = new JButton("<");
		btnBack.setBounds(23, 278, 25, 29);
		frame.getContentPane().add(btnBack);
		
		JButton nextBTN = new JButton(">");
		nextBTN.setBounds(1217, 278, 25, 29);
		frame.getContentPane().add(nextBTN);
		
		JLabel prod1lbl = new JLabel("");
		prod1lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		prod1lbl.setBounds(53, 411, 334, 44);
		frame.getContentPane().add(prod1lbl);
		
		JLabel pprod1lbl = new JLabel("");
		pprod1lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pprod1lbl.setBounds(53, 452, 334, 16);
		frame.getContentPane().add(pprod1lbl);
		
		JLabel prod2lbl = new JLabel("");
		prod2lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		prod2lbl.setBounds(450, 411, 334, 44);
		frame.getContentPane().add(prod2lbl);
		
		JLabel pprod2lbl = new JLabel("");
		pprod2lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pprod2lbl.setBounds(450, 452, 334, 16);
		frame.getContentPane().add(pprod2lbl);
		
		JLabel prod3lbl = new JLabel("");
		prod3lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		prod3lbl.setBounds(871, 411, 334, 44);
		frame.getContentPane().add(prod3lbl);
		
		JLabel pprod3lbl = new JLabel("");
		pprod3lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pprod3lbl.setBounds(871, 452, 334, 16);
		frame.getContentPane().add(pprod3lbl);
		
		JLabel lblTotalPrice = new JLabel("Total: $");
		lblTotalPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblTotalPrice.setBounds(1020, 520, 99, 44);
		frame.getContentPane().add(lblTotalPrice);
		
		JLabel label_11 = new JLabel("12345678");
		label_11.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		label_11.setBounds(1111, 520, 127, 44);
		frame.getContentPane().add(label_11);
		
		JButton btnNewButton_1 = new JButton("Pay Now");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(1036, 576, 210, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_12 = new JLabel("");
		label_12.setOpaque(true);
		label_12.setBounds(7, 92, 1320, 39);
		frame.getContentPane().add(label_12);
		/*	
		List<JLabel> prodName = new ArrayList<JLabel>(); 
		List<JLabel> prodPrice = new ArrayList<JLabel>(); 
		List<JLabel> prodImg = new ArrayList<JLabel>(); 
		
		
		for(int i = 0; i<InCart.inCart.size(); i++)
		{
			System.out.println(InCart.inCart.size());
			images.add(new ImageIcon(InCart.inCart.get(i).getImage()).getImage());

		}
		
		prodName.add(lblProdName);
		prodPrice.add(lblPrice);
	
		for(int i = 0; i<images.size(); i++)
		{
			prodImg.get(i).setIcon(new ImageIcon(images.get(i)));
			
		}
		
		for(int i =0; i<prodName.size(); i++) {
			
			prodImg.get(i).setVisible(false);//(Color.WHITE); //set image
			prodName.get(i).setText(""); //set product name
			prodPrice.get(i).setText("");					
		}

	
		
		for(int i =0; i <prodName.size(); i++)
		{
			prodImg.get(i).setVisible(true);
			prodName.get(i).setText(InCart.inCart.get(i).getName());
			prodPrice.get(i).setText("$" + InCart.inCart.get(i).getPrice());
		} */
		
		JButton remove1 = new JButton("Remove Item");
		remove1.setOpaque(true);
		remove1.setVisible(false);
		remove1.setBackground(new Color(204, 51, 0));
		remove1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		remove1.setBounds(53, 480, 334, 16);
		frame.getContentPane().add(remove1);
		
	
		JButton remove2 = new JButton("Remove Item");
		remove2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		remove2.setBounds(450, 480, 334, 16);
		remove2.setVisible(false);
		frame.getContentPane().add(remove2);
		
		JButton remove3 = new JButton("Remove Item");
		remove3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		remove3.setBounds(871, 480, 334, 16);
		remove3.setVisible(false);
		frame.getContentPane().add(remove3);
		
		JLabel label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBounds(16, 157, 1230, 344);
		frame.getContentPane().add(label_3);
		
				
		
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
		
/****************************** WHEN PEOPLE CLICK BUTTONS IN THE CATEGROIES DROP DOWN ************************************/
		
		catBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchScreen frame = new SearchScreen("book");
				frame.openFrame("book");
				
			}
		});
		catMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchScreen frame = new SearchScreen("movie");
				frame.openFrame("movie");			
			}
		});
		catSchool.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchScreen frame = new SearchScreen("school");
				frame.openFrame("school");				
			}
		});
		catShoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SearchScreen frame = new SearchScreen("shoe");
				frame.openFrame("shoe");				
			}
		});
		
/****************************** Displaying items in the cart ************************************/

		JLabel[] imageArr = {img1, img2, img3};
		JLabel[] prodNameArr = {prod1lbl, prod2lbl, prod3lbl};
		JLabel[] prodPriceArr = {pprod1lbl, pprod2lbl, pprod3lbl};
		JButton[] removeBtnArr = {remove1, remove2, remove3};
		
		List<Product> myCart = new ArrayList<Product>(); 
		myCart = Cart.cart; //getting items in the cart and assigning it to my cart
		
		int i = 0;
		int start = 0; //when next is clicked, start will be 3 & end will be 6 (this will continue when the next is clicked again)
		int totalItems = myCart.size();
		int end;
		


		if (totalItems <=3)
		{
			end = totalItems;
			//FIRST THREE ITEMS OF CART
			for (i = start; i < end; i ++)
			{
				//display images
				myCart.get(i).getImage();
				java.awt.Image toSet = new ImageIcon(myCart.get(i).getImage()).getImage();
				imageArr[i].setIcon(new ImageIcon(toSet));
				
				//display product name
				prodNameArr[i].setText(myCart.get(i).getName());
				
				//display price
				prodPriceArr[i].setText("$"+myCart.get(i).getPrice());

				removeBtnArr[i].setVisible(true);
			}
			
		}
		else
		{
			btnBack.setVisible(true);
		}
		
		
		
		

	
	
	
	}	
}



