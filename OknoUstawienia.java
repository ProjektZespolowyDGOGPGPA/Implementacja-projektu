import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class OknoUstawienia extends JFrame {

	private JPanel panelOknoUstawien;
	private JTextField tFliczbaGraczy;
	private OknoGry oknoGry;
	private OknoAutorzy oknoAutorzy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoUstawienia frame = new OknoUstawienia();
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
	public OknoUstawienia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(UIManager.getColor("menu"));
		setJMenuBar(menuBar);
		
		JMenu mnPlik = new JMenu("Plik");
		menuBar.add(mnPlik);
		
		JMenuItem mntmZakocz = new JMenuItem("Zakończ");
		mntmZakocz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnPlik.add(mntmZakocz);
		
		JMenu mnPomoc = new JMenu("Pomoc");
		menuBar.add(mnPomoc);
		
		JMenuItem mntmOAutorach = new JMenuItem("o autorach");
		mntmOAutorach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oknoAutorzy = new OknoAutorzy();
				oknoAutorzy.setVisible(true);
			}
		});
		mnPomoc.add(mntmOAutorach);
		panelOknoUstawien = new JPanel();
		panelOknoUstawien.setBackground(new Color(204, 204, 255));
		panelOknoUstawien.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelOknoUstawien);
		
		JTextArea textUstaweniaWstepne = new JTextArea();
		textUstaweniaWstepne.setText("Ustawienia Wstępne");
		textUstaweniaWstepne.setFont(new Font("Times New Roman", Font.BOLD, 24));
		textUstaweniaWstepne.setBackground(new Color(204, 204, 255));
		
		JTextArea textIleGraczy = new JTextArea();
		textIleGraczy.setText("Wybierz liczbę graczy:");
		textIleGraczy.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textIleGraczy.setBackground(new Color(204, 204, 255));
		
		tFliczbaGraczy = new JTextField();
		tFliczbaGraczy.setColumns(10);
		
		JTextArea textInfoIloscGraczy = new JTextArea();
		textInfoIloscGraczy.setText("Wpisz liczbę graczy (2 - 4)");
		textInfoIloscGraczy.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textInfoIloscGraczy.setBackground(new Color(204, 204, 255));
		
		JTextArea textCzyNaCzas = new JTextArea();
		textCzyNaCzas.setText("Gra na czas:");
		textCzyNaCzas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textCzyNaCzas.setBackground(new Color(204, 204, 255));
		
		JRadioButton rBCzyNaCzas = new JRadioButton("");
		rBCzyNaCzas.setBackground(new Color(204, 204, 255));
		
		JTextArea txtrWybrPionka = new JTextArea();
		txtrWybrPionka.setBackground(new Color(204, 204, 255));
		txtrWybrPionka.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txtrWybrPionka.setText("Wybór Pionka");
		
		JTextArea txtrGracz_1 = new JTextArea();
		txtrGracz_1.setBackground(new Color(204, 204, 255));
		txtrGracz_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrGracz_1.setText("Gracz 1:");
		
		JTextArea txtrGracz_2 = new JTextArea();
		txtrGracz_2.setBackground(new Color(204, 204, 255));
		txtrGracz_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrGracz_2.setText("Gracz 2:");
		
		JTextArea txtrGracz_3 = new JTextArea();
		txtrGracz_3.setBackground(new Color(204, 204, 255));
		txtrGracz_3.setText("Gracz 3:");
		txtrGracz_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JTextArea txtrGracz_4 = new JTextArea();
		txtrGracz_4.setBackground(new Color(204, 204, 255));
		txtrGracz_4.setText("Gracz 4:");
		txtrGracz_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		
		JComboBox comboBox = new JComboBox();
		
		JTextArea txtrZaznaczTaknie = new JTextArea();
		txtrZaznaczTaknie.setBackground(new Color(204, 204, 255));
		txtrZaznaczTaknie.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrZaznaczTaknie.setText("Zaznacz Tak/Nie");
		
		JButton btnStart = new JButton("Start!");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oknoGry = new OknoGry();
				panelOknoUstawien.setVisible(false);
				oknoGry.setVisible(true);
			}
		});
		btnStart.setBackground(Color.GRAY);
		GroupLayout gl_panelOknoUstawien = new GroupLayout(panelOknoUstawien);
		gl_panelOknoUstawien.setHorizontalGroup(
			gl_panelOknoUstawien.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(150)
					.addComponent(textUstaweniaWstepne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(18)
					.addComponent(textIleGraczy, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tFliczbaGraczy, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addComponent(textInfoIloscGraczy, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(18)
					.addComponent(textCzyNaCzas, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(rBCzyNaCzas)
					.addGap(44)
					.addComponent(txtrZaznaczTaknie, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(150)
					.addComponent(txtrWybrPionka, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(80)
					.addComponent(txtrGracz_1, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(117)
					.addComponent(txtrGracz_3, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(80)
					.addComponent(txtrGracz_2, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(149)
					.addComponent(txtrGracz_4, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(452)
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
		);
		gl_panelOknoUstawien.setVerticalGroup(
			gl_panelOknoUstawien.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOknoUstawien.createSequentialGroup()
					.addGap(41)
					.addComponent(textUstaweniaWstepne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(gl_panelOknoUstawien.createParallelGroup(Alignment.LEADING)
						.addComponent(textIleGraczy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelOknoUstawien.createSequentialGroup()
							.addGap(1)
							.addComponent(tFliczbaGraczy, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(textInfoIloscGraczy, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addGroup(gl_panelOknoUstawien.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelOknoUstawien.createSequentialGroup()
							.addGap(1)
							.addComponent(textCzyNaCzas, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelOknoUstawien.createSequentialGroup()
							.addGap(7)
							.addComponent(rBCzyNaCzas, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrZaznaczTaknie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addComponent(txtrWybrPionka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(32)
					.addGroup(gl_panelOknoUstawien.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrGracz_1, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelOknoUstawien.createSequentialGroup()
							.addGap(1)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrGracz_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(7)
					.addGroup(gl_panelOknoUstawien.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrGracz_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrGracz_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addComponent(btnStart, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
		);
		panelOknoUstawien.setLayout(gl_panelOknoUstawien);
	}
}
