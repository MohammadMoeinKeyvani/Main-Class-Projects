
package view;

import javax.swing.*;

import controller.UserController;
import model.entity.UserEntity;
import model.service.UserService;
import net.miginfocom.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author mohammad
 */
public class Login extends JFrame {
    public Login() {
        initComponents();
    }

//    private void buttonActionPerformed (java.awt.event.ActionEvent event)
//    {
//        UserController uc = new UserController();
//        String uname="",pword="";
//        uname = textField2.getText();
//        pword = textField2.getText();
//        if (uc.searchUserName(uname) && uc.searchPassWord(pword))
//        {
//            JOptionPane.showMessageDialog( this,"Login Successful" );
//        }
//        else
//            JOptionPane.showMessageDialog(this,"Login Failed");
//    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - mohammad
        label5 = new JLabel();
        label1 = new JLabel();
        textField1 = new JTextField();
        label2 = new JLabel();
        textField2 = new JTextField();
        button1 = new JButton();




        //Button Action listener
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                UserController uc = new UserController();
                String uname="",pword="";
                uname = textField2.getText();
                pword = textField2.getText();
                if (uc.searchUserName(uname) && uc.searchPassWord(pword))
                {
                JOptionPane.showMessageDialog( null,"Login Successful" );
                }
                else
                JOptionPane.showMessageDialog(null,"Login Failed");
            }
        });


        //======== this ========
        setTitle("Login");
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
        label1.setText("User Name :");
        contentPane.add(label1, "cell 1 1");
        contentPane.add(textField1, "cell 2 1");

        //---- label2 ----
        label2.setText("Pass Word :");
        contentPane.add(label2, "cell 1 2");
        contentPane.add(textField2, "cell 2 2");

        //---- button1 ----
        button1.setText("Login");
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
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
