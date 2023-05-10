package FirstProject_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HMT {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HMT window = new HMT();
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
	public HMT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 619, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ticket Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(202, 21, 167, 21);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(34, 80, 56, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(34, 129, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(34, 165, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(34, 209, 56, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(111, 79, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "secunderabad", "uppal", "miyapur", "kphb", "jntuh"}));
		c2.setBounds(111, 163, 56, 21);
		frame.getContentPane().add(c2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "kphp", "jntuh", "miyapur", "uppal", "secunderabad"}));
		c1.setBounds(111, 127, 56, 22);
		frame.getContentPane().add(c1);
		
		JComboBox t2 = new JComboBox();
		t2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		t2.setBounds(111, 207, 86, 22);
		frame.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=t1.getText();
				String fs=(String) c1.getSelectedItem();
				String ts=(String) c2.getSelectedItem();
				String t=(String) t2.getSelectedItem();
				int ticket=Integer.parseInt(t);
				int bill=0;
				if(fs=="jntuh" && ts=="jntuh") {
				JOptionPane.showMessageDialog(btnNewButton, "Invalid");
				}
				else if(fs=="jntuh" && ts=="kphb") {
					bill=ticket*30;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n From: "+fs+"\n To: "+ts+"\n Tickets: "+t+"\n Your bill: "+bill);
				}
				else if(fs=="jntuh" && ts=="miyapur") {
					bill=ticket*40;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n From: "+fs+"\n To: "+ts+"\n Tickets: "+t+"\n Your bill: "+bill);
				}
				else if(fs=="jntuh" && ts=="uppal") {
					bill=ticket*50;
					JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n From: "+fs+"\n To: "+ts+"\n Tickets: "+t+"\n Your bill: "+bill);
				}
				else 
					bill=ticket*60;
				    JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n From: "+fs+"\n To: "+ts+"\n Tickets: "+t+"\n Your bill: "+bill);
				
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(59, 270, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
