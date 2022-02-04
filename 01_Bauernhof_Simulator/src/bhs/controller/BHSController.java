package bhs.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import bhs.model.feld.Feld;
import bhs.model.feld.Pflanze;
import bhs.model.tier.Kuh;
import bhs.model.tier.Schaf;
import bhs.model.tier.Schwein;
import bhs.view.MainFrame;

public class BHSController {

	private MainFrame frame;
	private JList<String> pflanzenList;
	private JList<Integer> pflanzenAnzahlList;
	private JList<String> tiereList;
	private JList<Integer> tiereAnzahlList;
	private JList<String> produktList;
	private JList<Integer> produkteAnzahlList;
	private JList<Kuh> kuhList;
	private JList<Schaf> schafList;
	private JList<Schwein> schweinList;
	private JList<Feld> felderList;

	private JLabel lblKonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private JTabbedPane mtp;
	private JButton btnNewRound;
	private JButton btnSchweineSchlachten;
	private JButton btnMelken;
	private JButton btnScheren;
	private JButton btnAnbauen;
	private JButton btnErnten;
	private JComboBox comboBoxPflanzenSorte;

	private ArrayList<Feld> felder = new ArrayList<>();

	private int runde = 5;

	/**
	 * 
	 */
	public BHSController() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainFrame();
					init();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame = new MainFrame();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public void init() {
		this.pflanzenList = frame.getUebersichtPanel().getPflanzenList();
		this.pflanzenAnzahlList = frame.getUebersichtPanel().getPflanzenAnzahlList();
		this.tiereList = frame.getUebersichtPanel().getTiereList();
		this.tiereAnzahlList = frame.getUebersichtPanel().getTiereAnzahlList();
		this.produktList = frame.getUebersichtPanel().getProduktList();
		this.produkteAnzahlList = frame.getUebersichtPanel().getProdukteAnzahlList();
		this.kuhList = frame.getStallPanel().getKuhList();
		this.schweinList = frame.getStallPanel().getSchweinList();
		this.schafList = frame.getStallPanel().getSchafList();
		this.felderList = frame.getFelderPanel().getFelderList();
		this.lblKonto = frame.getLblKonto();
		this.lblFutter = frame.getLblFutter();
		this.lblSilo = frame.getLblSilo();
		this.lblRunde = frame.getLblRunde();
		this.mtp = frame.getMainTabbedPane();
		this.btnNewRound = frame.getBtnNewRound();
		this.btnSchweineSchlachten = frame.getStallPanel().getBtnSchweineSchlachten();
		this.btnMelken = frame.getStallPanel().getBtnMelken();
		this.btnScheren = frame.getStallPanel().getBtnScheren();
		this.btnAnbauen = frame.getFelderPanel().getBtnAnbauen();
		this.btnErnten = frame.getFelderPanel().getBtnErnten();
		this.comboBoxPflanzenSorte = frame.getFelderPanel().getComboBoxPflanzenSorte();

		// Daten
		setPflanzen();
		setTiere();
		setProdukte();
		setStatus();
		setCBPflanzen();

		// Listener
		setTabChangeListener();
		setNewRoundAction();
		setMelkenAction();
		setSchlachtenAction();
		setScherenAction();
		setAnbauenAction();
		setErntenAction();

		// Testdaten
		felder.add(new Feld());
		felder.add(new Feld());
		felder.add(new Feld());

	}

	public void setPflanzen() {

		String[] pflanzen = Pflanze.PFLANZEN_SORTEN;
		Integer[] pflanzenAnzahl = { 5, 6, 7, 8, 9, 10 };

		this.pflanzenList.setModel(new AbstractListModel<String>() {
			String[] values = pflanzen;

			public int getSize() {
				return values.length;
			}

			public String getElementAt(int index) {
				return values[index];
			}
		});
		this.pflanzenAnzahlList.setModel(new AbstractListModel<Integer>() {
			Integer[] values = pflanzenAnzahl;

			public int getSize() {
				return values.length;
			}

			public Integer getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setTiere() {

		String[] tiere = { "Kühe", "Schafe", "Schweine" };
		Integer[] tiereAnzahl = { 50, 60, 70, 80 };

		tiereList.setModel(new AbstractListModel<String>() {
			String[] values = tiere;

			public int getSize() {
				return values.length;
			}

			public String getElementAt(int index) {
				return values[index];
			}
		});
		tiereAnzahlList.setModel(new AbstractListModel<Integer>() {
			Integer[] values = tiereAnzahl;

			public int getSize() {
				return values.length;
			}

			public Integer getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setProdukte() {

		String[] produkte = { "Speck", "Milch", "Wolle" };
		Integer[] produkteAnzahl = { 501, 601, 701, 801 };

		produktList.setModel(new AbstractListModel<String>() {
			String[] values = produkte;

			public int getSize() {
				return values.length;
			}

			public String getElementAt(int index) {
				return values[index];
			}
		});
		produkteAnzahlList.setModel(new AbstractListModel<Integer>() {
			Integer[] values = produkteAnzahl;

			public int getSize() {
				return values.length;
			}

			public Integer getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setStatus() {
		double konto = 1234.56;
		int futterVerbrauch = 123;
		int silo = 123;
		int maxRunden = 100;

		lblKonto.setText("Kontostand: " + konto);
		lblFutter.setText("Futterverbrauch: " + futterVerbrauch);
		lblSilo.setText("Silobestand: " + silo);
		lblRunde.setText("Runde: " + runde + "/" + maxRunden);
	}

	public void setKuehe() {
		Kuh[] kuehe = { new Kuh(), new Kuh(), new Kuh() };

		kuhList.setModel(new AbstractListModel<Kuh>() {
			Kuh[] values = kuehe;

			public int getSize() {
				return values.length;
			}

			public Kuh getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setSchweine() {
		Schwein[] schweine = { new Schwein(), new Schwein(), new Schwein() };

		schweinList.setModel(new AbstractListModel<Schwein>() {
			Schwein[] values = schweine;

			public int getSize() {
				return values.length;
			}

			public Schwein getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setSchafe() {
		Schaf[] schafe = { new Schaf(), new Schaf(), new Schaf(), new Schaf(), new Schaf() };

		schafList.setModel(new AbstractListModel<Schaf>() {
			Schaf[] values = schafe;

			public int getSize() {
				return values.length;
			}

			public Schaf getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setFelder() {
		Feld[] felderArray = (Feld[]) felder.toArray(new Feld[0]);

		felderList.setModel(new AbstractListModel<Feld>() {
			Feld[] values = felderArray;

			public int getSize() {
				return values.length;
			}

			public Feld getElementAt(int index) {
				return values[index];
			}
		});
	}

	public void setCBPflanzen() {
		comboBoxPflanzenSorte.setModel(new DefaultComboBoxModel<>(Pflanze.PFLANZEN_SORTEN));
	}

// Action Listener

	public void setTabChangeListener() {
		mtp.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Tab: " + mtp.getSelectedIndex());
				switch (mtp.getSelectedIndex()) {
				case 0:
					setPflanzen();
					setTiere();
					setProdukte();
					setStatus();
					break;
				case 1:
					setKuehe();
					setSchweine();
					setSchafe();
					break;
				case 2:
					setFelder();
					break;

				default:
					break;
				}
			}
		});
	}

	public void setNewRoundAction() {
		btnNewRound.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				runde++;
				setStatus();
				mtp.setSelectedIndex(0);
			}
		});
	}

	public void setMelkenAction() {
		btnMelken.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Kuh> kuhAL = (ArrayList<Kuh>) kuhList.getSelectedValuesList();
					System.out.println(kuhAL);
					for (Kuh kuh : kuhAL) {
						kuh.melken();
					}
				} catch (ClassCastException e1) {
					JOptionPane.showMessageDialog(frame, "Bitte mindestens eine Kuh auswählen", "Melken", JOptionPane.WARNING_MESSAGE);
//					e1.printStackTrace();
				}
				kuhList.clearSelection();
			}
		});

	}

	public void setSchlachtenAction() {
		btnSchweineSchlachten.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Schwein> schweinAL = (ArrayList<Schwein>) schweinList.getSelectedValuesList();
					System.out.println(schweinAL);
					for (Schwein schwein : schweinAL) {
						schwein.schlachten();
					}
				} catch (ClassCastException e1) {
					JOptionPane.showMessageDialog(frame, "Bitte mindestens ein Schwein auswählen", "Schlachten", JOptionPane.WARNING_MESSAGE);
//					e1.printStackTrace();
				}
				schweinList.clearSelection();
			}
		});
	}

	private void setScherenAction() {
		btnScheren.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					ArrayList<Schaf> schafAL = (ArrayList<Schaf>) schafList.getSelectedValuesList();
					System.out.println(schafAL);
					for (Schaf schaf : schafAL) {
						schaf.scheren();
					}
				} catch (ClassCastException e1) {
					JOptionPane.showMessageDialog(frame, "Bitte mindestens ein Schaf auswählen", "Scheren", JOptionPane.WARNING_MESSAGE);
//					e1.printStackTrace();
				}
				schafList.clearSelection();
			}
		});
	}

	private void setAnbauenAction() {
		btnAnbauen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String pflanzenSorte = (String) comboBoxPflanzenSorte.getSelectedItem();
				try {
					ArrayList<Feld> feldAL = (ArrayList<Feld>) felderList.getSelectedValuesList();
					System.out.println(feldAL);
					for (Feld feld : feldAL) {
						feld.anbauen(pflanzenSorte);
					}
				} catch (ClassCastException e1) {
					JOptionPane.showMessageDialog(frame, "Bitte mindestens ein Feld auswählen", "Anbauen", JOptionPane.WARNING_MESSAGE);
//					e1.printStackTrace();
				}
				felderList.clearSelection();
			}
		});
		
	}
	
	
	private void setErntenAction() {
		btnErnten.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					ArrayList<Feld> feldAL = (ArrayList<Feld>) felderList.getSelectedValuesList();
					System.out.println(feldAL);
					for (Feld feld : feldAL) {
						feld.ernten();
					}
				} catch (ClassCastException e1) {
					JOptionPane.showMessageDialog(frame, "Bitte mindestens ein Feld auswählen", "Ernten", JOptionPane.WARNING_MESSAGE);
//					e1.printStackTrace();
				}
				felderList.clearSelection();
			}
		});
	}
}
