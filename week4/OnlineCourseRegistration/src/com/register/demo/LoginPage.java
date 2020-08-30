package com.register.demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener {
	private Container c;
	JFrame f=new JFrame();
	JPanel panel;
	JLabel title;
	JLabel username,password,message;
	JTextField name;
	JPasswordField pass;
	JButton login,register;
	
	LoginPage(){
		setTitle("LOGIN");
    	setBounds(500, 90, 900, 800); 
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setResizable(false);  
    	 c = getContentPane(); 
	     c.setLayout(null);
	     c.setBackground(Color.green);
	     
		
		 title=new JLabel("LOGIN");
		 c.add(title);
		 title = new JLabel("LOGIN"); 
		 title.setSize(300, 30); 
	     title.setLocation(300, 30);
         c.add(title);
         Font font=new Font("Verdana",Font.BOLD,25);
         Font font1=new Font("Sans serif",Font.PLAIN,18);
         title.setFont(font);
         
         username=new JLabel("StudentName");
         username.setSize(200, 20); 
         username.setLocation(100, 150); 
	     c.add(username);
	     name=new JTextField();
	     name.setSize(200, 30); 
	     name.setLocation(230, 150);
	     c.add(name);
	     username.setFont(font1);
	     
	     password=new JLabel("Password");
         password.setSize(200, 30); 
         password.setLocation(100, 200); 
	     c.add(password);
	     pass=new JPasswordField();
	     pass.setSize(200, 30); 
	     pass.setLocation(230, 200);
	     c.add(pass);
	     password.setFont(font1);
		
	     login = new JButton("LOGIN"); 
	     Font f=new Font("Arial", Font.PLAIN, 15); 
	     login.setSize(110, 25); 
	     login.setLocation(200,250 ); 
	     login.addActionListener(this); 
         c.add(login);
         login.setFont(f);
         setVisible(true);
         
         register = new JButton("REGISTER"); 
	     register.setSize(110, 25); 
	     register.setLocation(350,250 ); 
	     register.addActionListener(this); 
         c.add(register);
         register.setFont(f);
        }
		@Override
	public void actionPerformed(ActionEvent e) {
		Scanner input=new Scanner(System.in);
		String UserName=input.next();
		String Password=input.next();
		if(UserName.equals(UserName)&& Password.equals(Password)) {
			
			JOptionPane.showMessageDialog(login, "Congratulations!You are Successfully Registration");
		}else {
			
				JOptionPane.showMessageDialog(register,"Invalid Account!You need to register");
			}
		}
}
	

