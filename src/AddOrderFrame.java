import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddOrderFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfFoodCount;
	private JTextField tfDrinkCount;
	private JTextField tfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddOrderFrame frame = new AddOrderFrame();
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
	public AddOrderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cmbFood = new JComboBox();
		cmbFood.setModel(new DefaultComboBoxModel(new String[] {"Pizza", "Burger"}));
		cmbFood.setBounds(10, 79, 91, 21);
		contentPane.add(cmbFood);
		
		JLabel lblNewLabel = new JLabel("Food");
		lblNewLabel.setBounds(22, 56, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setBounds(155, 56, 45, 13);
		contentPane.add(lblDrink);
		
		JComboBox cmbDrink = new JComboBox();
		cmbDrink.setModel(new DefaultComboBoxModel(new String[] {"Ayran", "Coke"}));
		cmbDrink.setBounds(125, 79, 91, 21);
		contentPane.add(cmbDrink);
		
		tfFoodCount = new JTextField();
		tfFoodCount.setBounds(104, 127, 96, 19);
		contentPane.add(tfFoodCount);
		tfFoodCount.setColumns(10);
		
		JLabel lblFoodCount = new JLabel("Food Count:");
		lblFoodCount.setBounds(10, 130, 84, 13);
		contentPane.add(lblFoodCount);
		
		JLabel lblDrinkCount = new JLabel("Drink Count: ");
		lblDrinkCount.setBounds(10, 166, 84, 13);
		contentPane.add(lblDrinkCount);
		
		tfDrinkCount = new JTextField();
		tfDrinkCount.setColumns(10);
		tfDrinkCount.setBounds(104, 163, 96, 19);
		contentPane.add(tfDrinkCount);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(239, 7, 445, 246);
		contentPane.add(textArea);
		
		JButton btnAddtocart = new JButton("Add to cart");
		
		btnAddtocart.setBounds(10, 232, 85, 21);
		contentPane.add(btnAddtocart);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				setVisible(false);
;			}
		});
		btnClose.setBounds(125, 232, 85, 21);
		contentPane.add(btnClose);
		
		tfId = new JTextField();
		tfId.setBounds(77, 10, 96, 19);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Id:");
		lblNewLabel_1.setBounds(22, 13, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		btnAddtocart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String food = ""+cmbFood.getSelectedItem();
				String drink = ""+cmbDrink.getSelectedItem();
				
				int cntfood = Integer.parseInt(tfFoodCount.getText());
				int cntdrink = Integer.parseInt(tfDrinkCount.getText());
				int id = Integer.parseInt(tfId.getText());
				
				String a = PeopleSys.addOrder(id, food, cntfood, drink, cntdrink);
				textArea.setText(a);
				
				
				
			}
		});
	}
}
