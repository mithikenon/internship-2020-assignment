package com.register.demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


 class Registration extends JFrame implements ActionListener {
	private Container c;
	JPanel panel;
	JLabel title;
	JLabel studentid,studentname,password,confirmpassword,phone,Email,NRC,Course;
	JTextField id,name,pass,confirmps,ph,email,nrc,course;
    JLabel gender; 
    JRadioButton male; 
	JRadioButton female; 
	ButtonGroup gengp; 
	JLabel dob; 
    JComboBox date; 
	JComboBox month; 
	JComboBox year; 
    JLabel add; 
	JTextArea tadd; 
	JCheckBox term; 
	 
	JButton register;
	JButton cancel;
	JTextArea tout; 
	JLabel res; 
	JTextArea resadd;
	private String dates[] 
            = { "1", "2", "3", "4", "5", 
                "6", "7", "8", "9", "10", 
                "11", "12", "13", "14", "15", 
                "16", "17", "18", "19", "20", 
                "21", "22", "23", "24", "25", 
                "26", "27", "28", "29", "30", 
                "31" }; 
        private String months[] 
            = { "Jan", "feb", "Mar", "Apr", 
                "May", "Jun", "July", "Aug", 
                "Sup", "Oct", "Nov", "Dec" }; 
        private String years[] 
            = { "1995", "1996", "1997", "1998", 
                "1999", "2000", "2001", "2002", 
                "2003", "2004", "2005", "2006", 
                "2007", "2008", "2009", "2010", 
                "2011", "2012", "2013", "2014", 
                "2015", "2016", "2017", "2018", 
                "2019" 
                }; 
        
    Registration(){
    	setTitle("Registration Form");
    	setBounds(500, 90, 1000, 800); 
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	setResizable(false);  
    	 c = getContentPane(); 
	     c.setLayout(null); 
	     c.setBackground(Color.CYAN);
	     
	     
	    title = new JLabel("Registration Form"); 
	    title.setSize(300, 30); 
        title.setLocation(300, 30);
        c.add(title);
        Font font=new Font("Verdana",Font.BOLD,25);
        title.setFont(font);
	     
         
	     
	     studentid=new JLabel("StudentId");
	     studentid.setSize(100, 20); 
	     studentid.setLocation(100, 100); 
	     c.add(studentid);
	     id=new JTextField();
	     id.setSize(150, 20); 
	     id.setLocation(200, 100);
	     c.add(id);
	     Font font1=new Font("Sans serif",Font.PLAIN,18);
	     studentid.setFont(font1);
	     
	     
	     
	     
	     studentname=new JLabel("StudentName");
         studentname.setSize(220, 20); 
         studentname.setLocation(100, 150); 
	     c.add(studentname);
	     name=new JTextField();
	     name.setSize(150, 20); 
	     name.setLocation(222, 150);
	     c.add(name);
	     studentname.setFont(font1);
	     
	     password=new JLabel("Password");
         password.setSize(100, 20); 
         password.setLocation(100, 200); 
	     c.add(password);
	     pass=new JTextField();
	     pass.setSize(150, 20); 
	     pass.setLocation(200, 200);
	     c.add(pass);
	     password.setFont(font1);
	     
	     confirmpassword=new JLabel("ConfirmPassword");
	     confirmpassword.setSize(220, 20); 
	     confirmpassword.setLocation(100, 250); 
	     c.add(confirmpassword);
	     confirmps=new JTextField();
	     confirmps.setSize(150, 20); 
	     confirmps.setLocation(245, 250);
	     c.add(confirmps);
	     confirmpassword.setFont(font1);
	     
	     phone=new JLabel("Phone");
	     phone.setSize(100, 20); 
	     phone.setLocation(100, 300); 
	     c.add(phone);
	     ph=new JTextField();
	     ph.setSize(150, 20); 
	     ph.setLocation(200, 300);
	     c.add(ph);
	     phone.setFont(font1);
	     
	     Email=new JLabel("Email");
	     Email.setSize(100, 20); 
	     Email.setLocation(100, 350); 
	     c.add(Email);
	     email=new JTextField();
	     email.setSize(150, 20); 
	     email.setLocation(200, 350);
	     c.add(email);
	     Email.setFont(font1);
	     
	     NRC=new JLabel("NRC");
	     NRC.setSize(100, 20); 
	     NRC.setLocation(100, 400); 
	     c.add(NRC);
	     nrc=new JTextField();
	     nrc.setSize(150, 20); 
	     nrc.setLocation(200, 400);
	     c.add(nrc);
	     NRC.setFont(font1);
	     
	     Course=new JLabel("Course");
	     Course.setSize(100, 20); 
	     Course.setLocation(100, 450); 
	     c.add(Course);
	     course=new JTextField();
	     course.setSize(150, 20); 
	     course.setLocation(200, 450);
	     c.add(course);
	     Course.setFont(font1);
	     
	     gender = new JLabel("Gender"); 
	     //gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
	     gender.setSize(100, 20); 
	     gender.setLocation(100, 500); 
         c.add(gender); 
         gender.setFont(font1);
	  
	  
         male = new JRadioButton("Male"); 
	       // male.setFont(new Font("Arial", Font.PLAIN, 15)); 
	     male.setSelected(true); 
	     male.setSize(75, 20); 
         male.setLocation(200, 500); 
         c.add(male); 
	  
	     female = new JRadioButton("Female"); 
	       // female.setFont(new Font("Arial", Font.PLAIN, 15)); 
	     female.setSelected(false); 
         female.setSize(80, 20); 
	     female.setLocation(275, 500); 
	     c.add(female); 
	  
	        gengp = new ButtonGroup(); 
	        gengp.add(male); 
	        gengp.add(female); 
	        
	        dob = new JLabel("DOB"); 
	        dob.setSize(100, 20); 
	        dob.setLocation(100, 550); 
	        c.add(dob); 
	  
	        date = new JComboBox(dates); 
	       // date.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        date.setSize(50, 20); 
	        date.setLocation(200, 550); 
	        c.add(date); 
	  
	        month = new JComboBox(months); 
	       // month.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        month.setSize(60, 20); 
	        month.setLocation(250, 550); 
	        c.add(month); 
	  
	        year = new JComboBox(years); 
	       // year.setFont(new Font("Arial", Font.PLAIN, 15)); 
	        year.setSize(60, 20); 
	        year.setLocation(320, 550); 
	        c.add(year); 
	  
	        add = new JLabel("Address"); 
	       // add.setFont(new Font("Arial", Font.PLAIN, 20)); 
	        add.setSize(100, 20); 
	        add.setLocation(100, 600); 
	        c.add(add); 
	        
	        tadd = new JTextArea(); 
		      //  tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
		        tadd.setSize(200, 40); 
		        tadd.setLocation(200, 600); 
		        tadd.setLineWrap(true); 
		        c.add(tadd); 
		  
		        term = new JCheckBox("I'm not a robot"); 
		       // term.setFont(new Font("Arial", Font.PLAIN, 15)); 
		        term.setSize(250, 25); 
		        term.setLocation(150, 650); 
		        c.add(term); 
		  
		        
		        
		        register = new JButton("Register"); 
			       // reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
			        register.setSize(110, 25); 
			        register.setLocation(270, 700); 
			        register.addActionListener(this); 
			        c.add(register); 
			        
			        cancel = new JButton("Cancel"); 
			        //sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
			        cancel.setSize(110, 25); 
			        cancel.setLocation(150, 700); 
			        cancel.addActionListener(this); 
			        c.add(cancel); 
			  
			        tout = new JTextArea(); 
			       // tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
			        tout.setSize(300, 400); 
			        tout.setLocation(500, 80); 
			        tout.setLineWrap(true); 
			        tout.setEditable(false); 
			        c.add(tout); 
			  
			        res = new JLabel(""); 
			       // res.setFont(new Font("Arial", Font.PLAIN, 20)); 
			        res.setSize(500, 25); 
			        res.setLocation(100, 500); 
			        c.add(res); 
			  
			        resadd = new JTextArea(); 
			       // resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
			        resadd.setSize(200, 75); 
			        resadd.setLocation(580, 200); 
			        resadd.setLineWrap(true); 
			        c.add(resadd); 
			        setVisible(true); 
	 }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		{ 
	        if (e.getSource() == register) { 
	            if (term.isSelected()) { 
	                String data1; 
	                String data 
	                    = "StudentId : "
	                      + id.getText() + "\n"+
	                      "StudentName : "
	                      + name.getText() + "\n"+
	                      "Password : "
	                      + pass.getText() + "\n"+
	                      "ConfirmPassword : "
	                      + confirmps.getText() + "\n"+
	                      "Phone : "
	                      + ph.getText() + "\n"+
	                      "Email : "
	                      + email.getText() + "\n"+
	                      "NRC : "
	                      + nrc.getText() + "\n"+
	                      "Course : "
	                      + course.getText() + "\n";
	                      
	                      
	                      
	                if (male.isSelected()) 
	                    data1 = "Gender : Male"
	                            + "\n"; 
	                else
	                    data1 = "Gender : Female"
	                            + "\n"; 
	                String data2 
	                    = "DOB : "
	                      + (String)date.getSelectedItem() 
	                      + "/" + (String)month.getSelectedItem() 
	                      + "/" + (String)year.getSelectedItem() 
	                      + "\n"; 
	  
	                String data3 = "Address : " + tadd.getText(); 
	                tout.setText(data + data1 + data2 + data3); 
	                tout.setEditable(false); 
	                res.setText("Registration Successfully.."); 
	            } 
	            else { 
	                tout.setText(""); 
	                resadd.setText(""); 
	                res.setText("Please accept the"
	                            + " terms & conditions.."); 
	            } 
	        } 
	  
	        else if (e.getSource() ==cancel) { 
	            String def = ""; 
	            id.setText(def);
	            name.setText(def);
	            pass.setText(def);
	            confirmps.setText(def);
	            ph.setText(def);
	            email.setText(def);
	            nrc.setText(def);
	            course.setText(def);
	            
	            tadd.setText(def); 
	            res.setText(def); 
	            tout.setText(def); 
	            term.setSelected(false); 
	            date.setSelectedIndex(0); 
	            month.setSelectedIndex(0); 
	            year.setSelectedIndex(0); 
	            resadd.setText(def); 
	} 
	
	        }        
		}
 }
	class Frame{
		public static void main(String[] args)throws Exception {
			Registration r=new Registration();
		}
	}

