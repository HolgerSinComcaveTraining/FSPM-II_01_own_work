package bhs.view.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

import bhs.model.tier.Kuh;
import bhs.model.tier.Schaf;
import bhs.model.tier.Schwein;

import java.awt.BorderLayout;
import javax.swing.JButton;

public class StallPanel extends JPanel {
	private JList<Kuh> kuhList;
	private JList<Schaf> schafList;
	private JList<Schwein> schweinList;
	private JButton btnSchweineSchlachten;
	private JButton btnMelken;
	private JButton btnScheren;

	/**
	 * Create the panel.
	 */
	public StallPanel() {
		setLayout(new GridLayout(0, 3, 10, 10));
		
		JPanel panelSchweine = new JPanel();
		add(panelSchweine);
		panelSchweine.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSchweine = new JLabel("Schweine");
		lblSchweine.setHorizontalAlignment(SwingConstants.CENTER);
		panelSchweine.add(lblSchweine, BorderLayout.NORTH);
		
		schweinList = new JList();
		schweinList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Schwein 1", "Schwein 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelSchweine.add(schweinList, BorderLayout.CENTER);
		
		btnSchweineSchlachten = new JButton("Schlachten");
		panelSchweine.add(btnSchweineSchlachten, BorderLayout.SOUTH);
		
		JPanel panelKuehe = new JPanel();
		add(panelKuehe);
		panelKuehe.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKuehe = new JLabel("K\u00FChe");
		lblKuehe.setHorizontalAlignment(SwingConstants.CENTER);
		panelKuehe.add(lblKuehe, BorderLayout.NORTH);
		
		kuhList = new JList();
		kuhList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Kuh 1", "Kuh 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelKuehe.add(kuhList);
		
		btnMelken = new JButton("Melken");
		panelKuehe.add(btnMelken, BorderLayout.SOUTH);
		
		JPanel panelSchafe = new JPanel();
		add(panelSchafe);
		panelSchafe.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSchafe = new JLabel("Schafe");
		lblSchafe.setHorizontalAlignment(SwingConstants.CENTER);
		panelSchafe.add(lblSchafe, BorderLayout.NORTH);
		
		schafList = new JList();
		schafList.setModel(new AbstractListModel() {
			String[] values = new String[] {"schaf 1", "Schaf 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelSchafe.add(schafList, BorderLayout.CENTER);
		
		btnScheren = new JButton("Scheren");
		panelSchafe.add(btnScheren, BorderLayout.SOUTH);

	}

	public JList<Kuh> getKuhList() {
		return kuhList;
	}

	public JList<Schaf> getSchafList() {
		return schafList;
	}

	public JList<Schwein> getSchweinList() {
		return schweinList;
	}

	public JButton getBtnSchweineSchlachten() {
		return btnSchweineSchlachten;
	}

	public JButton getBtnMelken() {
		return btnMelken;
	}

	public JButton getBtnScheren() {
		return btnScheren;
	}

}
