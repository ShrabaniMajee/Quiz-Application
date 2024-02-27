package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener 
{

    Score(String name, int score) 
    {
        setBounds(350, 150, 850, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
       try 
       {
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/score.jpg"));
    Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel image = new JLabel(i3);
    image.setBounds(0, 200, 300, 250);
    add(image);
    }
       catch (NullPointerException e) 
       {
    System.err.println("Error loading image: " + e.getMessage());
    e.printStackTrace();
    }

        
        JLabel heading = new JLabel("Thank You " + name + " for playing the quiz game...");
        heading.setBounds(45, 30, 800, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(128, 0, 128));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) 
    {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) 
    {
        new Score("User", 0);
    }
}