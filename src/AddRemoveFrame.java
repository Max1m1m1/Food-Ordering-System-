import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AddRemoveFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField tfId;
	private JTextField tfNameSurname;
	private JTextField tfBirthday;
	private JTextField tfCountry;
	private JTextField tfCity;
	private JTextField tfAccountBalance;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddRemoveFrame frame = new AddRemoveFrame();
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
	public AddRemoveFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(40, 30, 90, 13);
		contentPane.add(lblId);

		JLabel lblNamesurname = new JLabel("Name Surname:");
		lblNamesurname.setBounds(40, 60, 90, 13);
		contentPane.add(lblNamesurname);

		JLabel lblBirthday = new JLabel("Birthday:");
		lblBirthday.setBounds(40, 90, 90, 13);
		contentPane.add(lblBirthday);

		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setBounds(40, 120, 90, 13);
		contentPane.add(lblCountry);

		JLabel lblCity = new JLabel("City:");
		lblCity.setBounds(40, 150, 90, 13);
		contentPane.add(lblCity);

		JLabel lblAccountBalance = new JLabel("Account Balance: ");
		lblAccountBalance.setBounds(40, 180, 90, 13);
		contentPane.add(lblAccountBalance);

		JRadioButton rdbtnYes = new JRadioButton("Yes");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.setBounds(40, 229, 49, 21);
		contentPane.add(rdbtnYes);

		JLabel lblDoYouWork = new JLabel("Do you work here?");
		lblDoYouWork.setBounds(40, 210, 90, 13);
		contentPane.add(lblDoYouWork);

		JRadioButton rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		rdbtnNo.setBounds(91, 229, 49, 21);
		contentPane.add(rdbtnNo);

		tfId = new JTextField();
		tfId.setBounds(140, 30, 96, 19);
		contentPane.add(tfId);
		tfId.setColumns(10);

		tfNameSurname = new JTextField();
		tfNameSurname.setColumns(10);
		tfNameSurname.setBounds(140, 60, 96, 19);
		contentPane.add(tfNameSurname);

		tfBirthday = new JTextField();
		tfBirthday.setColumns(10);
		tfBirthday.setBounds(140, 90, 96, 19);
		contentPane.add(tfBirthday);

		tfCountry = new JTextField();
		tfCountry.setColumns(10);
		tfCountry.setBounds(140, 120, 96, 19);
		contentPane.add(tfCountry);

		tfCity = new JTextField();
		tfCity.setColumns(10);
		tfCity.setBounds(140, 150, 96, 19);
		contentPane.add(tfCity);

		tfAccountBalance = new JTextField();
		tfAccountBalance.setColumns(10);
		tfAccountBalance.setBounds(140, 180, 96, 19);
		contentPane.add(tfAccountBalance);

		JButton btnAdd = new JButton("Add");

		btnAdd.setBounds(161, 308, 85, 21);
		contentPane.add(btnAdd);

		JButton btnRemove = new JButton("Remove");

		btnRemove.setBounds(317, 308, 85, 21);
		contentPane.add(btnRemove);

		JLabel lblAddremove = new JLabel("Do you want to add or remove?");
		lblAddremove.setBounds(452, 7, 162, 13);
		contentPane.add(lblAddremove);

		JRadioButton rdbtnAdd = new JRadioButton("Add");
		rdbtnAdd.setSelected(true);
		rdbtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfId.setEditable(true);
				tfNameSurname.setEditable(true);
				tfBirthday.setEditable(true);
				tfCountry.setEditable(true);
				tfCity.setEditable(true);
				tfAccountBalance.setEditable(true);
				rdbtnYes.setVisible(true);
				rdbtnNo.setVisible(true);

			}
		});
		buttonGroup_1.add(rdbtnAdd);
		rdbtnAdd.setBounds(472, 26, 49, 21);
		contentPane.add(rdbtnAdd);

		JRadioButton rdbtnRemove = new JRadioButton("Remove");
		rdbtnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tfId.setEditable(true);
				tfNameSurname.setEditable(false);
				tfBirthday.setEditable(false);
				tfCountry.setEditable(false);
				tfCity.setEditable(false);
				tfAccountBalance.setEditable(false);
				rdbtnYes.setVisible(false);
				rdbtnNo.setVisible(false);
				lblDoYouWork.setVisible(false);
			}
		});
		buttonGroup_1.add(rdbtnRemove);
		rdbtnRemove.setBounds(524, 26, 90, 21);
		contentPane.add(rdbtnRemove);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(317, 84, 317, 139);
		contentPane.add(textArea);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				setVisible(false);
			}
		});
		btnClose.setBounds(549, 308, 85, 21);
		contentPane.add(btnClose);

		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText(PeopleSys.delete(Integer.parseInt(tfId.getText())));
				
				

			}
		});

		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id;
				String nameSurname, birthday, country, city;
				double accountBalance;
				boolean dywh;

				id = Integer.parseInt(tfId.getText());
				nameSurname = tfNameSurname.getText();
				birthday = tfBirthday.getText();
				birthday = birthday.substring(0, 2);
				int birthdayy = Integer.parseInt(birthday);
				country = tfCountry.getText();
				city = tfCity.getText();
				accountBalance = Double.parseDouble(tfAccountBalance.getText());
				if (rdbtnYes.isSelected())
					dywh = true;
				else if (rdbtnNo.isSelected())
					dywh = false;
				else
					dywh = false;

				if (PeopleSys.add(id, nameSurname, birthdayy, country, city, accountBalance, dywh)) {
					textArea.setText("");
					textArea.setText("People with " + id + " id has added to the system.");
				} else {
					textArea.setText("");
					textArea.setText("People with" + id + " id already exists.");
				}

			}
		});

	}
}
