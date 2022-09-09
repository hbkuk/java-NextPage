package javaTest;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class app1 {

	private JFrame frame;
	private final JPanel pannelFirstPage = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app1 window = new app1();
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
	public app1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("app1");
		frame.setBounds(100, 100, 955, 523);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		pannelFirstPage.setBounds(0, 0, 941, 486);
		frame.getContentPane().add(pannelFirstPage);
		pannelFirstPage.setLayout(null);
		
		JButton btnNextPage = new JButton("Next Page");
		btnNextPage.setBounds(339, 244, 270, 46);
		btnNextPage.setFont(new Font("Arial", Font.PLAIN, 33));
		pannelFirstPage.add(btnNextPage);
		
		JPanel pannelEndPage = new JPanel();
		pannelEndPage.setBounds(0, 0, 941, 486);
		frame.getContentPane().add(pannelEndPage);
		pannelEndPage.setLayout(null);
		
		JButton btnFirstPage = new JButton("First Page");
		btnFirstPage.setFont(new Font("Arial", Font.PLAIN, 33));
		btnFirstPage.setBounds(310, 212, 404, 128);
		pannelEndPage.add(btnFirstPage);
		
		pannelEndPage.setVisible(false);
		btnNextPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pannelEndPage.setVisible(true);
				pannelFirstPage.setVisible(false);
			}
			
		});
		btnFirstPage.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pannelFirstPage.setVisible(true);
				pannelEndPage.setVisible(false);
				
			}
			
		});
	}
}