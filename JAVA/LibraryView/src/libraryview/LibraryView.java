/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libraryview;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author brandan
 */
public class LibraryView extends JFrame{

    private final int FRAME_HEIGHT = 600;
    private final int FRAME_WIDTH = 1100;
    
    public LibraryView() throws ClassNotFoundException, IOException{
        
        Data d = new Data();
        
        setLayout(new BorderLayout());
        setSize(FRAME_WIDTH, (FRAME_HEIGHT + FRAME_HEIGHT/2) );
        setBackground(Color.WHITE);
        initComponents();

    }
    
    private void initComponents() throws ClassNotFoundException, IOException{
        
    }
    
    
}