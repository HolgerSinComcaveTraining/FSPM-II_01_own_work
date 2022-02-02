package bhs.view.panels;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class StallPanel extends JPanel {

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
		
		JPanel panel = new JPanel();
		panelSchweine.add(panel);
		
		JList schweinIdList = new JList();
		schweinIdList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Schwein 1", "Schwein 2", "Schwein x"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(schweinIdList);
		
		JList schweinAlterList = new JList();
		schweinAlterList.setModel(new AbstractListModel() {
			String[] values = new String[] {"1", "2", "3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(schweinAlterList);
		
		JList schweinGewichtList = new JList();
		schweinGewichtList.setModel(new AbstractListModel() {
			String[] values = new String[] {"5", "10", "20"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(schweinGewichtList);
		
		JList schweinKaufpreisList = new JList();
		schweinKaufpreisList.setModel(new AbstractListModel() {
			String[] values = new String[] {"0", "200", "250"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(schweinKaufpreisList);
		
		JList schweinHungerList = new JList();
		schweinHungerList.setModel(new AbstractListModel() {
			String[] values = new String[] {"0", "1", "3"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel.add(schweinHungerList);
		
		JButton btnSchweineSchlachten = new JButton("Schlachten");
		panelSchweine.add(btnSchweineSchlachten, BorderLayout.SOUTH);
		
		JPanel panelKuehe = new JPanel();
		add(panelKuehe);
		panelKuehe.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKuehe = new JLabel("K\u00FChe");
		lblKuehe.setHorizontalAlignment(SwingConstants.CENTER);
		panelKuehe.add(lblKuehe, BorderLayout.NORTH);
		
		JList kuhIdList = new JList();
		kuhIdList.setModel(new AbstractListModel() {
			String[] values = new String[] {"Kuh 1", "Kuh 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelKuehe.add(kuhIdList);
		
		JButton btnMelken = new JButton("Melken");
		panelKuehe.add(btnMelken, BorderLayout.SOUTH);
		
		JPanel panelSchafe = new JPanel();
		add(panelSchafe);
		panelSchafe.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSchafe = new JLabel("Schafe");
		panelSchafe.add(lblSchafe, BorderLayout.NORTH);
		
		JList schafIdList = new JList();
		schafIdList.setModel(new AbstractListModel() {
			String[] values = new String[] {"schaf 1", "Schaf 2"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panelSchafe.add(schafIdList, BorderLayout.CENTER);
		
		JButton btnScheren = new JButton("Scheren");
		panelSchafe.add(btnScheren, BorderLayout.SOUTH);

	}

}
