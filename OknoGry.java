import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class OknoGry extends JFrame {

	private JPanel panelOknoGry;
	private OknoAutorzy oknoAutorzy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OknoGry frame = new OknoGry();
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
	public OknoGry() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		
		JMenuBar menuBar = new JMenuBar();
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
		panelOknoGry = new JPanel();
		panelOknoGry.setBackground(new Color(204, 204, 255));
		panelOknoGry.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelOknoGry);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		
		JButton btnNewButton = new JButton("Rzut kostką");
		btnNewButton.setBackground(Color.GRAY);
		
		JButton btnNewButton_1 = new JButton("handel");
		btnNewButton_1.setBackground(Color.GRAY);
		
		JButton btnNewButton_2 = new JButton("EOT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBackground(Color.GRAY);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panelOknoGry = new GroupLayout(panelOknoGry);
		gl_panelOknoGry.setHorizontalGroup(
			gl_panelOknoGry.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOknoGry.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
					.addGap(21)
					.addGroup(gl_panelOknoGry.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelOknoGry.createSequentialGroup()
							.addGap(11)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(21)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelOknoGry.createSequentialGroup()
							.addGap(71)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panelOknoGry.setVerticalGroup(
			gl_panelOknoGry.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelOknoGry.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_panelOknoGry.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelOknoGry.createSequentialGroup()
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addGap(37)
							.addGroup(gl_panelOknoGry.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
							.addGap(11)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addGap(11)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
		);
		panelOknoGry.setLayout(gl_panelOknoGry);
	}

}
