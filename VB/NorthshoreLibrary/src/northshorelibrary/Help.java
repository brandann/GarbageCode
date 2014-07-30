/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package northshorelibrary;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author brandan
 */
public class Help extends JFrame {
    public Help(){
        setVisible(true);
        setLayout( new BorderLayout() );
        setTitle("Help");
        setResizable(false);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(new Point((screenSize.width  - FRAME_WIDTH)  / 2,
                              (screenSize.height - FRAME_HEIGHT) / 2));
        text = new JTextArea();
        text.setLineWrap(true);
        scroll = new JScrollPane(text);
        text.setText("Builder:\n\n"+
                "This program will create a new database entry based on all the text fields, check box's, and custom entrys entered.\n\n"
                + "To use (All text auto capitalizes):\n"
                + "Company: Select a company from the drop down list, only NSM (Northshore) and NC (Northclad) are available during building\n\n"
                + "Job Name: Please enter the job name exactly like it is found in the jobfile (Leave out the Job Number)\n\n"
                + "Job Number: for NC jobs, make sure to add the NC before the number.\n\n"
                + "Job Year: Enter in the year as accurate as you can of when this job is relevent, if the job is a closed job, enter the Job Year as the year the job closed.\n\n"
                + "Detail Number: Leave Blank for standards or Detail-Number-Less drawings.\n\n"
                + "PDF File: Choese a single paged PDF file to link with this entry, try to use file only from DWF, as it makes a cleaner PDF if wipeouts are used. Note: THIS WILL DELETE THE FILE IN THE CHOOSEN DIRECTORY AND MOVE IT TO THE DATABSE, AT THIS POINT YOU WILL NOT BE ABLE TO ACCESS THE FILE ANYMORE.\n\n"
                + "DWG File: Choose a single drawings Autocad File to link with this entry, i use WBlocks for this. Note: THIS WILL DELETE THE FILE IN THE CHOOSEN DIRECTORY AND MOVE IT TO THE DATABSE, AT THIS POINT YOU WILL NOT BE ABLE TO ACCESS THE FILE ANYMORE.\n\n"
                + "JPG File: Choose a picture File to link with this entry, i convert the pdf to a .jpg, it is really fast. Make sure you do not have Black marks from wipeouts, JPG files mare seem redundent, but they are a key component to viewing search results in the future. Note: THIS WILL DELETE THE FILE IN THE CHOOSEN DIRECTORY AND MOVE IT TO THE DATABSE, AT THIS POINT YOU WILL NOT BE ABLE TO ACCESS THE FILE ANYMORE.\n\n"
                + "Check Box's: Choose as many check boxes as you need to accuratly catalog your detail.\n\n"
                + "Custom tags: enter in any custom tags you have that do not appear on the list, please make sure to doulbe check the list and make sure that your tag does not already exist in some other form, Seperate the tags with commas.\n\n"
                + "\n\n"
                + "Thanks for Using this program and make sure to e-mail any bugs you find\n\n"
                + "also if you have any ideas to make this program better please let me know, the more input i get, the better the program can work for everyone\n\n"
                + "Brandan Haertel ~ brandan@northshoresheetmetal.com");
        
        add(scroll, BorderLayout.CENTER);
    }
    
    private final int FRAME_WIDTH = 600;
    private final int FRAME_HEIGHT = 600;
    
    private JTextArea text;
    private JScrollPane scroll;
}
