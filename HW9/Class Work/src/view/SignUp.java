/*
 * Created by JFormDesigner on Sat Jul 04 14:23:38 IRDT 2020
 */

package view;

import javax.swing.*;

import model.entity.UserEntity;
import model.service.UserService;
import net.miginfocom.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mohammad
 */
public class SignUp extends JFrame {
    public SignUp() {
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
        label4 = new JLabel();
        textField4 = new JTextField();
        button1 = new JButton();



        //Button Action listener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    UserService.getInstance().save(new UserEntity().setName(textField1.getText()).setUserName(textField2.getText()).setPassWord(textField3.getText()).setEmail(textField4.getText()));
                    dispose();
                    Login l = new Login();
                    l.setVisible(true);
                    l.setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        label5.setText("Sing Up ");
        label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 7f));
        contentPane.add(label5, "cell 1 0");

        //---- label1 ----
        label1.setText("Name :");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(textField1, "cell 2 1");

        //---- label2 ----
        label2.setText("User Name :");
        contentPane.add(label2, "cell 1 2");
        contentPane.add(textField2, "cell 2 2");

        //---- label3 ----
        label3.setText("Pass Word :");
        contentPane.add(label3, "cell 1 3");
        contentPane.add(textField3, "cell 2 3");

        //---- label4 ----
        label4.setText("Email :");
        contentPane.add(label4, "cell 1 4");
        contentPane.add(textField4, "cell 2 4");

        //---- button1 ----
        button1.setText("Sign up");
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
    private JLabel label4;
    private JTextField textField4;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
