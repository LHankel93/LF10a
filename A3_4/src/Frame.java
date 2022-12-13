import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.Dimension;
import javax.swing.SpringLayout;

public class Frame implements ActionListener {

	JFrame frame;
	private JPanel buttonPane;
	private JButton btnNeu;
	private JButton btnLoeschen;
	private JButton btnSpeichern;
	private JButton btnSchliessen;
	private DefaultListModel<String> listModel;
	private ArrayList<String> strs;
	private JPanel topPane;
	private JPanel dataPane;
	private JPanel mitarbeiterPane;
	private JPanel mitarbeiterPanel;
	private JPanel suchePane;
	private JPanel labelPane;
	private JPanel dataDetailPane;
	private JPanel geschlechtPane;
	private JLabel lblMitarbeiternummer;
	private JTextField txtMitarbeiternummer;
	private JTextField txtSuche;
	private JLabel lblVorname;
	private JLabel lblNachname;
	private JLabel lblGeburtsdatum;
	private JTextField txtVorname;
	private JTextField textField;

	public Frame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Adressbuch");
		frame.setBounds(100, 100, 407, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

		topPane = new JPanel();
		frame.getContentPane().add(topPane);
		topPane.setLayout(new BoxLayout(topPane, BoxLayout.X_AXIS));

		mitarbeiterPane = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) mitarbeiterPane.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		topPane.add(mitarbeiterPane);

		lblMitarbeiternummer = new JLabel("Mitarbeiternummer");
		mitarbeiterPane.add(lblMitarbeiternummer);

		txtMitarbeiternummer = new JTextField();
		lblMitarbeiternummer.setLabelFor(txtMitarbeiternummer);
		mitarbeiterPane.add(txtMitarbeiternummer);
		txtMitarbeiternummer.setColumns(10);

		suchePane = new JPanel();
		FlowLayout flowLayout = (FlowLayout) suchePane.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		topPane.add(suchePane);

		txtSuche = new JTextField();
		txtSuche.setText("Search");
		txtSuche.setHorizontalAlignment(SwingConstants.LEFT);
		suchePane.add(txtSuche);
		txtSuche.setColumns(10);

		dataPane = new JPanel();
		frame.getContentPane().add(dataPane);
		dataPane.setLayout(new BoxLayout(dataPane, BoxLayout.X_AXIS));

		labelPane = new JPanel();
		dataPane.add(labelPane);
		labelPane.setLayout(new BoxLayout(labelPane, BoxLayout.Y_AXIS));

		lblVorname = new JLabel("Vorname");
		lblVorname.setHorizontalAlignment(SwingConstants.LEFT);
		labelPane.add(lblVorname);

		lblNachname = new JLabel("Nachname");
		lblNachname.setHorizontalAlignment(SwingConstants.LEFT);
		labelPane.add(lblNachname);

		lblGeburtsdatum = new JLabel("Geburtsdatum");
		labelPane.add(lblGeburtsdatum);

		dataDetailPane = new JPanel();
		dataPane.add(dataDetailPane);
		dataDetailPane.setLayout(new BoxLayout(dataDetailPane, BoxLayout.Y_AXIS));

		txtVorname = new JTextField();
		dataDetailPane.add(txtVorname);
		txtVorname.setColumns(10);

		textField = new JTextField();
		dataDetailPane.add(textField);
		textField.setColumns(10);

		// TODO: JDATEPICKER implementieren.

		UtilDateModel model = new UtilDateModel();
		JDatePanelImpl datePanel = new JDatePanelImpl(model);
		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

		frame.add(datePicker);

		geschlechtPane = new JPanel();
		dataPane.add(geschlechtPane);

		buttonPane = new JPanel();
		frame.getContentPane().add(buttonPane);

		btnNeu = new JButton("New");
		btnNeu.addActionListener(this);
		buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.X_AXIS));
		buttonPane.add(btnNeu);

		btnLoeschen = new JButton("Delete");
		btnLoeschen.addActionListener(this);
		buttonPane.add(btnLoeschen);

		btnSpeichern = new JButton("Save");
		btnSpeichern.addActionListener(this);
		buttonPane.add(btnSpeichern);

		btnSchliessen = new JButton("Exit");
		btnSchliessen.addActionListener(this);
		buttonPane.add(btnSchliessen);
		listModel = new DefaultListModel<String>();
		strs = new ArrayList<String>();
		strs.add("Item 1");
		listModel.add(0, strs.get(0));

	}

	public void anzeigen(int ind) {
		try {
			AnzeigenDialog dialog = new AnzeigenDialog(listModel.get(ind));
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btnNeu) {
			// Item hinzufügen

		} else if (e.getSource() == this.btnLoeschen) {
			//
		} else if (e.getSource() == this.btnSchliessen) {
			// Programm beenden
			System.exit(0);
		} else if (e.getSource() == this.btnSpeichern) {

		}
	}

}
