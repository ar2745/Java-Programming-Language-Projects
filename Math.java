import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Math {

	private JFrame frame;
	private JTextField addValue;
	private JTextField subValue;
	private JButton btnSubtract;
	private JTextField textDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Math window = new Math();
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
	public Math() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		addValue = new JTextField();
		addValue.setBounds(81, 32, 125, 50);
		frame.getContentPane().add(addValue);
		addValue.setColumns(10);
		
		subValue = new JTextField();
		subValue.setColumns(10);
		subValue.setBounds(270, 32, 125, 50);
		frame.getContentPane().add(subValue);
		
		JButton btnAddition = new JButton("Add");
		btnAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, result;
				try {
					num1 = Integer.parseInt(addValue.getText());
					num2 = Integer.parseInt(subValue.getText());
					result = num1 + num2;
					textDisplay.setText(Integer.toString(result));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Only valid integers are accepted");
				}
			}
		});
		btnAddition.setBounds(144, 115, 89, 23);
		frame.getContentPane().add(btnAddition);
		
		btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1, num2, result;
				try {
					num1 = Integer.parseInt(addValue.getText());
					num2 = Integer.parseInt(subValue.getText());
					result = num1 - num2;
					textDisplay.setText(Integer.toString(result));
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Only valid integers are accepted");
				}
			}
		});
		btnSubtract.setBounds(241, 115, 89, 23);
		frame.getContentPane().add(btnSubtract);
		
		textDisplay = new JTextField();
		textDisplay.setBounds(112, 176, 253, 50);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
	}
}
