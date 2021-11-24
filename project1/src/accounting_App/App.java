package accounting_App;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App {

	private JFrame frame;
	private JTextField idField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
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
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImagePanel loginPanel = new ImagePanel(new ImageIcon("C:\\RemoteGitEx\\gittest1\\project1\\src\\theme.jpg").getImage());
		
		frame.setSize(new Dimension(1554, 708));
		frame.setPreferredSize(loginPanel.getDim());
		frame.getContentPane().add(loginPanel);
		
		idField = new JTextField();
		idField.setFont(new Font("굴림", Font.PLAIN, 25));
		idField.setBounds(1219, 313, 297, 43);
		loginPanel.add(idField);
		idField.setColumns(10);
		idField.setBorder(null);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("굴림", Font.PLAIN, 25));
		passwordField.setBounds(1219, 392, 288, 43);
		//텍스트필드 테두리 없애기
		passwordField.setBorder(null);
		loginPanel.add(passwordField);
		frame.pack();
	}
}
