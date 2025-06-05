/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gesundheit2;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author heinicke.antje
 */
public class GesundheitButton extends JButton{    
    
    public GesundheitButton(){
        super("");
        this.setBackground(Color.white);
    }
    
    public void setButtonGreen(){
        this.setBackground(Color.green);
        this.setText("1");
    }
}
