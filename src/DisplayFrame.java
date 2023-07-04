import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DisplayFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayFrame frame = new DisplayFrame();
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
	public DisplayFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 425);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 66, 416, 312);
		contentPane.add(textArea);
		
		JButton btnDisplay = new JButton("DISPLAY");
		
		btnDisplay.setBounds(34, 23, 85, 21);
		contentPane.add(btnDisplay);
		
		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainFrame mf = new MainFrame();
				mf.setVisible(true);
				setVisible(false);
			}
		});
		btnClose.setBounds(317, 23, 85, 21);
		contentPane.add(btnClose);
		
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText(PeopleSys.displayAll());
			}
		});
		
	}
	
	
	
	

}
