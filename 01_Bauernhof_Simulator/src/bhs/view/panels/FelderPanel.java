package bhs.view.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

import bhs.model.feld.Feld;

import javax.swing.AbstractListModel;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class FelderPanel extends JPanel {
	private JList<Feld> felderList;
	private JButton btnAnbauen;
	private JButton btnErnten;
	private JComboBox comboBoxPflanzenSorte;

	/**
	 * Create the panel.
	 */
	public FelderPanel() {
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelFelder = new JPanel();
		add(panelFelder);
		panelFelder.setLayout(new BorderLayout(0, 0));
		
		JLabel lblFelder = new JLabel("Felder");
		lblFelder.setHorizontalAlignment(SwingConstants.CENTER);
		panelFelder.add(lblFelder, BorderLayout.NORTH);
		
		felderList = new JList();
		felderList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Feld 1", "Feld 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelFelder.add(felderList, BorderLayout.CENTER);
		
		JPanel panelButtons = new JPanel();
		panelFelder.add(panelButtons, BorderLayout.SOUTH);
		
		comboBoxPflanzenSorte = new JComboBox();
		comboBoxPflanzenSorte.setModel(new DefaultComboBoxModel(new String[] {"Pflanze 1", "Pflanze 2"}));
		panelButtons.add(comboBoxPflanzenSorte);
		
		btnAnbauen = new JButton("Anbauen");
		panelButtons.add(btnAnbauen);
		
		btnErnten = new JButton("Ernten");
		panelButtons.add(btnErnten);

	}

	public JList<Feld> getFelderList() {
		return felderList;
	}

	public JButton getBtnAnbauen() {
		return btnAnbauen;
	}

	public JButton getBtnErnten() {
		return btnErnten;
	}

	public JComboBox getComboBoxPflanzenSorte() {
		return comboBoxPflanzenSorte;
	}

}
