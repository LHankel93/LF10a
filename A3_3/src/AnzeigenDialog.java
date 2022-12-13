import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class AnzeigenDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtAnzeige;

	// Zeige den Anzeige Dialog mit Wert
	public AnzeigenDialog(String item) {
		setBounds(100, 100, 265, 185);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		{
			txtAnzeige = new JTextField();
			txtAnzeige.setEditable(false);
			txtAnzeige.setText(item);
			contentPanel.add(txtAnzeige);
			txtAnzeige.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				okButton.addActionListener(aL);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

	ActionListener aL = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "OK") {
				dispose();
			}

		}
	};

}
