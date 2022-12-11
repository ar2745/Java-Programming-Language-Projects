import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class DemoCalculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoCalculator window = new DemoCalculator();
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
	public DemoCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 672);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 34, 339, 109);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//================Row 1=========================
		
		JButton btnDelete = new JButton("<-");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder stringbuilder = new StringBuilder(textField.getText());
					stringbuilder.deleteCharAt(textField.getText().length() - 1);
					
					backspace = stringbuilder.toString();
					textField.setText(backspace);
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDelete.setBounds(10, 160, 75, 75);
		frame.getContentPane().add(btnDelete);
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnClear.setBounds(95, 160, 75, 75);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercentage = new JButton("%");
		btnPercentage.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				Double firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				String operations = "%";
			}
		});
		btnPercentage.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPercentage.setBounds(180, 160, 75, 75);
		frame.getContentPane().add(btnPercentage);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				Double firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				String operations = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPlus.setBounds(265, 160, 75, 75);
		frame.getContentPane().add(btnPlus);
		
		//================Row 2=========================
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				Double firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				String operations = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMinus.setBounds(265, 246, 75, 75);
		frame.getContentPane().add(btnMinus);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn9.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn9.setBounds(180, 246, 75, 75);
		frame.getContentPane().add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn8.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn8.setBounds(95, 246, 75, 75);
		frame.getContentPane().add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn7.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn7.setBounds(10, 246, 75, 75);
		frame.getContentPane().add(btn7);
		
		//================Row 3=========================
		
		JButton btnMultiplication = new JButton("*");
		btnMultiplication.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				Double firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				String operations = "X";
			}
		});
		btnMultiplication.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnMultiplication.setBounds(265, 332, 75, 75);
		frame.getContentPane().add(btnMultiplication);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn6.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn6.setBounds(180, 332, 75, 75);
		frame.getContentPane().add(btn6);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn5.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn5.setBounds(95, 332, 75, 75);
		frame.getContentPane().add(btn5);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn4.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn4.setBounds(10, 332, 75, 75);
		frame.getContentPane().add(btn4);
		
		//================Row 4=========================
		
		JButton btnDivision = new JButton("/");
		btnDivision.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				Double firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				String operations = "/";
			}
		});
		btnDivision.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDivision.setBounds(265, 418, 75, 75);
		frame.getContentPane().add(btnDivision);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn3.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn3.setBounds(180, 418, 75, 75);
		frame.getContentPane().add(btn3);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn2.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn2.setBounds(95, 418, 75, 75);
		frame.getContentPane().add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btn1.getText(); 
				textField.setText(EnterValue);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btn1.setBounds(10, 418, 75, 75);
		frame.getContentPane().add(btn1);
		
		//================Row 5=========================
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				String answer;
				double result;				
				Double secondnum = Double.parseDouble(textField.getText());				
				String operations = null;
				Double firstnum = null;
				
				if(operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "X") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "/") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operations == "%") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEquals.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnEquals.setBounds(265, 504, 75, 75);
		frame.getContentPane().add(btnEquals);
		
		JButton btnPlusMinus = new JButton("\u00B1");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double plusminus = Double.parseDouble(String.valueOf(textField.getText()));
						plusminus = plusminus * (-1);
						textField.setText(String.valueOf(plusminus)); 
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnPlusMinus.setBounds(180, 504, 75, 75);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btnDecimal = new JButton(".");
		btnDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btnDecimal.getText(); 
				textField.setText(EnterValue);
			}
		});
		btnDecimal.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDecimal.setBounds(95, 504, 75, 75);
		frame.getContentPane().add(btnDecimal);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterValue = textField.getText() + btnZero.getText(); 
				textField.setText(EnterValue);
			}
		});
		btnZero.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnZero.setBounds(10, 504, 75, 75);
		frame.getContentPane().add(btnZero);
	}

}
