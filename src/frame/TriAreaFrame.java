/*			Triangle Area
 * 
 * Programmer: Nick Couzelis
 * 		 Date: 02/03/2017
 * 
 * This program finds the area of a triangle from three user input side lengths.
 */
package frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TriAreaFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtSide1;
	private JTextField txtSide2;
	private JTextField txtSide3;
	private JTextField txtResult;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriAreaFrame frame = new TriAreaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @param s3
	 * @return
	 */
	public static boolean isValid(double s1, double s2, double s3){
		if(s1+s2>s3&&s2+s3>s1&&s3+s1>s2){
			return(true);
		} else {
			return(false);
		}
	}
	
	
	/**
	 * Create the frame.
	 */
	public TriAreaFrame() {
		setResizable(false);
		setTitle("Triangle Area");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 252, 135);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel(); // Panel used to make tabbing nice.
		panel.setBounds(10, 11, 86, 82);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtSide1 = new JTextField();
		txtSide1.setBounds(0, 0, 86, 20);
		panel.add(txtSide1);
		txtSide1.setColumns(10);
		
		txtSide2 = new JTextField();
		txtSide2.setBounds(0, 31, 86, 20);
		panel.add(txtSide2);
		txtSide2.setColumns(10);
		
		txtSide3 = new JTextField();
		txtSide3.setBounds(0, 62, 86, 20);
		panel.add(txtSide3);
		txtSide3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		// Action
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Variables List
				
			}
		});
		btnCalculate.setBounds(106, 10, 130, 32);
		contentPane.add(btnCalculate);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setText("Enter 3 side legths.");
		txtResult.setBounds(106, 53, 130, 40);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
	}
}
