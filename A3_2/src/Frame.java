import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Frame implements ActionListener {

	JFrame frame;
	private JTextField txtLogin;
	private JButton btnLogin;
	private JTextField txtPassword;
	private JLabel lblLogin;
	private JLabel lblPassword;
	private JPanel panelBox1;
	private JPanel panelBox2;
	private JPanel panelBox3;

	public Frame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Login");
		frame.setBounds(100, 100, 450, 183);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		// Panel deklarieren
		panelBox1 = new JPanel();
		frame.getContentPane().add(panelBox1, BorderLayout.NORTH);

		panelBox2 = new JPanel();
		frame.getContentPane().add(panelBox2, BorderLayout.CENTER);

		panelBox3 = new JPanel();
		frame.getContentPane().add(panelBox3, BorderLayout.SOUTH);

		lblLogin = new JLabel("Benutzername");
		panelBox1.add(lblLogin);
		// frame.getContentPane().add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		// frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		panelBox1.add(txtLogin);

		lblPassword = new JLabel("Passwort");
		// frame.getContentPane().add(lblPassword);
		panelBox2.add(lblPassword);

		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setColumns(10);
		// frame.getContentPane().add(txtPassword);
		panelBox2.add(txtPassword);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(this);
		// frame.getContentPane().add(btnLogin);
		panelBox3.add(btnLogin);
	}

	/*
	 * Wenn der Login-Button gedrückt wird, soll auf die Konsule die folgende Text
	 * ausgegeben werden:
	 * 
	 * Benutzername: <Inhalt des Textfeldes> Password: <Inhalt des Textfeldes>
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnLogin) {
			System.out.println(
					"Benutzername:\t\t" + this.txtLogin.getText() + "\nPassword:\t\t" + this.txtPassword.getText());
		}
	}

}
