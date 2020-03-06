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
	
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
	/********** OPEN FRAME METHOD ***********/	
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
	/**
	 * Instance Variables 
	 */
	
	
	private JLabel lblTotalPrice;
	
	//Product 1 
	private JLabel prod1lbl; 
	private JLabel pprod1lbl;
	private JButton remove1;
	
	//Product 2
	private JLabel prod2lbl;
	private JLabel pprod2lbl;
	private JButton remove2;
	
	//Product 3
	private JLabel prod3lbl;
	private JLabel pprod3lbl;
	private JButton remove3;
	
	//Back & Next buttons
	private JButton btnNext;
	private JButton btnBack;
	
	//Image labels
	private JLabel img1;
	private JLabel img2;
	private JLabel img3;
	
	//tracking variables
	private int totalItems; //track total # of items in the cart
	private	int p1Disp; //tracks what # on the cart list to start current batch of 3 at
	private int remDisp; //remaining items to display
	private int p3Disp; 
	private int remNext; //tracks how many times they user can click "next"
	
	//GUI Elements
	private JLabel[] imgArr = new JLabel[3];
	private JLabel[] nameArr = new JLabel[3];
	private JLabel[] priceArr = new JLabel[3];
	private JButton[] remArr = new JButton[3];
	
	//The cart
	private List<Product> myCart = new ArrayList<Product>(); 
	
	
/************ CART UI CONSTRUCTOR ***************/	
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
		lblYourCart.setBounds(29, 92, 193, 39);
		frame.getContentPane().add(lblYourCart);
		
		btnNext = new JButton(">");
		
		btnNext.setBounds(1217, 278, 25, 29);
		frame.getContentPane().add(btnNext);
		
		lblTotalPrice = new JLabel("Total: $");
		lblTotalPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblTotalPrice.setBounds(1045, 520, 99, 44);
		frame.getContentPane().add(lblTotalPrice);
		
		JLabel total = new JLabel();
		total.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		total.setBounds(1138, 520, 120, 44);
		frame.getContentPane().add(total);
		
		
		JButton btnNewButton_1 = new JButton("Pay Now");
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(1048, 576, 210, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_12 = new JLabel("");
		label_12.setOpaque(true);
		label_12.setBounds(16, 92, 1242, 39);
		frame.getContentPane().add(label_12);
		
		btnBack = new JButton("<");
		btnBack.setBounds(24, 278, 25, 29);
		frame.getContentPane().add(btnBack);
		
		img3 = new JLabel("");
		img3.setOpaque(true);
		img3.setBackground(SystemColor.window);
		img3.setBounds(868, 170, 334, 238);
		frame.getContentPane().add(img3);
		
		JLabel img2 = new JLabel("");
		img2.setOpaque(true);
		img2.setBackground(SystemColor.window);
		img2.setBounds(448, 173, 334, 238);
		frame.getContentPane().add(img2);
		
		JLabel img1 = new JLabel("");
		img1.setOpaque(true);
		img1.setBackground(SystemColor.window);
		img1.setBounds(50, 170, 334, 238);
		frame.getContentPane().add(img1);
		
		prod1lbl = new JLabel("");
		prod1lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		prod1lbl.setBounds(53, 411, 334, 44);
		frame.getContentPane().add(prod1lbl);
		
		pprod1lbl = new JLabel("");
		pprod1lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pprod1lbl.setBounds(53, 452, 334, 16);
		frame.getContentPane().add(pprod1lbl);
		
		prod2lbl = new JLabel("");
		prod2lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		prod2lbl.setBounds(450, 411, 334, 44);
		frame.getContentPane().add(prod2lbl);
		
		pprod2lbl = new JLabel("");
		pprod2lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pprod2lbl.setBounds(450, 452, 334, 16);
		frame.getContentPane().add(pprod2lbl);
		
		prod3lbl = new JLabel("");
		prod3lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		prod3lbl.setBounds(871, 411, 334, 44);
		frame.getContentPane().add(prod3lbl);
		
		pprod3lbl = new JLabel("");
		pprod3lbl.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		pprod3lbl.setBounds(871, 452, 334, 16);
		frame.getContentPane().add(pprod3lbl);
		
		remove3 = new JButton("Remove Item");
		remove3.setVisible(false);
		remove3.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		remove3.setBounds(868, 480, 334, 16);
		frame.getContentPane().add(remove3);
		
		remove2 = new JButton("Remove Item");
		remove2.setVisible(false);
		remove2.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		remove2.setBounds(448, 480, 334, 16);
		frame.getContentPane().add(remove2);
		
		remove1 = new JButton("Remove Item");
		remove1.setVisible(false);
		remove1.setOpaque(true);
		remove1.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		remove1.setBackground(SystemColor.window);
		remove1.setBounds(50, 480, 334, 16);
		frame.getContentPane().add(remove1);
		
		JLabel label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setBounds(16, 157, 1242, 344);
		frame.getContentPane().add(label_3);
		
				
/*******************HOME BUTTON CLICKED************************/
		homeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StartingScreenUI frame = new StartingScreenUI();
				frame.openFrame();
				
			}
		});
/******************************** HOVERING OVER CATEGORIES DROP DOWN ******************************/
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
		
/****************************** BUTTON CLICKED IN THE CATEGROIES DROP DOWN ************************************/
		
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
		
/****************************** Upon opening this screen ************************************/

		/*
		 * variables necessary - counter for first item being displayed (p1disp), counter for total items (totalItems), counter for remaining to display(remDisp)
		 * 
		 * upon opening:
		 * 	check if there are more than 3 items in cart
		 * 		if yes display initial items and provide the next button
		 * 		else just display the initial items
		 *	
		 * when next is clicked: 
		 * 	check if there are still stuff remaining to disp
		 * 		if no hide the next button
		 * 
		 *  display the next three items
		 *  add the back option
		 *  
		 * When back is clicked:
		 * check if its the first three items in the cart being displayed
		 * 	if yes, hide the back option
		 * 
		 * display the previous three items
		 * 
		 * When remove item is clicked:
		 * 	remove that item from the cart list
		 * 	display the first three items in the cart 
		 * 	reset all counters so that its basically like they opened the cart again 
		 * 
		 * 
		 * 	
		 * when back is clicked : display previous 3 items
		 * when next clicked : display next 3 items
		 */
		

		
	
		//ARRAY INITIALIZATION
		 JLabel[] imgs = {img1, img2, img3};
		 JLabel[] names = {prod1lbl, prod2lbl, prod3lbl};
		 JLabel[] prices = {pprod1lbl, pprod2lbl, pprod3lbl};
		 JButton[] removes = {remove1, remove2, remove3};
		 
		 for (int x= 0; x<3; x++)
		 {
			 imgArr[x] = imgs[x];
			 nameArr[x] = names[x];
			 priceArr[x] = prices[x];
			 remArr[x] = removes[x];
		 }
		
		
		firstThree(); //EVERY TIME THE SCREEN IS OPENED IT WILL CALL THIS 
		
		
		/********* next button is clicked *********/
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myCart = Cart.cart;
				totalItems = myCart.size();

				
				//Reset all to invisible
				for (int x = 0; x <3; x++)
				{
					imgArr[x].setVisible(false);
					
					nameArr[x].setVisible(false);
					
					priceArr[x].setVisible(false);
					remArr[x].setVisible(false);
				}
				
				
				
				
				
				
				remDisp -= 3; //accounting for 3 before, this is the remainder to be displayed on this [age 
				p1Disp += 3;
				
				System.out.println(""+remDisp);

				if(remDisp <= 3) //three or less items need to be displayed
				{
					btnNext.setVisible(false);
					p3Disp += remDisp;
						
				}
				else
				{
					p3Disp += 3;
					System.out.println("p3 plus 3");
				}
				
				dispThree(p3Disp);
			}
		});
	}
	
	private void firstThree() //Display first three elements of the list 
	{
		
		myCart = Cart.cart; //getting items in the cart and assigning it to my cart
		
		p1Disp = 0; 
		
		totalItems = myCart.size();
		
		remDisp = totalItems;

		p3Disp = 3; 
		
		
		
		/*remNext = totalItems/3; 
		if (remNext % 3 == 0)
			remNext -=1;

*/
		if (totalItems <=3)
		{
			btnBack.setVisible(false);
			btnNext.setVisible(false);
			p3Disp = totalItems;
			
			
		}
		else
		{
			//remDisp = totalItems -3;
			btnBack.setVisible(true);
			btnNext.setVisible(true);
		}
		

		
		dispThree(p3Disp);


	}
	
	public void dispThree(int endNum)
	{
		myCart = Cart.cart; //getting items in the cart and assigning it to my cart
		/*
		int end;
		if (totalItems<3)
		{
			end = totalItems;
		}
		else 
			end=endNum;*/
		
		int x = 0; 
		
		for (int i = p1Disp; i < endNum; i ++)
		{
			
				//display images
				imgArr[x].setVisible(true);
				java.awt.Image imgToSet = new ImageIcon(myCart.get(i).getImage()).getImage();
				imgArr[x].setIcon(new ImageIcon(imgToSet));
				
				//display product name
				nameArr[x].setVisible(true);
				nameArr[x].setText(myCart.get(i).getName());
				
				//display price
				priceArr[x].setVisible(true);
				priceArr[x].setText("$"+myCart.get(i).getPrice());
		
				remArr[x].setVisible(true);
			x++;
			
		}
	
		
	}
	
	
	
	

}



