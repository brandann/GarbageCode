/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package northshorelibrary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import static northshorelibrary.BackendGUI.directory;

/**
 *
 * @author brandan
 */
public class NewGUI extends JFrame{
    
    public NewGUI(){
        setLayout(new BorderLayout());
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setBackground(Color.WHITE);
        initComponents();
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(new Point((screenSize.width  - FRAME_WIDTH)  / 2,
                              (screenSize.height - FRAME_HEIGHT) / 2));
    }
    
    
    private void initComponents(){
        driver = new BackendDriver();
        systemLibrary = driver.readTextFile(directory + SYSTEMS);
        panelLibrary = driver.readTextFile(directory + PANELS);
        conditonsLibrary = driver.readTextFile(directory + CONDITIONS);
        miscLibrary = driver.readTextFile(directory + MISCTAGS);
        othersLibrary = driver.readTextFile(directory + OTHERS);
        customLibrary = driver.readTextFile(directory + CUSTOM);
        componentsLibrary = driver.readTextFile(directory + COMPONENTS);
        
        bottomPanel = new JPanel(new BorderLayout());
        customEntryPanel = new JPanel(new FlowLayout());
        
        pdfButton = new JButton("Load PDF File         (Note: This will MOVE your file)");
        dwgButton = new JButton("Load DWG File         (Note: This will MOVE your file)");
        jpgButton = new JButton("Load JPG File         (Note: This will MOVE your file)");
        resetButton = new JButton("Reset Entire Form");
        compileButton = new JButton("Submit Database Entry");
        searchButton = new JButton("Search Database");
        clearCheckBoxButton = new JButton("Clear CheckBox's");
        helpButton = new JButton("Help");
        
        comboPanel = new JPanel(new BorderLayout());
        textPanel = new JPanel(new GridLayout(10,1));
        buttonPanel = new JPanel(new FlowLayout());
        
        companyLabel = new JLabel("<-- Company");
        dateLabel = new JLabel("<-- Current Date");
        nameLabel = new JLabel("<-- Job Name");
        numberLabel = new JLabel("<-- Job Number");
        year = new JLabel("<-- Job Year");
        detailLabel = new JLabel("<-- Detail Number");
        
        companyTextField = new JComboBox(companies);
        nameTextField = new JTextField("",TEXT_FIELD_WIDTH);
        numberTextField = new JTextField("",TEXT_FIELD_WIDTH);
        yearTextField = new JTextField("",TEXT_FIELD_WIDTH);
        dateTextField = new JTextField(getDate(),TEXT_FIELD_WIDTH);
        pdfTextField = new JTextField("",TEXT_FIELD_WIDTH);
        dwgTextField = new JTextField("",TEXT_FIELD_WIDTH);
        jpgTextField = new JTextField("",TEXT_FIELD_WIDTH);
        detTextField = new JTextField("",TEXT_FIELD_WIDTH);
        customTextField = new JTextField("",TEXT_FIELD_WIDTH);
        
        tagComboBox = new JComboBox(tagArray);
        tagListBox = new JList();
        getSelectedButton = new JButton("Add Tag -->");
        choosePanel = new JPanel(new BorderLayout());
        choosePanel.add(tagComboBox, BorderLayout.NORTH);
        choosePanel.add(tagListBox, BorderLayout.CENTER);
        choosePanel.add(getSelectedButton, BorderLayout.SOUTH);
        
        pickedListBox = new JList();
        deleteSelectedButton = new JButton("Remove Tag");
        pickedPanel = new JPanel(new BorderLayout());
        pickedPanel.add(pickedListBox, BorderLayout.CENTER);
        pickedPanel.add(deleteSelectedButton, BorderLayout.SOUTH);
        
        comboPanel.add(choosePanel, BorderLayout.CENTER);
        comboPanel.add(pickedPanel, BorderLayout.EAST);
        
        
        scroll = new JScrollPane(comboPanel);
        scroll.setEnabled(true);
        scroll.getVerticalScrollBar().setUnitIncrement(16);

        
        
        
        textPanel.add(dateTextField);
        textPanel.add(dateLabel);
        textPanel.add(companyTextField);
        textPanel.add(companyLabel);
        textPanel.add(nameTextField);
        textPanel.add(nameLabel);
        textPanel.add(numberTextField);
        textPanel.add(numberLabel);
        textPanel.add(yearTextField);
        textPanel.add(year);
        textPanel.add(detTextField);
        textPanel.add(detailLabel);
        textPanel.add(pdfTextField);
        textPanel.add(pdfButton);
        textPanel.add(dwgTextField);
        textPanel.add(dwgButton);
        textPanel.add(jpgTextField);
        textPanel.add(jpgButton);
        
        buttonPanel.add(helpButton);
        buttonPanel.add(clearCheckBoxButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(compileButton);
        buttonPanel.add(searchButton);
        
        bottomPanel.add(customEntryPanel, BorderLayout.NORTH);
        bottomPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        add(textPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        
        add(bottomPanel, BorderLayout.SOUTH);

        dateTextField.setEnabled(false);
        
        
    }
    
    private String getDate(){
        GregorianCalendar gCal = new GregorianCalendar();
        String y = String.valueOf(gCal.get(GregorianCalendar.YEAR));
        String m = String.valueOf((gCal.get(GregorianCalendar.MONTH) + 1));
        String d = String.valueOf(gCal.get(GregorianCalendar.DAY_OF_MONTH));
        if(m.length() < 2){m = "0" + m;}
        if(d.length() < 2){d = "0" + d;}
        return y + m + d;
    }

    private final int FRAME_WIDTH = 640;
    private final int FRAME_HEIGHT = 640;
    private final int TAG_HEIGHT = 80;
    private final int FONT_LARGE = 28;
    private final int TEXT_FIELD_WIDTH = 40;
    
    private BackendDriver driver;
    private EntryItem[] matches;
    
    private final Font LARGE_FONT = new Font("",Font.BOLD,18);
    
    private String[] systemLibrary;
    private String[] panelLibrary;
    private String[] conditonsLibrary;
    private String[] miscLibrary;
    private String[] othersLibrary;
    private String[] customLibrary;
    private String[] componentsLibrary;
    private String[] companies = new String[]{"NSM","NC","Both (Lookup Only)"};
    private String[] tagArray = new String[]{"System","Panel","Components","Conditions","Misc","Others","Custom"};
    
    private JComboBox tagComboBox;
    private JComboBox companyTextField;
    
    private JTextField nameTextField;
    private JTextField numberTextField;
    private JTextField yearTextField;
    private JTextField detTextField;
    private JTextField dateTextField;
    private JTextField pdfTextField;
    private JTextField dwgTextField;
    private JTextField jpgTextField;
    private JTextField customTextField;

    private JLabel companyLabel;
    private JLabel dateLabel;
    private JLabel nameLabel;
    private JLabel numberLabel;
    private JLabel year;
    private JLabel detailLabel;
    
    private JButton pdfButton;
    private JButton dwgButton;
    private JButton jpgButton;
    private JButton resetButton;
    private JButton compileButton;
    private JButton searchButton;
    private JButton clearCheckBoxButton;
    private JButton helpButton;
    private JButton getSelectedButton;
    private JButton deleteSelectedButton;
    
    private JScrollPane scroll;
    
    private JList tagListBox;
    private JList pickedListBox;
    
    private JPanel comboPanel;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JPanel bottomPanel;
    private JPanel customEntryPanel;
    private JPanel choosePanel;
    private JPanel pickedPanel;
    
    //**** This Dir Locations ****//
    static final String directory = "C:\\Users\\Brandan\\Dropbox\\Brandan\\Programming\\Projects\\NorthshoreLibrary\\TestingLocation\\";
    static final String database = "database\\database.dat";
    static final String entry = "database\\entry.num";
    static final String uses = "database\\datau.num";
    static final String SYSTEMS = "tags\\SYSTEMS.txt";
    static final String PANELS = "tags\\PANELS.txt";
    static final String CONDITIONS = "tags\\CONDITIONS.txt";
    static final String MISCTAGS = "tags\\MISCTAGS.txt";
    static final String OTHERS = "tags\\OTHERSSYSTEMS.txt";
    static final String CUSTOM = "tags\\CUSTOM.txt";
    static final String COMPONENTS = "tags\\COMPONENTS.txt";

    //**** Hard Locations ****//
    //static final String directory = "P:\\Northshore Time Sheet\\Tools\\LIBRARY\\";
    //static final String database = "P:\\Northshore Time Sheet\\Tools\\LIBRARY\\database.dat";
    //static final String entry = "P:\\Northshore Time Sheet\\Tools\\LIBRARY\\entry.num";
    //static final String uses = "P:\\Northshore Time Sheet\\Tools\\LIBRARY\\datau.num";
}
