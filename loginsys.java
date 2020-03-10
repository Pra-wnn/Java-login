package JavaBegin;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class loginsys extends JFrame implements ActionListener{
	
	JButton login;
	JLabel pass,msg;
	JLabel name;
	JTextField nam;
	JPasswordField pas;
	JPanel pan;
	
	
	loginsys()
	{
		setSize(500,600);
		login = new JButton("LOGIN");
		pass = new JLabel("PASSWORD");
		name = new JLabel("USERNAME");
		msg= new JLabel();
		nam = new JTextField("");
		pas = new JPasswordField("");
		pan = new JPanel(new GridLayout(3,1));
		
		
		pan.add(name);
		pan.add(nam);
		pan.add(pass);
		pan.add(pas);
		pan.add(login);
		pan.add(msg);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login.addActionListener(this);
		add(pan, BorderLayout.CENTER);
		setTitle("LOGIN WINDOW");
		setVisible(true);
		
	}
	
	@Override
	
	public void actionPerformed(ActionEvent e)
	
	{
		String uname = nam.getText();
		String upass = pas.getText();
		
		if (uname.trim().equals("admin") && upass.trim().contentEquals("admin"))
		{
			msg.setText("Successfull login!");
			
		}
		
		else
		{
			msg.setText("Incorrect Password!");
		}
		
	}
	
	


public static void main(String args[])
{
	new loginsys();
}

}