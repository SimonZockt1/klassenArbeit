/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gesundheit2;

import javax.swing.*;
import java.awt.*;

public class GesundheitAnzeige extends JFrame {
    private JPanel panel;
    private GesundheitButton[] spielerButtons;
    private JLabel[] spielerLabels;

    public GesundheitAnzeige() {
        setTitle("Gesundheitsanzeige");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(3, 2));

        spielerLabels = new JLabel[]{
                new JLabel("Spieler 1 (Stufe 37)"),
                new JLabel("Spieler 2 (Stufe 54)")
        };

        spielerButtons = new GesundheitButton[]{
                new GesundheitButton(), new GesundheitButton(), new GesundheitButton(),
                new GesundheitButton(), new GesundheitButton(), new GesundheitButton()
        };

        for (JLabel label : spielerLabels) {
            add(label);
        }

        for (GesundheitButton button : spielerButtons) {
            add(button);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new GesundheitAnzeige();
    }
}

