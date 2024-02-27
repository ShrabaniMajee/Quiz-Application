
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    JButton rules, back;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/login.jpg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,600);
        add(image);
        
        JLabel heading=new JLabel("READY FOR THE QUIZ?!?");
        heading.setBounds(680,60,500,45);
        heading.setFont(new Font("Comic Sans MS",Font.BOLD,35));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        
        JLabel name=new JLabel("ENTER YOUR NAME");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(128, 0, 128));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(745,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules=new JButton("RULES");
        rules.setBounds(745, 270,120,25);
        rules.setBackground(new Color(128, 0, 128));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("BACK");
        back.setBounds(925, 270,120,25);
        back.setBackground(new Color(128, 0, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        
        
        
        setSize(1200,600);
        setLocation(175,150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==rules)
        {
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }
        else if(ae.getSource()==back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String args[])
    {
        new Login();
    }
    
}
