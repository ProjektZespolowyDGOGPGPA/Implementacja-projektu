import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.TextField;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OknoAutorzy extends JDialog {
	private JButton btnPowrot;
	/**
	 * Create the dialog.
	 */
	public OknoAutorzy() {
		getContentPane().setBackground(new Color(204, 204, 255));
		setTitle("Autorzy");
		setBounds(100, 100, 562, 302);
		{
			btnPowrot = new JButton("Powrót");
			btnPowrot.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
				}
			});
			btnPowrot.setBackground(Color.GRAY);
		}
		
		JTextArea txtrAutorzy = new JTextArea();
		txtrAutorzy.setEditable(false);
		txtrAutorzy.setBackground(new Color(204, 204, 255));
		txtrAutorzy.setFont(new Font("Times New Roman", Font.BOLD, 24));
		txtrAutorzy.setTabSize(18);
		txtrAutorzy.setText("Autorzy");
		
		JTextArea txtrDawidGawiskiPawe = new JTextArea();
		txtrDawidGawiskiPawe.setEditable(false);
		txtrDawidGawiskiPawe.setBackground(new Color(204, 204, 255));
		txtrDawidGawiskiPawe.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		txtrDawidGawiskiPawe.setText("Dawid Gawiński\r\nPaweł Gawron\r\nOskar Gruszczyński\r\nPatryk Afelt");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(175)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrAutorzy, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrDawidGawiskiPawe, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPowrot, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(43)
					.addComponent(txtrAutorzy, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(txtrDawidGawiskiPawe, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnPowrot, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
		);
		getContentPane().setLayout(groupLayout);
	}
}
