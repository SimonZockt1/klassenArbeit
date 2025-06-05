/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gesundheit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GesundheitButton extends JButton {
    private boolean aktiv;

    public GesundheitButton() {
        setText(" ");
        setBackground(Color.WHITE);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!aktiv) {
                    setBackground(Color.GREEN);
                    setText("1");
                    aktiv = true;
                }
            }
        });
    }
}
