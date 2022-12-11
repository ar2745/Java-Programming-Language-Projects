import java.awt.EventQueue;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DateTime {

	private JFrame frame;
	private JLabel lblClock;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DateTime window = new DateTime();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void dateTime() {
		Thread dateTime = new Thread() {
			public void run() {
				try {
					for(;;) {
						Calendar calendar = new GregorianCalendar();
						int day = calendar.get(Calendar.DAY_OF_MONTH);
						int month = calendar.get(Calendar.MONTH);
						int year = calendar.get(Calendar.YEAR);
						
						int second = calendar.get(Calendar.SECOND);
						int minute = calendar.get(Calendar.MINUTE);
						int hour = calendar.get(Calendar.HOUR);
						
						lblClock.setText("Time: " + hour + ":" + minute + ":" + second + " " + "Date: " + month + "/" + day + "/" + year);
						
						sleep(1000);
					}
				}
				catch (Exception e) {
					
				}
			}
		};
		dateTime.start();
	}

	/**
	 * Create the application.
	 */
	public DateTime() {
		initialize();
		dateTime();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblClock = new JLabel("Clock");
		lblClock.setBounds(10, 35, 414, 163);
		frame.getContentPane().add(lblClock);
	}

}
