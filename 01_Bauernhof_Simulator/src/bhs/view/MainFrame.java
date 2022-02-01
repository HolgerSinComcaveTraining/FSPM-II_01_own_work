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

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblKonto;
	private JLabel lblFutter;
	private JLabel lblSilo;
	private JLabel lblRunde;
	private UebersichtPanel uebersichtPanel;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_status = new JPanel();
		contentPane.add(panel_status, BorderLayout.NORTH);
		panel_status.setLayout(new GridLayout(0, 5, 0, 0));
		
		lblKonto = new JLabel("Kontostand: xx");
		panel_status.add(lblKonto);
		
		lblFutter = new JLabel("Futterverbrauch: xx");
		panel_status.add(lblFutter);
		
		lblSilo = new JLabel("Silobestand: xx");
		panel_status.add(lblSilo);
		
		lblRunde = new JLabel("Runde xx / xx");
		panel_status.add(lblRunde);
		
		JButton btnNewRound = new JButton("Runde beenden");
		panel_status.add(btnNewRound);
		
		JTabbedPane mainTabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		mainTabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(mainTabbedPane, BorderLayout.CENTER);
		
		uebersichtPanel = new UebersichtPanel();
		mainTabbedPane.addTab("    \u00DCbersicht    ", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), uebersichtPanel, null);
		
		JPanel panelStall = new JPanel();
		mainTabbedPane.addTab("Stall", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), panelStall, null);
		
		JPanel panelFelder = new JPanel();
		mainTabbedPane.addTab("Felder", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), panelFelder, null);
		
		JPanel panelZucht = new JPanel();
		mainTabbedPane.addTab("Zucht", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), panelZucht, null);
		
		JPanel panelMarkt = new JPanel();
		mainTabbedPane.addTab("Markt", new ImageIcon(MainFrame.class.getResource("/bhs/view/empty_1_40.png")), panelMarkt, null);
		panelMarkt.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelMarktBestand = new JPanel();
		panelMarkt.add(panelMarktBestand);
		
		JTabbedPane marktTabbedPane = new JTabbedPane(JTabbedPane.TOP);
		marktTabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panelMarkt.add(marktTabbedPane);
		
		JPanel panelAnkauf = new JPanel();
		marktTabbedPane.addTab("Ankauf", null, panelAnkauf, null);
		
		JPanel panelVerkauf = new JPanel();
		marktTabbedPane.addTab("Verkauf", null, panelVerkauf, null);
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

}
