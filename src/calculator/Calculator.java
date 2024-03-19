package calculator;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Color;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 420, 333);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.GRAY);
		textField.setBounds(10, 11, 384, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.PINK);
		btn1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String number = textField.getText() + "1";
		        textField.setText(number);
		    }
		});
		btn1.setBounds(10, 86, 89, 39);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.PINK);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"2";
				textField.setText(number);
			}
		});
		btn2.setBounds(109, 86, 89, 39);
		frame.getContentPane().add(btn2);
		
		
		
		
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.PINK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"3";
				textField.setText(number);
			}
		});
		btn3.setBounds(208, 86, 89, 39);
		frame.getContentPane().add(btn3);
		
		
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.PINK);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"4";
				textField.setText(number);
			}
		});
		btn4.setBounds(10, 136, 89, 39);
		frame.getContentPane().add(btn4);
		
		
		
		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.PINK);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"5";
				textField.setText(number);
			}
		});
		btn5.setBounds(109, 136, 89, 39);
		frame.getContentPane().add(btn5);
		
		
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.PINK);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"6";
				textField.setText(number);
			}
		});
		btn6.setBounds(208, 136, 89, 39);
		frame.getContentPane().add(btn6);
		
		
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.PINK);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"7";
				textField.setText(number);
			}
		});
		btn7.setBounds(10, 186, 89, 39);
		frame.getContentPane().add(btn7);
		
		
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.PINK);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number =textField.getText()+"8";
				textField.setText(number);
			}
		});
		btn8.setBounds(109, 186, 89, 39);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.PINK);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"9";	
				textField.setText(number);
			}
		});
		btn9.setBounds(208, 186, 89, 39);
		frame.getContentPane().add(btn9);
		
		
		
		JButton btn = new JButton("-");
		btn.setBackground(Color.PINK);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sign=textField.getText()+ "-";
				textField.setText(sign);
				
			}
		});
		btn.setBounds(307, 136, 90, 39);
		frame.getContentPane().add(btn);
		
		
		
		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.PINK);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+"0";
				textField.setText(number);
			}
		});
		btn0.setBounds(109, 239, 89, 36);
		frame.getContentPane().add(btn0);
		
		JButton btn10 = new JButton("+");
		btn10.setBackground(Color.PINK);
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sign = textField.getText()+"+";
				textField.setText(sign);
				
			}
		});
		btn10.setBounds(308, 86, 89, 39);
		frame.getContentPane().add(btn10);
		
		JButton btnNewButton = new JButton("=");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String expression = textField.getText();
				String[]  parts = expression.split("[\\+\\-\\*\\/]");
				if(parts.length==2) {
					double operand1 = Double.parseDouble(parts[0]);
					double operand2 = Double.parseDouble(parts[1]);
					if(expression.contains("+")) {
						textField.setText(Double.toString(operand1+operand2));
					}else if(expression.contains("-")) {
						textField.setText(Double.toString(operand1-operand2));
					}
					else if(expression.contains("/")) {
						textField.setText(Double.toString(operand1/operand2));
					}
					else if(expression.contains("*")) {
						textField.setText(Double.toString(operand1*operand2));
					}
					else {
						textField.setText("Invalid");
					}
				}
				
			}
		});
		btnNewButton.setBounds(208, 238, 89, 39);
		frame.getContentPane().add(btnNewButton);
		
		JButton C = new JButton("C");
		C.setBackground(Color.PINK);
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText = textField.getText();
				textField.setText(currentText.substring(0, currentText.length()-1));
			}
		});
		C.setBounds(10, 239, 89, 36);
		frame.getContentPane().add(C);
		
		JButton X = new JButton("x");
		X.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sign = textField.getText()+"*";
				textField.setText(sign);
			}
		});
		X.setBackground(Color.PINK);
		X.setBounds(307, 187, 90, 36);
		frame.getContentPane().add(X);
		
		JButton D = new JButton("/");
		D.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sign = textField.getText()+"/";
				textField.setText(sign);
			}
		});
		D.setBackground(Color.PINK);
		D.setBounds(307, 238, 94, 39);
		frame.getContentPane().add(D);
	}
}
