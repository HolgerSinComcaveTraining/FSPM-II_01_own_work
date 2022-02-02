package bhs.view.panels;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class UebersichtPanel extends JPanel {
	private JList<String> pflanzenList;
	private JList<Integer> pflanzenAnzahlList;
	private JList<String> tiereList;
	private JList<Integer> tiereAnzahlList;
	private JList<String> produktList;
	private JList<Integer> produkteAnzahlList;

	/**
	 * Create the panel.
	 */
	public UebersichtPanel() {
		setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panelPflanzen = new JPanel();
		panelPflanzen.setBackground(Color.LIGHT_GRAY);
		panelPflanzen.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(panelPflanzen);
		panelPflanzen.setLayout(new BorderLayout(0, 10));
		
		JLabel lblPflanzen = new JLabel("Pflanzen");
		lblPflanzen.setHorizontalAlignment(SwingConstants.CENTER);
		panelPflanzen.add(lblPflanzen, BorderLayout.NORTH);
		
		pflanzenList = new JList<String>();
		panelPflanzen.add(pflanzenList, BorderLayout.CENTER);
		
		pflanzenAnzahlList = new JList<Integer>();
		panelPflanzen.add(pflanzenAnzahlList, BorderLayout.EAST);
		
		JPanel panelTiere = new JPanel();
		panelTiere.setBackground(Color.LIGHT_GRAY);
		panelTiere.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(panelTiere);
		panelTiere.setLayout(new BorderLayout(0, 10));
		
		JLabel lblTiere = new JLabel("Tiere");
		lblTiere.setHorizontalAlignment(SwingConstants.CENTER);
		panelTiere.add(lblTiere, BorderLayout.NORTH);
		
		tiereList = new JList();
		panelTiere.add(tiereList);
		
		tiereAnzahlList = new JList();
		panelTiere.add(tiereAnzahlList, BorderLayout.EAST);
		
		JPanel panelProdukte = new JPanel();
		panelProdukte.setBackground(Color.LIGHT_GRAY);
		panelProdukte.setBorder(new EmptyBorder(10, 10, 10, 10));
		add(panelProdukte);
		panelProdukte.setLayout(new BorderLayout(0, 10));
		
		JLabel lblProdukte = new JLabel("Produkte");
		lblProdukte.setHorizontalAlignment(SwingConstants.CENTER);
		panelProdukte.add(lblProdukte, BorderLayout.NORTH);
		
		produktList = new JList();
		panelProdukte.add(produktList, BorderLayout.CENTER);
		
		produkteAnzahlList = new JList();
		panelProdukte.add(produkteAnzahlList, BorderLayout.EAST);

	}

	public JList<String> getPflanzenList() {
		return pflanzenList;
	}

	public JList<Integer> getPflanzenAnzahlList() {
		return pflanzenAnzahlList;
	}

	public JList<String> getTiereList() {
		return tiereList;
	}

	public JList<Integer> getTiereAnzahlList() {
		return tiereAnzahlList;
	}

	public JList<String> getProduktList() {
		return produktList;
	}

	public JList<Integer> getProdukteAnzahlList() {
		return produkteAnzahlList;
	}

	

}
