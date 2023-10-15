// Source code is decompiled from a .class file using FernFlower decompiler.
package javaapplication1;

import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;
import javaapplication1.db;
import net.sf.jasperreports.engine.JasperPrintManager;

public class ReportView extends JFrame {

    public ReportView(String fileName) {
        this(fileName, (HashMap) null);
    }

    public ReportView(String fileName, HashMap para) {
        super("Report Viewer");
        db db = new db();
        Connection con = db.mycon();

        try {
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = this.getContentPane();
            c.add(viewer);
        } catch (JRException var8) {
            System.out.println(var8);
        }

        this.setBounds(2, 2, 900, 700);
        this.setDefaultCloseOperation(2);
    }

    public void print() {
      throw new UnsupportedOperationException("Not supported yet.");
    }

    void printReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
