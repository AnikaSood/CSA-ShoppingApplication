package UI;
import code.*;
import java.util.List;
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
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try 
				{
					StartingScreenUI window = new StartingScreenUI();
					window.frame.setVisible(true);
					window.getContentPane();
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
		
		frame.setBounds(0, 0, 1223, 710);
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
		
		StartingScreenControl ssc = new StartingScreenControl();

		
		btnSearch.setBorderPainted(false);
		btnSearch.setBackground(Color.ORANGE);
		btnSearch.setOpaque(true);
		btnSearch.setBounds(1045, 6, 99, 39);
		frame.getContentPane().add(btnSearch);
		
		JTextArea txtrSearchBar = new JTextArea();
		txtrSearchBar.setDragEnabled(false);
		txtrSearchBar.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		txtrSearchBar.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		txtrSearchBar.setBounds(266, 16, 756, 16);
		frame.getContentPane().add(txtrSearchBar);
	
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		
		panel.setBounds(110, 6, 144, 39);
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
		label.setBounds(168, 6, 881, 39);
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
		label_1.setBounds(0, 0, 1247, 50);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBounds(0, 53, 1212, 8);
		frame.getContentPane().add(label_2);
		
		JLabel topLabel = new JLabel("Today's Top Picks");
		topLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 26));
		topLabel.setBounds(10, 68, 253, 39);
		frame.getContentPane().add(topLabel);
		
		JLabel p1IMAGE = new JLabel("");
		p1IMAGE.setOpaque(true);
		p1IMAGE.setBackground(Color.LIGHT_GRAY);
		p1IMAGE.setBounds(16, 103, 334, 238);
		frame.getContentPane().add(p1IMAGE);
		
		JLabel p2IMAGE = new JLabel("");
		p2IMAGE.setOpaque(true);
		p2IMAGE.setBackground(Color.LIGHT_GRAY);
		p2IMAGE.setBounds(432, 103, 334, 238);
		frame.getContentPane().add(p2IMAGE);
		
		JLabel p3IMAGE = new JLabel("");
		p3IMAGE.setOpaque(true);
		p3IMAGE.setBackground(Color.LIGHT_GRAY);
		p3IMAGE.setBounds(846, 103, 334, 238);
		frame.getContentPane().add(p3IMAGE);
		
		JLabel p4IMAGE = new JLabel("");
		p4IMAGE.setOpaque(true);
		p4IMAGE.setBackground(Color.LIGHT_GRAY);
		p4IMAGE.setBounds(16, 404, 334, 238);
		frame.getContentPane().add(p4IMAGE);
		
		JLabel p5IMAGE = new JLabel("");
		p5IMAGE.setOpaque(true);
		p5IMAGE.setBackground(Color.LIGHT_GRAY);
		p5IMAGE.setBounds(432, 404, 334, 238);
		frame.getContentPane().add(p5IMAGE);
		
		JButton p1NAMEbtn = new JButton("Product Name");
		
		p1NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p1NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p1NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p1NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p1NAMEbtn.setBorderPainted(false);
		p1NAMEbtn.setBounds(0, 353, 334, 29);
		frame.getContentPane().add(p1NAMEbtn);
		
		JLabel p1PRICElbl = new JLabel("$");
		p1PRICElbl.setBounds(33, 376, 65, 16);
		frame.getContentPane().add(p1PRICElbl);
		
		JButton p2NAMEbtn = new JButton("Product Name");
		p2NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p2NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p2NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p2NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p2NAMEbtn.setBorderPainted(false);
		p2NAMEbtn.setBounds(402, 353, 371, 29);
		frame.getContentPane().add(p2NAMEbtn);
		
		JLabel p2PRICElbl = new JLabel("$");
		p2PRICElbl.setBounds(432, 376, 65, 16);
		frame.getContentPane().add(p2PRICElbl);
		
		JButton p3NAMEbtn = new JButton("Product Name");
		p3NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p3NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p3NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p3NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p3NAMEbtn.setBorderPainted(false);
		p3NAMEbtn.setBounds(817, 353, 400, 29);
		frame.getContentPane().add(p3NAMEbtn);
		
		JLabel p3PRICElbl = new JLabel("$");
		p3PRICElbl.setBounds(846, 376, 65, 16);
		frame.getContentPane().add(p3PRICElbl);
		
		JButton p4NAMEbtn = new JButton("Product Name");
		p4NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p4NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p4NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p4NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p4NAMEbtn.setBorderPainted(false);
		p4NAMEbtn.setBounds(-12, 642, 213, 29);
		frame.getContentPane().add(p4NAMEbtn);
		
		JLabel p4PRICElbl = new JLabel("$");
		p4PRICElbl.setBounds(16, 667, 65, 16);
		frame.getContentPane().add(p4PRICElbl);
		
		JButton p5NAMEbtn = new JButton("Product Name");
		p5NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p5NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p5NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p5NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p5NAMEbtn.setBorderPainted(false);
		p5NAMEbtn.setBounds(413, 642, 213, 29);
		frame.getContentPane().add(p5NAMEbtn);
		
		JLabel p5PRICElbl = new JLabel("$");
		p5PRICElbl.setBounds(432, 667, 65, 16);
		frame.getContentPane().add(p5PRICElbl);
		
		JLabel p6IMAGE = new JLabel("");
		p6IMAGE.setOpaque(true);
		p6IMAGE.setBackground(Color.LIGHT_GRAY);
		p6IMAGE.setBounds(846, 404, 334, 238);
		frame.getContentPane().add(p6IMAGE);
		
		JButton p6NAMEbtn = new JButton("Product Name");
		p6NAMEbtn.setVerticalAlignment(SwingConstants.BOTTOM);
		p6NAMEbtn.setHorizontalTextPosition(SwingConstants.LEFT);
		p6NAMEbtn.setHorizontalAlignment(SwingConstants.LEFT);
		p6NAMEbtn.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		p6NAMEbtn.setBorderPainted(false);
		p6NAMEbtn.setBounds(827, 642, 213, 29);
		frame.getContentPane().add(p6NAMEbtn);
		
		JLabel p6PRICElbl = new JLabel("$");
		p6PRICElbl.setBounds(846, 667, 65, 16);
		frame.getContentPane().add(p6PRICElbl);
		
		
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
		

		//WHEN CART BUTTON IS CLICKED, IT WILL OPEN CARTUI
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CartUI frame = new CartUI();
				CartUI.openFrame();
				
			}
		});
/********Setting the top picks*************/	
		
		Storage stor = new Storage();
		List<Product> allProds = stor.getProds();
		
		
		
		//Set Images
		java.awt.Image imgP1 = new ImageIcon(allProds.get(0).getImage()).getImage();
		p1IMAGE.setIcon(new ImageIcon(imgP1));
		
		java.awt.Image imgP2 = new ImageIcon(allProds.get(1).getImage()).getImage();
		p2IMAGE.setIcon(new ImageIcon(imgP2));
		
		java.awt.Image imgP3 = new ImageIcon(allProds.get(2).getImage()).getImage();
		p3IMAGE.setIcon(new ImageIcon(imgP3));
		
		java.awt.Image imgP4 = new ImageIcon(allProds.get(3).getImage()).getImage();
		p4IMAGE.setIcon(new ImageIcon(imgP4));
		
		java.awt.Image imgP5 = new ImageIcon(allProds.get(4).getImage()).getImage();
		p5IMAGE.setIcon(new ImageIcon(imgP5));
		
		java.awt.Image imgP6 = new ImageIcon(allProds.get(5).getImage()).getImage();
		p6IMAGE.setIcon(new ImageIcon(imgP6));
		//Set Product Name
		p1NAMEbtn.setText(allProds.get(0).getName());
		p2NAMEbtn.setText(allProds.get(1).getName());
		p3NAMEbtn.setText(allProds.get(2).getName());
		p4NAMEbtn.setText(allProds.get(3).getName());
		p5NAMEbtn.setText(allProds.get(4).getName());
		p6NAMEbtn.setText(allProds.get(5).getName());
		
		//Set Price
		
		p1PRICElbl.setText("$ "+allProds.get(0).getPrice());
		p2PRICElbl.setText("$ "+allProds.get(1).getPrice());
		p3PRICElbl.setText("$ "+allProds.get(2).getPrice());
		p4PRICElbl.setText("$ "+allProds.get(3).getPrice());
		p5PRICElbl.setText("$ "+allProds.get(4).getPrice());
		p6PRICElbl.setText("$ "+allProds.get(5).getPrice());

/**********WHEN THE SEARCH BUTTON IS CLICKED*************/
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				topLabel.setText("Results:");
				
				String searchInput = txtrSearchBar.getText();
				SearchControl results = new SearchControl();
				List<Product> result = results.searchReturn(searchInput);
				
				JLabel[] resultIMGS = {p1IMAGE, p2IMAGE, p3IMAGE, p4IMAGE, p5IMAGE, p6IMAGE};
				JButton[] resultNAME = {p1NAMEbtn, p2NAMEbtn, p3NAMEbtn, p4NAMEbtn, p5NAMEbtn, p6NAMEbtn};
				JLabel[] resultPRICE = {p1PRICElbl, p2PRICElbl, p3PRICElbl, p4PRICElbl, p5PRICElbl, p6PRICElbl};
				
				
				int i = 0;
				int numOfResults = result.size();
				
				for (i = 0; i<numOfResults; i++)
				{
					java.awt.Image toSet = new ImageIcon(result.get(i).getImage()).getImage();
					resultIMGS[i].setIcon(new ImageIcon(toSet)); //set image
					resultNAME[i].setText(result.get(i).getName()); //set product name
					resultPRICE[i].setText("$ "+result.get(i).getPrice()+"");
				}	
				if (numOfResults<6)
				{
					int rem = (6-numOfResults)-1;
					
					for (i=5; i<=rem; i--)
					{
						
						resultIMGS[i].setBackground(Color.WHITE); //set image
						resultNAME[i].setText(""); //set product name
						resultPRICE[i].setText("");
					}
					
				}
				
				
				
				
				
			}
		});
/******************ACTION PERFORMED FOR PRODUCTS, OPEN DESCRIPT************************************/
		
		p1NAMEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdDescriptUI frame = new ProdDescriptUI(p1NAMEbtn.getText()); //passes the name of the button clicked to the constructor of the prod class
				ProdDescriptUI.openFrame(); 
			}
		});
		p2NAMEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdDescriptUI frame = new ProdDescriptUI(p2NAMEbtn.getText()); 
				ProdDescriptUI.openFrame(); 
			}
		});
		p3NAMEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdDescriptUI frame = new ProdDescriptUI(p3NAMEbtn.getText()); 
				ProdDescriptUI.openFrame(); 
			}
		});
		p4NAMEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdDescriptUI frame = new ProdDescriptUI(p4NAMEbtn.getText()); 
				ProdDescriptUI.openFrame(); 
			}
		});
		p5NAMEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdDescriptUI frame = new ProdDescriptUI(p5NAMEbtn.getText()); 
				ProdDescriptUI.openFrame(); 
			}
		});
		p6NAMEbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProdDescriptUI frame = new ProdDescriptUI(p6NAMEbtn.getText()); 
				ProdDescriptUI.openFrame(); 
			}
		});
	}
}


