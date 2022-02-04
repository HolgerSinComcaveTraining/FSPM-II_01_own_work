package bhs.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Rectangle;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import bhs.view.panels.UebersichtPanel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import bhs.view.panels.StallPanel;
import bhs.view.panels.FelderPanel;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblKonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private UebersichtPanel uebersichtPanel;
	private JTabbedPane mainTabbedPane;
	private JButton btnNewRound;
	private StallPanel stallPanel;
	private FelderPanel felderPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("Bauernhofsimulator - Holger");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_status = new JPanel();
		panel_status.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), new EtchedBorder(EtchedBorder.LOWERED, null, null)));
		contentPane.add(panel_status, BorderLayout.NORTH);
		panel_status.setLayout(new GridLayout(0, 4, 0, 0));
		
		lblKonto = new JLabel("Kontostand: xx");
		lblKonto.setHorizontalAlignment(SwingConstants.CENTER);
		panel_status.add(lblKonto);
		
		lblFutter = new JLabel("Futterverbrauch: xx");
		lblFutter.setHorizontalAlignment(SwingConstants.CENTER);
		panel_status.add(lblFutter);
		
		lblSilo = new JLabel("Silobestand: xx");
		lblSilo.setHorizontalAlignment(SwingConstants.CENTER);
		panel_status.add(lblSilo);
		
		lblRunde = new JLabel("Runde xx / xx");
		lblRunde.setHorizontalAlignment(SwingConstants.CENTER);
		panel_status.add(lblRunde);
		
		mainTabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		mainTabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);
		
		uebersichtPanel = new UebersichtPanel();
		uebersichtPanel.setBackground(SystemColor.menu);
		mainTabbedPane.addTab("    \u00DCbersicht    ", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), uebersichtPanel, null);
		
		stallPanel = new StallPanel();
		mainTabbedPane.addTab("Stall", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), stallPanel, null);
		
		felderPanel = new FelderPanel();
		mainTabbedPane.addTab("Felder", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), felderPanel, null);
		
		JPanel panelZucht = new JPanel();
		mainTabbedPane.addTab("Zucht", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), panelZucht, null);
		
		JPanel panelMarkt = new JPanel();
		mainTabbedPane.addTab("Markt", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), panelMarkt, null);
		panelMarkt.setLayout(new GridLayout(0, 1, 0, 0));
		
		UebersichtPanel panelMarktBestand = new UebersichtPanel();
		panelMarkt.add(panelMarktBestand);
		
		JTabbedPane marktTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		marktTabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelMarkt.add(marktTabbedPane);
		
		JPanel panelAnkauf = new JPanel();
		marktTabbedPane.addTab("Ankauf", null, panelAnkauf, null);
		
		JPanel panelVerkauf = new JPanel();
		marktTabbedPane.addTab("Verkauf", null, panelVerkauf, null);
		
		btnNewRound = new JButton("Runde beenden");
		contentPane.add(btnNewRound, BorderLayout.SOUTH);
	}

	public JLabel getLblKonto() {
		return lblKonto;
	}

	public JLabel getLblFutter() {
		return lblFutter;
	}

	public JLabel getLblSilo() {
		return lblSilo;
	}

	public JLabel getLblRunde() {
		return lblRunde;
	}

	public UebersichtPanel getUebersichtPanel() {
		return uebersichtPanel;
	}

	public JTabbedPane getMainTabbedPane() {
		return mainTabbedPane;
	}

	public JButton getBtnNewRound() {
		return btnNewRound;
	}

	public StallPanel getStallPanel() {
		return stallPanel;
	}

	public FelderPanel getFelderPanel() {
		return felderPanel;
	}

}
