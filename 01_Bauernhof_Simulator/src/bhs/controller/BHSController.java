package bhs.controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import bhs.view.MainFrame;

public class BHSController {

	private MainFrame frame;
	private JList<String> pflanzenList;
	private JList<Integer> pflanzenAnzahlList;
	private JList<String> tiereList;
	private JList<Integer> tiereAnzahlList;
	private JList<String> produktList;
	private JList<Integer> produkteAnzahlList;
	private JLabel lblKonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private JTabbedPane mtp;
	private JButton btnNewRound;
	
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
		this.lblKonto=frame.getLblKonto();
		this.lblFutter=frame.getLblFutter();
		this.lblSilo=frame.getLblSilo();
		this.lblRunde=frame.getLblRunde();
		this.mtp = frame.getMainTabbedPane();
		this.btnNewRound = frame.getBtnNewRound();
		
		setPflanzen();
		setTiere();
		setProdukte();
		setStatus();
		setTabChangeListener();
		setNewRoundAction();
		
	}

	public void setPflanzen() {

		String[] pflanzen = { "Äpfel", "Birnen", "Chinakohl", "Karotten", "Kartoffeln" };
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
		int silo =123;
//		int runde = 5;
		int maxRunden = 100;
		
		lblKonto.setText("Kontostand: " + konto);
		lblFutter.setText("Futterverbrauch: "+ futterVerbrauch);
		lblSilo.setText("Silobestand: " + silo);
		lblRunde.setText("Runde: " + runde + "/" + maxRunden);
	}
	
	public void setTabChangeListener() {
		mtp.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Tab: " + mtp.getSelectedIndex());
				if (mtp.getSelectedIndex() == 0) {
					setPflanzen();
					setTiere();
					setProdukte();
					setStatus();
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

}
