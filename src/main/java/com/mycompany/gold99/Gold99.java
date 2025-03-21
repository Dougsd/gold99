package com.mycompany.gold99;
import javax.swing.*;

public class Gold99 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("GOLD");
            Interface inter = new Interface();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setContentPane(inter);
            frame.pack();
            frame.setVisible(true);
        });      
    }
}
