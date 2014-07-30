/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author brandan
 */
public class DisplayResults extends JFrame {

    /**
     * @param args the command line arguments
     */

    
    public DisplayResults(LibraryItem[] array)
    {
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
        String picPath = "C:\\Users\\brandan.NSSM\\Desktop\\Brandan Job File\\10-26-2012 Huskey Stadium Shops\\For Submittal\\HuskyDetails(2-14-2013)_Page_01.jpg";
        ImageIcon icon = new ImageIcon(picPath);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(IMG_WIDTH, IMG_HEIGHT, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        JLabel image = new JLabel(icon);

        setLayout(new BorderLayout());
        add(image, BorderLayout.CENTER);
        
        buttonPanel = new JPanel();
        nextButton = new JButton("Next");
        previousButton = new JButton("Previous");
        saveButton = new JButton("Save");
        
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(previousButton);
        buttonPanel.add(saveButton);
        buttonPanel.add(nextButton);
        
        add(buttonPanel, BorderLayout.SOUTH);
        
        openPanel = new JPanel();
        DWGButton = new JButton("Open DWG File");
        PDFButton = new JButton("Open PDF File");
        
        openPanel.add(DWGButton);
        openPanel.add(PDFButton);
        
        add(openPanel, BorderLayout.NORTH);
    }


    private JPanel buttonPanel;
    private JPanel openPanel;
    private JButton nextButton;
    private JButton previousButton;
    private JButton saveButton;
    private JButton DWGButton;
    private JButton PDFButton;
    
    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 1000;
    private final int IMG_WIDTH = 680;
    private final int IMG_HEIGHT = 880;
}
