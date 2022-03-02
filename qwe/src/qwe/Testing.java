package qwe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Choice;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JScrollBar;

public class Testing {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testing window = new Testing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Testing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 553, 427);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(240, 248, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 10));
		panel.setBackground(new Color(0, 255, 0));
		panel.setBounds(52, 32, 206, 87);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 9));
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBackground(new Color(0, 255, 0));
		panel_1.setBounds(52, 134, 206, 87);
		frame.getContentPane().add(panel_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("New toggle button");
		tglbtnNewToggleButton.setBounds(102, 270, 135, 75);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(271, 276, 97, 63);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(297, 62, 206, 63);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(297, 144, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_1.setBounds(297, 189, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		rdbtnNewRadioButton_2.setBounds(297, 241, 121, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		table = new JTable();
		table.setBounds(297, 10, 135, 56);
		frame.getContentPane().add(table);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(405, 276, 102, 33);
		frame.getContentPane().add(spinner);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(508, 10, 17, 48);
		frame.getContentPane().add(scrollBar);
	}
}
