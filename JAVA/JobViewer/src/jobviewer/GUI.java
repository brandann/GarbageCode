/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jobviewer;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author brandan
 */
public class GUI extends JFrame {
    public GUI() {
        Install i = new Install();
        setLayout(new BorderLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setBackground(Color.WHITE);
        initComp();
    }
    
    public void initComp() {
        viewerPanel = new JPanel(new BorderLayout());
        navigatorPanel = new JPanel();
        filePanel = new JPanel();
        textPanel = new JPanel();
        
        jobComboBox = new JComboBox();
        
        optionsButton = new JButton("Options");
        newJob = new JButton("New Job");
        detailButton = new JButton("Open Details");
        elevationButton = new JButton("Open Elevations");
        workorderButton = new JButton("Open Workorder");
        timesheetButton = new JButton("Open TimeSheet Log");
        
        navigatorPanel.add(jobComboBox);
        navigatorPanel.add(newJob);
        navigatorPanel.add(timesheetButton);
        navigatorPanel.add(optionsButton);

        filePanel.add(detailButton);
        filePanel.add(elevationButton);
        filePanel.add(workorderButton);
        
        
        add(viewerPanel, BorderLayout.CENTER);
        viewerPanel.add(navigatorPanel, BorderLayout.NORTH);
        viewerPanel.add(textPanel, BorderLayout.CENTER);
        viewerPanel.add(filePanel, BorderLayout.SOUTH);
        
        
        
    }
    
    private JPanel viewerPanel;
    private JPanel navigatorPanel;
    private JPanel filePanel;
    private JPanel textPanel;
    
    private JComboBox jobComboBox;
    
    private JButton optionsButton;
    private JButton newJob;
    private JButton detailButton;
    private JButton elevationButton;
    private JButton jobfileButton;
    private JButton workorderButton;
    private JButton timesheetButton;
    
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
}
