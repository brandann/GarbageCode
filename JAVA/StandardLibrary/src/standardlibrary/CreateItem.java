/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author brandan
 */
public class CreateItem extends JFrame{
    
    public CreateItem() throws ClassNotFoundException
    {
        EntryNumber entry = new EntryNumber();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setVisible(true);
        setLayout(new BorderLayout());
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(new Point((screenSize.width  - FRAME_WIDTH)  / 2,
                              (screenSize.height - FRAME_HEIGHT) / 2));
        
        fieldPanel = new JPanel();
        tagPanel = new JPanel();
        scrollPane = new JScrollPane(tagArea);
        
        comboItems = new JComboBox();
        dwgButton = new JButton("Load DWG File");
        jpgButton = new JButton("Load JPG File");
        pdfButton = new JButton("Load PDF File");
        okButton = new JButton("Done");
        dwgField = new JTextField();
        pdfField = new JTextField();
        jpgField = new JTextField();
        entryNumberField = new JTextField(String.valueOf(entry.getEntryNumber()));
        jobNameField = new JTextField();
        jobNumberField = new JTextField();
        yearField = new JTextField();
        tagArea = new JTextArea();

        dwgField.setEditable(false);
        pdfField.setEditable(false);
        jpgField.setEditable(false);
        entryNumberField.setEditable(false);
        
        fieldPanel.setLayout(new GridLayout(8,2));
        fieldPanel.add(dwgField);
        fieldPanel.add(dwgButton);
        fieldPanel.add(pdfField);
        fieldPanel.add(pdfButton);
        fieldPanel.add(jpgField);
        fieldPanel.add(jpgButton);
        fieldPanel.add(entryNumberField);
        fieldPanel.add(new JLabel("Entry Number"));
        fieldPanel.add(jobNameField);
        fieldPanel.add(new JLabel("Job Name"));
        fieldPanel.add(jobNumberField);
        fieldPanel.add(new JLabel("Job Number"));
        fieldPanel.add(yearField);
        fieldPanel.add(new JLabel("Year"));

        add(fieldPanel, BorderLayout.NORTH);
        add(tagArea, BorderLayout.CENTER);
        add(okButton, BorderLayout.SOUTH);
        
        
    }
    
    
    private JComboBox comboItems;
    private JPanel fieldPanel;
    private JPanel tagPanel;
    private JButton dwgButton;
    private JButton jpgButton;
    private JButton pdfButton;
    private JButton okButton;
    private JTextField dwgField;
    private JTextField pdfField;
    private JTextField jpgField;
    private JTextField yearField;
    private JTextField jobNameField;
    private JTextField jobNumberField;
    private JTextField entryNumberField;
    private JTextArea tagArea;
    private JScrollPane scrollPane;
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 500;
}
