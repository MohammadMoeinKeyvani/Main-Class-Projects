package view;

import javax.swing.*;
import net.miginfocom.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/*
 * Created by JFormDesigner on Tue Jun 30 11:06:41 IRDT 2020
 */



/**
 * @author unknown
 */
public class EmpUI extends JFrame {
    public EmpUI() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField3 = new JTextField();
        label3 = new JLabel();
        textField4 = new JTextField();
        label4 = new JLabel();
        textField5 = new JTextField();
        label5 = new JLabel();
        textField6 = new JTextField();
        button1 = new JButton();

        //Textfield
        textField5.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() < '0' || e.getKeyChar() > '9')
                    e.setKeyChar('\0');
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        textField6.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                if (e.getKeyChar() < '0' || e.getKeyChar() > '9')
                    e.setKeyChar('\0');
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        //ActionListener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //======== this ========
        setTitle("model.entity.Employee Form");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[93,fill]" +
            "[8,fill]" +
            "[111,fill]" +
            "[fill]" +
            "[32,fill]" +
            "[27,fill]" +
            "[fill]",
            // rows
            "[]" +
            "[22]" +
            "[24]" +
            "[26]" +
            "[23]" +
            "[28]" +
            "[]"));

        //---- label1 ----
        label1.setText("Name :");
        contentPane.add(label1, "cell 0 1 2 1");
        contentPane.add(textField1, "cell 2 1");

        //---- label2 ----
        label2.setText("Family :");
        contentPane.add(label2, "cell 0 2 2 1");
        contentPane.add(textField3, "cell 2 2");

        //---- label3 ----
        label3.setText("Father Name :");
        contentPane.add(label3, "cell 0 3");
        contentPane.add(textField4, "cell 2 3");

        //---- label4 ----
        label4.setText("Phone Number :");
        contentPane.add(label4, "cell 0 4");
        contentPane.add(textField5, "cell 2 4");

        //---- label5 ----
        label5.setText("Age :");
        contentPane.add(label5, "cell 0 5");
        contentPane.add(textField6, "cell 2 5");

        //---- button1 ----
        button1.setText("Send");
        contentPane.add(button1, "cell 2 6");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField3;
    private JLabel label3;
    private JTextField textField4;
    private JLabel label4;
    private JTextField textField5;
    private JLabel label5;
    private JTextField textField6;
    private JButton button1;

    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
