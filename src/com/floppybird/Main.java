package com.floppybird;

import javax.swing.*;
import java.awt.*;

/**
 * Created by igor on 05.05.2015.
 */
public class Main extends JFrame {

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Floppy Bird");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Floppy-Bird");
        frame.getContentPane().add(label);

        //Display the window.
        //frame.pack();
        frame.setSize(new Dimension(640,480));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
