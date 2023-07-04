import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnaddRemove = new JButton("Add/Remove");
		btnaddRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddRemoveFrame arf = new AddRemoveFrame();
				arf.setVisible(true);
				setVisible(false);
				
			}
		});
		btnaddRemove.setBounds(10, 70, 110, 21);
		contentPane.add(btnaddRemove);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchFrame sf = new SearchFrame();
				sf.setVisible(true);
				setVisible(false);
			}
		});
		btnSearch.setBounds(144, 70, 110, 21);
		contentPane.add(btnSearch);
		
		JButton btnDisplay = new JButton("Display");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DisplayFrame df = new DisplayFrame();
				df.setVisible(true);
				setVisible(false);
			}
		});
		btnDisplay.setBounds(264, 70, 110, 21);
		contentPane.add(btnDisplay);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(156, 10, 98, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnAddOrder = new JButton("Add Order");
		btnAddOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddOrderFrame aof = new AddOrderFrame();
				aof.setVisible(true);
				setVisible(false);
			}
		});
		btnAddOrder.setBounds(144, 130, 110, 21);
		contentPane.add(btnAddOrder);
	}
}
