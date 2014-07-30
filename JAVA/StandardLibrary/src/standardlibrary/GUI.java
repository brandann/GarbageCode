/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package standardlibrary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author brandan
 */
public class GUI extends JFrame{
    public GUI()
    {
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Standard Library Search");
        
        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=
                    javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(
                            installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StandardLibrary.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StandardLibrary.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StandardLibrary.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StandardLibrary.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        intComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(new Point((screenSize.width  - FRAME_WIDTH)  / 2,
                              (screenSize.height - FRAME_HEIGHT) / 2));
        
        
        add(comboPanel, BorderLayout.NORTH);
        add(tagPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    private void intComponents()
    {
        driver = new LibraryDriver();
    searchButton = new JButton("Search");
    resetButton = new JButton("Reset");
    createButton = new JButton("Create Library Item");
    comboPanel = new JPanel();
    tagPanel = new JPanel();
    buttonPanel = new JPanel();
    systemComboBox = new JComboBox(driver.getItemList());
    //panelsComboBox = new JComboBox(getArray(panelFilePath));
    //conditionsComboBox = new JComboBox(getArray(conditionFilePath));
    //otherSystemsComboBox = new JComboBox(getArray(otherSystemFilePath));
    //otherTagsComboBox = new JComboBox(getArray(otherTagFilePath));
    searchButton.setEnabled(false);
    tagListArea = new JTextArea();
    advSearch = new JTextField();

    //Combo Panels!
    comboPanel.setLayout(new GridLayout(3,2));
    comboPanel.add(systemComboBox);
    //comboPanel.add(panelsComboBox);
    //comboPanel.add(conditionsComboBox);
    //comboPanel.add(otherSystemsComboBox);
    //comboPanel.add(otherTagsComboBox);
    comboPanel.add(advSearch);
    advSearch.setToolTipText("Search by job number, or name");
    
    //Tag List Area
    scrollPane = new JScrollPane(tagListArea);
    tagListArea.setEditable(false);
    tagListArea.setToolTipText("Your search tags will gather here");
    tagPanel.setLayout(new BorderLayout());
    tagPanel.add(scrollPane, BorderLayout.CENTER);
    
    //Button Panels
    resetButton.setToolTipText("Reset the form");
    searchButton.setToolTipText("Search for Matching Details");
    buttonPanel.setLayout(new FlowLayout());
    buttonPanel.add(createButton);
    buttonPanel.add(resetButton);
    buttonPanel.add(searchButton);
    
    advSearch.addActionListener(new java.awt.event.ActionListener(){
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                if(tagListArea.getText().isEmpty())
                    {
                        tagListArea.setText(advSearch.getText().toUpperCase());
                        searchButton.setEnabled(true);
                    }
                else
                    {
                        tagListArea.setText(tagListArea.getText() 
                                + "\n" + advSearch.getText().toUpperCase());
                    }
                advSearch.setText("");
        }
    });

    createButton.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            try {
                CreateItem item = new CreateItem();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
    
    
    searchButton.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            try {
                /*JFileChooser chooser = new JFileChooser();
                if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
                {
                    String mySelectedFile 
                            = chooser.getSelectedFile().toString();
                    //if(!(mySelectedFile.contains(".html")))
                    //
                        mySelectedFile = mySelectedFile + ".html";
                    //}
                    File selectedFile = new File(mySelectedFile);
                    LibraryDriver ld 
                            = new LibraryDriver(selectedFile,getTagArray());
                    chooser.getSelectedFile().delete();
                    resetForm();
                    
                }*/
                
                DisplayResults display = new DisplayResults(driver.searchLibrary(getTagArray()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StandardLibrary.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(StandardLibrary.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    });
    
        resetButton.addActionListener(new java.awt.event.ActionListener(){
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetForm();
        }
    });
        
        
        
    class changeStatusListener implements ActionListener
        {
            /**
             * sets the background when a button is clicked
             * @param event the triggering event object
             */
                        @Override 
            public void actionPerformed(ActionEvent event)
            {
                JComboBox selected = (JComboBox) event.getSource();
                String selectedTag = String.valueOf(selected.getSelectedItem());
                if(selectedTag.contains("*")) {}
                else
                {
                    if(tagListArea.getText().isEmpty())
                    {
                        tagListArea.setText(selectedTag);
                        searchButton.setEnabled(true);
                    }
                    else
                    {
                        tagListArea.setText(tagListArea.getText() 
                                + "\n" + selectedTag);
                    }
                }
                systemComboBox.setSelectedIndex(0);
                //panelsComboBox.setSelectedIndex(0);
                //conditionsComboBox.setSelectedIndex(0);
                //otherSystemsComboBox.setSelectedIndex(0);
                //otherTagsComboBox.setSelectedIndex(0);
            }
        }
    systemComboBox.addActionListener(new changeStatusListener());
    //panelsComboBox.addActionListener(new changeStatusListener());
    //conditionsComboBox.addActionListener(new changeStatusListener());
    //otherSystemsComboBox.addActionListener(new changeStatusListener());
    //otherTagsComboBox.addActionListener(new changeStatusListener());
    
    }
    
    private void resetForm()
    {
        tagListArea.setText("");
        searchButton.setEnabled(false);
    }
    private String[] getTagArray()
    {
        String[] temp = new String[tagListArea.getRows()];
        temp = tagListArea.getText().split("\n");
        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = "+" + temp[i];
            //System.out.println(temp[i]);
        }
        return temp;
    }
    
        LibraryDriver driver;
    
    private String[] results;

    private JButton searchButton;
    private JButton resetButton;
    private JButton createButton;
    
    private JTextField advSearch;
    
    private JPanel comboPanel;
    private JPanel tagPanel;
    private JPanel buttonPanel;
    
    private JComboBox systemComboBox;
    private JComboBox panelsComboBox;
    private JComboBox conditionsComboBox;
    private JComboBox otherSystemsComboBox;
    private JComboBox otherTagsComboBox;
    
    private JTextArea tagListArea;
    private JScrollPane scrollPane;
    
    boolean first = true;
    
    private final int FRAME_HEIGHT = 300;
    private final int FRAME_WIDTH = 400;
}
