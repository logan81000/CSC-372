package Critical_Thinking;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIBankBalanceApplication implements ActionListener {
	
	private JTextField textfield;
	private double balance;
	private JLabel balanceL;
	
	GUIBankBalanceApplication() {
		JFrame frame = new JFrame("Bank Account");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 100);
		frame.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Woud you like to deposit or withdraw funds: ");
		textfield = new JTextField(20);
		JButton button = new JButton("Deposit");
		JButton button2 = new JButton("Withdraw");
		balanceL = new JLabel("Balance:  $" + balance);
		frame.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		panel.add(button2);
		panel.add(balanceL);
		button.addActionListener(this);
		button2.addActionListener(this);
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double balance2 = Double.parseDouble(textfield.getText());
		if (e.getActionCommand().equals("Deposit")) {
			balance += balance2;
		} else {
			balance -= balance2;
		}
		balanceL.setText("Balance:  $" + balance);
		textfield.setText("");
		
	}
	
	
	public static void main(String[] args) {
		new GUIBankBalanceApplication();
		
	}

}
