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
	private JButton BtnClean;
	private JTextField txtPassword;
	private JLabel lblLogin;
	private JLabel lblPassword;
	private JPanel panelBox1;
	private JPanel panelBox2;

	public Frame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Login");
		frame.setBounds(100, 100, 450, 183);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		panelBox1 = new JPanel();
		frame.getContentPane().add(panelBox1);
		
		panelBox2 = new JPanel();
		frame.getContentPane().add(panelBox2);
		
		lblLogin = new JLabel("Benutzername");
		frame.getContentPane().add(lblLogin);

		txtLogin = new JTextField();
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		lblPassword = new JLabel("Passwort");
		frame.getContentPane().add(lblPassword);
		
		txtPassword = new JTextField();
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setColumns(10);
		frame.getContentPane().add(txtPassword);
		
				BtnClean = new JButton("Login");
				BtnClean.addActionListener(this);
				frame.getContentPane().add(BtnClean);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.BtnClean) {
			this.txtLogin.setText("0");
		} else if (e.getSource() == this.BtnIncrement) {
			Integer nums = Integer.parseInt(this.txtLogin.getText()) + 1;
			this.txtLogin.setText(nums.toString());
		} else if (e.getSource() == this.BtnDecrement) {
			Integer nums = Integer.parseInt(this.txtLogin.getText()) - 1;
			this.txtLogin.setText(nums.toString());
		}
	}

}
