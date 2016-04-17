import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

public class OknoStartowe {

	private JFrame frmUniversityMonopoly;
	private OknoUstawienia oknoUstawienia = null;
	private OknoAutorzy oknoAutorzy = null;
	private Icon logo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoStartowe window = new OknoStartowe();
					window.frmUniversityMonopoly.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public OknoStartowe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUniversityMonopoly = new JFrame();
		frmUniversityMonopoly.getContentPane().setBackground(new Color(204, 204, 255));
		frmUniversityMonopoly.setTitle("University Monopoly");
		frmUniversityMonopoly.setBounds(100, 100, 600, 400);
		frmUniversityMonopoly.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar Menu = new JMenuBar();
		frmUniversityMonopoly.setJMenuBar(Menu);
		
		JMenu mnPlik = new JMenu("Plik");
		Menu.add(mnPlik);
		
		JMenuItem mntmZakocz = new JMenuItem("Zakończ");
		mntmZakocz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		mnPlik.add(mntmZakocz);
		
		JMenu mnPomoc = new JMenu("Pomoc");
		Menu.add(mnPomoc);
		
		JMenuItem mntmOAutorach = new JMenuItem("0 autorach");
		mntmOAutorach.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				oknoAutorzy = new OknoAutorzy();
				oknoAutorzy.setVisible(true);
			}
		});
		mnPomoc.add(mntmOAutorach);
		
		JPanel PanelOknoStartowe = new JPanel();
		PanelOknoStartowe.setBackground(new Color(204, 204, 255));
		frmUniversityMonopoly.getContentPane().add(PanelOknoStartowe);
		
		GroupLayout groupLayout = new GroupLayout(frmUniversityMonopoly.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addComponent(PanelOknoStartowe, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(PanelOknoStartowe, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
		);
		
		JButton btnAutorzy = new JButton("Autorzy");
		btnAutorzy.setMinimumSize(new Dimension(70, 25));
		btnAutorzy.setPreferredSize(new Dimension(60, 25));
		btnAutorzy.setMaximumSize(new Dimension(80, 25));
		btnAutorzy.setBackground(Color.GRAY);
		btnAutorzy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(oknoAutorzy != null) oknoAutorzy.setVisible(true);
				else{
					oknoAutorzy = new OknoAutorzy();
					oknoAutorzy.setVisible(true);
				}
			}
		});
		btnAutorzy.setForeground(Color.BLACK);
		
		JButton btnGraj = new JButton("Graj");
		btnGraj.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnGraj.setMinimumSize(new Dimension(70, 25));
		btnGraj.setPreferredSize(new Dimension(60, 25));
		btnGraj.setMaximumSize(new Dimension(80, 25));
		btnGraj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(oknoUstawienia != null){
					frmUniversityMonopoly.setVisible(false);
					oknoUstawienia.setVisible(true);
				}
				else{
					frmUniversityMonopoly.setVisible(false);
					oknoUstawienia = new OknoUstawienia();
					oknoUstawienia.setVisible(true);
				}
			}
		});
		btnGraj.setBackground(Color.GRAY);
		btnGraj.setForeground(Color.BLACK);
		logo = createMyIcon("logo.png");
		JLabel lblLogo = new JLabel(logo);
		lblLogo.setText("logo");
		GroupLayout gl_PanelOknoStartowe = new GroupLayout(PanelOknoStartowe);
		gl_PanelOknoStartowe.setHorizontalGroup(
			gl_PanelOknoStartowe.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelOknoStartowe.createSequentialGroup()
					.addGap(202)
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_PanelOknoStartowe.createSequentialGroup()
					.addGap(216)
					.addComponent(btnGraj, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_PanelOknoStartowe.createSequentialGroup()
					.addGap(216)
					.addComponent(btnAutorzy, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
		);
		gl_PanelOknoStartowe.setVerticalGroup(
			gl_PanelOknoStartowe.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_PanelOknoStartowe.createSequentialGroup()
					.addGap(11)
					.addComponent(lblLogo, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addComponent(btnGraj, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(btnAutorzy, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		PanelOknoStartowe.setLayout(gl_PanelOknoStartowe);
		frmUniversityMonopoly.getContentPane().setLayout(groupLayout);
	}
	
	public Icon createMyIcon(String file) {
		String name = file;
		Icon icon = new ImageIcon(getClass().getResource(name));
		return icon;
	}
}
