
package view;

import javax.swing.*;

import controller.Controller;
import net.miginfocom.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author mohammad
 */
public class UpdateInfo extends JFrame {
    public UpdateInfo() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label5 = new JLabel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        label3 = new JLabel();
        textField3 = new JTextField();
        button1 = new JButton();

        textField3.addKeyListener(new KeyListener() {
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



        //Button Action listener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    Controller controller = new Controller();
                    controller.update(textField1.getText() , textField2.getText() , textField3.getText());
                    JOptionPane.showMessageDialog( null,"Update Successful" );
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        //======== this ========
        setTitle("Sign Up");
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[24,fill]" +
                        "[83,fill]" +
                        "[47:152,fill]" +
                        "[61,fill]",
                // rows
                "[44]" +
                        "[44]" +
                        "[37]" +
                        "[49]" +
                        "[38]" +
                        "[50]"));

        //---- label5 ----
        label5.setText("Update Info ");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 7f));
        contentPane.add(label5, "cell 1 0");

        //---- label1 ----
        label1.setText("Name :");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(textField1, "cell 2 1");

        //---- label2 ----
        label2.setText("Pass Word :");
        contentPane.add(label2, "cell 1 2");
        contentPane.add(textField2, "cell 2 2");

        //---- label3 ----
        label3.setText("Age :");
        contentPane.add(label3, "cell 1 3");
        contentPane.add(textField3, "cell 2 3");

        //---- button1 ----
        button1.setText("Update");
        contentPane.add(button1, "cell 2 5");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - mohammad
    private JLabel label5;
    private JLabel label1;
    private JTextField textField1;
    private JLabel label2;
    private JTextField textField2;
    private JLabel label3;
    private JTextField textField3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
