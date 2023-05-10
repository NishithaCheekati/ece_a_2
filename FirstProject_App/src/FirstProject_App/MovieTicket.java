package FirstProject_App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MovieTicket {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MovieTicket window = new MovieTicket();
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
	public MovieTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 594, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyShow");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(176, 23, 153, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(0, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(27, 85, 58, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movies");
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(27, 135, 58, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ticket");
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(27, 194, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(118, 84, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "RRR", "DASARA", "LIFE IS BEAUTIFUL", "OYE", "BAHUBALI"}));
		c1.setBounds(118, 133, 86, 22);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7", "8", "9"}));
		c2.setBounds(118, 192, 86, 22);
		frame.getContentPane().add(c2);
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=t1.getText();
				String m=(String) c1.getSelectedItem();
				String t=(String) c2.getSelectedItem();
				int tickets=Integer.parseInt(t);
				int bill=0;
				if(m.equals("RRR")) {
					bill=tickets*100;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+ "\n selected movie: "+m+"\n tickets: "+t+"\n Your bill: "+bill);
				}
				else if(m.equals("DASARA")) {
					bill=tickets*200;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+ "\n selected movie: "+m+"\n tickets: "+t+"\n Your bill: "+bill);
				}
				else if(m.equals("LIFE IS BEAUTIFUL")) {
					bill=tickets*300;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+ "\n selected movie: "+m+"\n tickets: "+t+"\n Your bill: "+bill);
				}
				else if(m.equals("OYE")) {
					bill=tickets*400;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+ "\n selected movie: "+m+"\n tickets: "+t+"\n Your bill: "+bill);
				}
				else if(m.equals("BAHUBALI")) {
					bill=tickets*500;
					JOptionPane.showMessageDialog(btnNewButton,"Hello "+n+ "\n selected movie: "+m+"\n tickets: "+t+"\n Your bill: "+bill);
				}
				else
					JOptionPane.showMessageDialog(btnNewButton,"Invalid ");
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(57, 262, 89, 23);
		frame.getContentPane().add(btnNewButton);
	
	}
}
