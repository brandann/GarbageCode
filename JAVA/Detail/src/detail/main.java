/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package detail;

/**
 *
 * @author brandan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Detail d = new Detail();
        d.setData(d.ENTRY, 1);
        d.setData(d.COMPANY, "Brandan");
        d.setData(d.JOBNAME, "Husky");
        d.setData(d.JOBNUMBER, "5358");
        d.setData(d.SEARCHABLE, "1");
        d.setData(d.ADDEDDATE, "20140205");
        d.setData(d.DESCRIPTION, "Panel head @ Moose");
        d.setData(d.PDF, "files/666.pdf");
        d.setData(d.DWG, "files/666.dwg");
        d.setData(d.JPG, "files/666.jpg");
        d.setData(d.TAGS, "brandan, hr-36, wall, house, narhwall");

        //d.setData(d.ENTRY, 666);
        //System.out.println(d.getData(d.COMPANY));
        System.out.println(d.toString());
        
        Detail d2 = new Detail(d.toString());
        d2.setData(d2.ENTRY, "2");
        System.out.println(d2.toString());
        System.out.println(d2.getData(d.TAGS));
        
        System.out.println(d2.tagged("Brandan"));
        System.out.println(d2.tagged("brandan"));
        
    }
}
