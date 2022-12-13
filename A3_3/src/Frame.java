import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.Dimension;

public class Frame implements ActionListener {

	JFrame frame;
	private JPanel panelBox1;
	private JPanel panelBox2;
	private JList<String> listAdressen;
	private JButton btnNeu;
	private JButton btnLoeschen;
	private JButton btnAnzeigen;
	private JButton btnSchliessen;
	private DefaultListModel<String> listModel;
	private ArrayList<String> strs;
	private JScrollPane listScroller;
	private JPanel panelBox0;
	private JLabel lblListe;

	public Frame() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Adressbuch");
		frame.setBounds(100, 100, 407, 265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		panelBox0 = new JPanel();
		frame.getContentPane().add(panelBox0);
		
		lblListe = new JLabel("Adressbuch");
		lblListe.setHorizontalAlignment(SwingConstants.CENTER);
		panelBox0.add(lblListe);

		// Panel deklarieren
		panelBox1 = new JPanel();
		frame.getContentPane().add(panelBox1);

		panelBox2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelBox2.getLayout();
		panelBox2.getLayout();
		frame.getContentPane().add(panelBox2);

		btnNeu = new JButton("Neu");
		btnNeu.addActionListener(this);
		panelBox2.add(btnNeu);

		btnLoeschen = new JButton("Löschen");
		btnLoeschen.addActionListener(this);
		panelBox2.add(btnLoeschen);

		btnAnzeigen = new JButton("Anzeigen");
		btnAnzeigen.addActionListener(this);
		panelBox2.add(btnAnzeigen);

		btnSchliessen = new JButton("Schließen");
		btnSchliessen.addActionListener(this);
		panelBox2.add(btnSchliessen);
		FlowLayout fl_panelBox1 = new FlowLayout(FlowLayout.CENTER, 5, 5);
		panelBox1.setLayout(fl_panelBox1);

		// DefaultListModel initialiseren, füllen und der JList zuweisen.
		listAdressen = new JList<String>();
		lblListe.setLabelFor(listAdressen);
		listAdressen.setMinimumSize(new Dimension(100, 50));
		listAdressen.setVisibleRowCount(8);
		listScroller = new JScrollPane(listAdressen);
		listScroller.setSize(new Dimension(100, 50));
		listScroller.setMinimumSize(new Dimension(100, 40));
		listModel = new DefaultListModel<String>();
		strs = new ArrayList<String>();
		strs.add("Item 1");
		listModel.add(0, strs.get(0));
		listAdressen.setModel(listModel);
		// panelBox1.add(listAdressen);
		panelBox1.add(listScroller);
		listScroller.setPreferredSize(new Dimension(200, 100));
		listScroller.setAutoscrolls(true);

	}

	public void füge_Hinzu() {
		listModel.add(listModel.size(), "Item " + (listModel.size() + 1));
	}

	public void loesche_ind(int ind) {
		if (ind > 0) {
			listModel.remove(ind);
		}

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
			füge_Hinzu();
		} else if (e.getSource() == this.btnLoeschen) {
			// Selektiertes Element Löschen
			loesche_ind(listAdressen.getSelectedIndex());
		} else if (e.getSource() == this.btnSchliessen) {
			// Programm beenden
			System.exit(0);
		} else if (e.getSource() == this.btnAnzeigen) {
			anzeigen(listAdressen.getSelectedIndex());
		}
	}

}
