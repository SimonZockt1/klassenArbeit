/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gesundheit2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author heinicke.antje
 */
public class GesundheitAnzeige extends JFrame implements ActionListener{
    JPanel mainPanel=new JPanel(new GridLayout(2,5));
    GesundheitButton button1=new GesundheitButton();
    
    public GesundheitAnzeige(String name){
        this.setTitle(name);
        this.mainPanel.add(this.button1);
        this.add(this.mainPanel);        
        this.button1.addActionListener(this);   
        
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.button1.setButtonGreen();
    }
    
}
