import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teacher extends JFrame {
    private JPanel Mianpanel;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton viewButton;
    private JButton viewButton1;

    public teacher (){
        setTitle("nice");
        setSize(1500,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(Mianpanel);

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new work().setVisible(true);
            }
        });


        viewButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new work().setVisible(true);
            }
        });
    }
}
