/*
 * BackendGUI.java
 */
package northshorelibrary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author brandan
 */
public class BackendGUI extends JFrame {
    private static boolean backend = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(
                    BackendGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(
                    BackendGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(
                    BackendGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(
                    BackendGUI.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        if(args.length > 0){
            if(args[0].equalsIgnoreCase("cmd")){
                backend = true;
            }
        }
        JFrame frame = new NewGUI();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Northshore Library BETA");
        frame.setMaximumSize(null); 
    }
    
    public BackendGUI(boolean backend){
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
        
        systemCheckBox = new JCheckBox[systemLibrary.length];
        panelCheckBox = new JCheckBox[panelLibrary.length];
        conditionsCheckBox = new JCheckBox[conditonsLibrary.length];
        miscCheckBox = new JCheckBox[miscLibrary.length];
        othersCheckBox = new JCheckBox[othersLibrary.length];
        customCheckBox = new JCheckBox[customLibrary.length];
        componentsCheckBox = new JCheckBox[componentsLibrary.length];
        
        systemPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
        panelPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
        conditionsPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
        miscPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
        othersPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
        customPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
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
        
        comboPanel = new JPanel(new FlowLayout());
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
        
        systemLabel = new JLabel("System");
        componentsLabel = new JLabel("Components");
        panelLabel = new JLabel("Panels");
        conditionLabel = new JLabel("Conditons");
        miscLabel = new JLabel("Misc");
        othersLabel = new JLabel("Others Systems");
        customLabel = new JLabel("Custom Tags");
        customTextLabel = new JLabel("Enter Custom Tags (Use \",\" to seperate items): ");
        
        systemLabel.setFont(LARGE_FONT);
        componentsLabel.setFont(LARGE_FONT);
        panelLabel.setFont(LARGE_FONT);
        conditionLabel.setFont(LARGE_FONT);
        miscLabel.setFont(LARGE_FONT);
        othersLabel.setFont(LARGE_FONT);
        customLabel.setFont(LARGE_FONT);
        
        systemPanel.add(systemLabel);
        for(int i = 0; i < systemLibrary.length; i++)
        {
            systemCheckBox[i] = new JCheckBox(systemLibrary[i]);
            systemPanel.add(systemCheckBox[i]);
        }
        systemPanel.add(componentsLabel);
        for(int i = 0; i < componentsLibrary.length; i++)
        {
            componentsCheckBox[i] = new JCheckBox(componentsLibrary[i]);
            systemPanel.add(componentsCheckBox[i]);
        }
        panelPanel.add(panelLabel);
        for(int i = 0; i < panelLibrary.length; i++)
        {
            panelCheckBox[i] = new JCheckBox(panelLibrary[i]);
            panelPanel.add(panelCheckBox[i]);
        }
        conditionsPanel.add(conditionLabel);
        for(int i = 0; i < conditonsLibrary.length; i++)
        {
            conditionsCheckBox[i] = new JCheckBox(conditonsLibrary[i]);
            conditionsPanel.add(conditionsCheckBox[i]);
        }
        miscPanel.add(miscLabel);
        for(int i = 0; i < miscLibrary.length; i++)
        {
            miscCheckBox[i] = new JCheckBox(miscLibrary[i]);
            miscPanel.add(miscCheckBox[i]);
        }
        miscPanel.add(othersLabel);
        for(int i = 0; i < othersLibrary.length; i++)
        {
            othersCheckBox[i] = new JCheckBox(othersLibrary[i]);
            miscPanel.add(othersCheckBox[i]);
        }
        customPanel.add(customLabel);
        for(int i = 0; i < customLibrary.length; i++)
        {
            customCheckBox[i] = new JCheckBox(customLibrary[i]);
            customPanel.add(customCheckBox[i]);
        }
        
        customEntryPanel.add(customTextLabel);
        customEntryPanel.add(customTextField);
        
        comboPanel.add(systemPanel);
        comboPanel.add(panelPanel);
        comboPanel.add(conditionsPanel);
        comboPanel.add(miscPanel);
        comboPanel.add(customPanel);
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
        

        if(backend){
            searchButton.setEnabled(false);
            companyTextField.removeItemAt(2);
        }
        else{
            pdfTextField.setEnabled(false);
            pdfButton.setEnabled(false);
            dwgTextField.setEnabled(false);
            dwgButton.setEnabled(false);
            jpgTextField.setEnabled(false);
            jpgButton.setEnabled(false);
            compileButton.setEnabled(false);
        }
        
        pdfButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(null) 
                        == JFileChooser.APPROVE_OPTION)
                {
                    pdfTextField.setText(chooser.getSelectedFile().getPath());
                }
        }});
        
        dwgButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(null) 
                        == JFileChooser.APPROVE_OPTION)
                {
                    dwgTextField.setText(chooser.getSelectedFile().getPath());
                }
        }});
        
        jpgButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFileChooser chooser = new JFileChooser();
                if (chooser.showOpenDialog(null) 
                        == JFileChooser.APPROVE_OPTION)
                {
                    jpgTextField.setText(chooser.getSelectedFile().getPath());
                }
        }});
        
        clearCheckBoxButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearCheckBox();
        }});
        
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetForm();
        }});
        
        compileButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    compile();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(BackendGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        }});
        
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                Help h = new Help();
        }});
        
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    search();
                } catch (IOException ex) {
                    Logger.getLogger(BackendGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
        }});
    }
    
    private void search() throws IOException{
        Random rand = new Random();
        String randomFileName = "a7x" + rand.nextInt() + ".html";
        String randomFilePath = directory + "temp\\" + randomFileName;
        System.out.println(randomFilePath);
        
        //Executes a file
        Desktop d = Desktop.getDesktop();
        d.open(new File(directory + "temp\\Search.html"));
        
    }
    
    private void resetForm(){
        companyTextField.setSelectedIndex(0);
        nameTextField.setText("");
        numberTextField.setText("");
        yearTextField.setText("");
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
    
    private void clearCheckBox(){
        for(JCheckBox t : systemCheckBox){
                t.setSelected(false);
        }
        for(JCheckBox t : panelCheckBox){
                t.setSelected(false);
        }
        for(JCheckBox t : conditionsCheckBox){
                t.setSelected(false);
        }
        for(JCheckBox t : miscCheckBox){
                t.setSelected(false);
        }
        for(JCheckBox t : othersCheckBox){
                t.setSelected(false);
        }
        for(JCheckBox t : customCheckBox){
                t.setSelected(false);
        }
    }
    
    private void resetEntry(){
        dateTextField.setText(getDate());
        detTextField.setText("");
        pdfTextField.setText("");
        dwgTextField.setText("");
        jpgTextField.setText("");
        customTextField.setText("");
        customPanel.revalidate();
    }
    
    private void compile() throws FileNotFoundException{
        EntryItem i = new EntryItem();
        i.setAddedDate(dateTextField.getText().toUpperCase());
        i.setCompany(String.valueOf(companyTextField.getSelectedItem()));
        i.setJobName(nameTextField.getText().toUpperCase());
        i.setJobNumber(numberTextField.getText().toUpperCase());
        i.setJobYear(yearTextField.getText());
        i.setDetailNum(detTextField.getText().toUpperCase());
        try{
            i.setPDF(driver.moveFile(pdfTextField.getText(),directory + i.getEntry() + ".pdf"));
        }
        catch(Exception e){e.printStackTrace();}
        try{
            i.setDWG(driver.moveFile(dwgTextField.getText(),directory + i.getEntry() + ".dwg"));
        }
        catch(Exception e){e.printStackTrace();}
        try{
            i.setJPG(driver.moveFile(jpgTextField.getText(),directory + i.getEntry() + ".jpg"));
        }
        catch(Exception e){e.printStackTrace();}
        i.setTags(getTags().toUpperCase());
        driver.addItem(i);
        if(!customTextField.getText().equalsIgnoreCase("")){
            addTags(customTextField.getText());
        }
        clearCheckBox();
        resetEntry();
    }
    
    private void addTags(String s){
        s = s.trim();
        s = s.toUpperCase();
        String[] in = s.split(",");
        for(int i = 0; i < in.length; i++){
            in[i] = in[i].trim();
        }
        
        customPanel.removeAll();
        driver.appendTextFile(directory + CUSTOM, in);
        customLibrary = driver.readTextFile(directory + CUSTOM);
        customCheckBox = new JCheckBox[customLibrary.length];
        
        customPanel = new JPanel(new GridLayout(TAG_HEIGHT,1));
        customPanel.add(customLabel);
        for(int i = 0; i < customLibrary.length; i++)
        {
            customCheckBox[i] = new JCheckBox(customLibrary[i]);
            customPanel.add(customCheckBox[i]);
        }
        comboPanel.add(customPanel);
    }
    
    private void find(){
        
    }
    
    private String getTags(){
        String choiceTags = "";
        for(JCheckBox t : systemCheckBox){
            if(t.isSelected())
                choiceTags = choiceTags + t.getText() + ">>";
        }
        for(JCheckBox t : panelCheckBox){
            if(t.isSelected())
                choiceTags = choiceTags + t.getText() + ">>";
        }
        for(JCheckBox t : conditionsCheckBox){
            if(t.isSelected())
                choiceTags = choiceTags + t.getText() + ">>";
        }
        for(JCheckBox t : miscCheckBox){
            if(t.isSelected())
                choiceTags = choiceTags + t.getText() + ">>";
        }
        for(JCheckBox t : othersCheckBox){
            if(t.isSelected())
                choiceTags = choiceTags + t.getText() + ">>";
        }
        for(JCheckBox t : customCheckBox){
            if(t.isSelected())
                choiceTags = choiceTags + t.getText() + ">>";
        }
        if(!customTextField.getText().equalsIgnoreCase("")){
            String[] cTag = customTextField.getText().split(",");
            for(String t : cTag){
                t = t.trim();
                if(!t.equalsIgnoreCase(""))
                    choiceTags = choiceTags + t + ">>";
            }
        }
        
        return choiceTags;
    }
	
    private final int FRAME_WIDTH = 640;
    private final int FRAME_HEIGHT = 700;
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
    
    private JCheckBox[] systemCheckBox;
    private JCheckBox[] panelCheckBox;
    private JCheckBox[] conditionsCheckBox;
    private JCheckBox[] miscCheckBox;
    private JCheckBox[] othersCheckBox;
    private JCheckBox[] customCheckBox;
    private JCheckBox[] componentsCheckBox;

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
    private JLabel systemLabel;
    private JLabel panelLabel;
    private JLabel conditionLabel;
    private JLabel miscLabel;
    private JLabel othersLabel;
    private JLabel customLabel;
    private JLabel componentsLabel;
    private JLabel customTextLabel;
    
    private JButton pdfButton;
    private JButton dwgButton;
    private JButton jpgButton;
    private JButton resetButton;
    private JButton compileButton;
    private JButton searchButton;
    private JButton clearCheckBoxButton;
    private JButton helpButton;
    
    private JScrollPane scroll;
    
    private JPanel comboPanel;
    private JPanel systemPanel;
    private JPanel panelPanel;
    private JPanel conditionsPanel;
    private JPanel miscPanel;
    private JPanel othersPanel;
    private JPanel customPanel;
    private JPanel textPanel;
    private JPanel buttonPanel;
    private JPanel bottomPanel;
    private JPanel customEntryPanel;
    
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
