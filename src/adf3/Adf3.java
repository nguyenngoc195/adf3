/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adf3;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lan
 */
public class Adf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Adf3 loginPanel = new Adf3();

        JFrame fromLogin = new JFrame("STUDENT");
        fromLogin.setSize(400, 700);
        fromLogin.setLocationRelativeTo(null);
        
        
        JLabel h1 = new JLabel("STUDENT");
        h1.setBounds(100, 40, 180, 40);
        h1.setFont(new java.awt.Font("Times New Roman", 1, 30));

        JLabel lblId = new JLabel("ID");
        lblId.setBounds(40, 100, 130, 30);
        lblId.setFont(new java.awt.Font("Times New Roman", 1, 20));

        JLabel lblName = new JLabel("Name");
        lblName.setBounds(40, 150, 130, 30);
        lblName.setFont(new java.awt.Font("Times New Roman", 1, 20));

        JLabel lblEmail = new JLabel("Email");
        lblEmail.setBounds(40, 200, 130, 30);
        lblEmail.setFont(new java.awt.Font("Times New Roman", 1, 20));

        JLabel lblRoll = new JLabel("Roll number");
        lblRoll.setBounds(40, 250, 130, 30);
        lblRoll.setFont(new java.awt.Font("Times New Roman", 1, 20));

        JLabel lblClass = new JLabel("Class name");
        lblClass.setBounds(40, 300, 130, 30);
        lblClass.setFont(new java.awt.Font("Times New Roman", 1, 20));

        JLabel lblStatus = new JLabel("Status");
        lblStatus.setBounds(40, 350, 130, 30);
        lblStatus.setFont(new java.awt.Font("Times New Roman", 1, 20));

        JTextField txtId = new JTextField();
        txtId.setBounds(180, 100, 180, 30);
        JTextField txtName = new JTextField();
        txtName.setBounds(180, 150, 180, 30);

        JTextField txtEmail = new JTextField();
        txtEmail.setBounds(180, 200, 180, 30);
        JTextField txtRoll = new JTextField();
        txtRoll.setBounds(180, 250, 180, 30);

        JTextField txtClass = new JTextField();
        txtClass.setBounds(180, 300, 180, 30);
        JTextField txtStatus = new JTextField();
        txtStatus.setBounds(180, 350, 180, 30);

        JButton submit = new JButton("SUBMIT");
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.decode("#3B5998"));
        submit.setBounds(80, 450, 90, 30);

        JButton reset = new JButton("RESET");
        reset.setForeground(Color.WHITE);
        reset.setBackground(Color.decode("#3B5998"));
        reset.setBounds(200, 450, 90, 30);

        
        fromLogin.add(h1);
        fromLogin.add(lblId);
        fromLogin.add(lblName);
        fromLogin.add(lblEmail);
        fromLogin.add(lblRoll);
        fromLogin.add(lblClass);
        fromLogin.add(lblStatus);
        fromLogin.add(txtId);
        fromLogin.add(txtName);
        fromLogin.add(txtEmail);
        fromLogin.add(txtRoll);
        fromLogin.add(txtClass);
        fromLogin.add(txtStatus);
        fromLogin.add(submit);
        fromLogin.add(reset);

        fromLogin.setLayout(null);
        fromLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fromLogin.setVisible(true);
    }

}
