import javax.swing.*;
import java.awt.event.*;

class GuiDemo implements ActionListener{
	JLabel l0,l1,l2;
	JTextField t0,t1;
	JButton button;
	GuiDemo(){
		JFrame frame = new JFrame("ADD");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		l0 = new JLabel("Enter a number");
		l1 = new JLabel("Enter a number");
		t0 = new JTextField();
		t1 = new JTextField();
		l2 = new JLabel();
		button = new JButton("SUBMIT");
		
		l0.setBounds(50,50,100,20);
		l1.setBounds(50,100,100,20);
		t0.setBounds(200,50,100,20);
		t1.setBounds(200,100,100,20);
		l2.setBounds(170,200,100,20);
		button.setBounds(150,250,100,20);
		button.addActionListener(this);
		frame.getContentPane().add(l0);
		frame.getContentPane().add(t0);
		frame.getContentPane().add(l1);
		frame.getContentPane().add(t1);
		frame.getContentPane().add(l2);
		frame.getContentPane().add(button);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		int a = Integer.parseInt(t0.getText());
		int b = Integer.parseInt(t1.getText());
		int c =a+b;
		l2.setText("Add "+c);
	}
	public static void main(String[] args){
		GuiDemo obj = new GuiDemo();
	}
}
		