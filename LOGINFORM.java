import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGINFORM extends JFrame {
    private JTextField userfield;
    private JPasswordField passwordField;
    private JButton SUBMITButton;
    private JPanel MAINPANEEL;
    private JCheckBox studentCheckBox;
    private JCheckBox teacherCheckBox;
    private JLabel faa;

    public LOGINFORM () {
        setTitle("STUDENT PORTAL");
        setSize(500, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(MAINPANEEL);


        SUBMITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String aa = userfield.getText();
                if (studentCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(LOGINFORM.this,
                            "Welcome Student: " + aa);
                    new Dash().setVisible(true);

                }
                if (teacherCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(LOGINFORM.this,
                            "Welcome Teacher: " + aa);
                    new teacher().setVisible(true);

                }

            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LOGINFORM().setVisible(true);
            }
        });
    }}