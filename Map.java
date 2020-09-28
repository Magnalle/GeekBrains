/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xogui;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;
    public static final int GRID_LINE_WIDTH = 3;

    public Map() {
        setBackground(new Color(0x0a, 0x4f, 0xb0)); // r g b //#0a4fb0
    }

    void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength) {
        System.out.printf("mode:%d, size:%d, win:%d\n", gameMode, fieldSizeX, winLength);
        for(Component element : this.getComponents())
        {
            element.setVisible(false);
            remove(element);
        }
        setLayout(new GridLayout(fieldSizeX, fieldSizeX, GRID_LINE_WIDTH, GRID_LINE_WIDTH));
        //setOpaque(true);
        
        for (int i = 0; i < fieldSizeX; i++) 
            {
                for (int j = 0; j < fieldSizeX; j++)
                {
                     JButton el = new JButton();
                                       
                    el.setBackground(new Color(0xff, 0xff, 0xff));      
                    el.setVisible(true);
                    el.setOpaque(true);                   
                    el.setFont(new Font("Arial", 0, 40));                   
                    el.setHorizontalAlignment(SwingConstants.CENTER);
                    el.setText("X");
                    add(el);
                    
                }

            }
        
        this.validate();
    }
}

