import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SearchFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tfId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchFrame frame = new SearchFrame();
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
	public SearchFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 203);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Id:");
		lblId.setBounds(23, 30, 90, 13);
		contentPane.add(lblId);
		
		tfId = new JTextField();
		tfId.setColumns(10);
		tfId.setBounds(63, 27, 96, 19);
		contentPane.add(tfId);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(203, 10, 276, 146);
		contentPane.add(textArea);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id;
				id = Integer.parseInt(tfId.getText());
				textArea.setText(PeopleSys.search(id));
				
			}
		});
		btnSearch.setBounds(42, 93, 85, 21);
		contentPane.add(btnSearch);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				setVisible(false);
			}
		});
		btnClose.setBounds(42, 135, 85, 21);
		contentPane.add(btnClose);
	}

}
