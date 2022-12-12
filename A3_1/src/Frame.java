import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Frame implements ActionListener {

	JFrame frame;
	private JTextField jtxtfield;
	private JButton BtnClean;
	private JButton BtnIncrement;
	private JButton BtnDecrement;

	public Frame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("FlowLayoutManager");
		frame.setBounds(100, 100, 450, 183);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		BtnClean = new JButton("Clean");
		BtnClean.addActionListener(this);
		frame.getContentPane().add(BtnClean);

		BtnIncrement = new JButton("Increment");
		BtnIncrement.addActionListener(this);
		frame.getContentPane().add(BtnIncrement);

		BtnDecrement = new JButton("Decrement");
		BtnDecrement.addActionListener(this);
		frame.getContentPane().add(BtnDecrement);

		jtxtfield = new JTextField();
		jtxtfield.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtfield.setText("0");
		frame.getContentPane().add(jtxtfield);
		jtxtfield.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.BtnClean) {
			this.jtxtfield.setText("0");
		} else if (e.getSource() == this.BtnIncrement) {
			Integer nums = Integer.parseInt(this.jtxtfield.getText()) + 1;
			this.jtxtfield.setText(nums.toString());
		} else if (e.getSource() == this.BtnDecrement) {
			Integer nums = Integer.parseInt(this.jtxtfield.getText()) - 1;
			this.jtxtfield.setText(nums.toString());
		}
	}

}
