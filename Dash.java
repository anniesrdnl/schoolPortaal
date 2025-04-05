import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dash extends JFrame{
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane4;
    private JButton handInButton;
    private JCheckBox markAsDoneCheckBox;
    private JFormattedTextField privateCommentsFormattedTextField;
    private JFormattedTextField addCommentsToBiniFormattedTextField;
    private JCheckBox markAsDoneCheckBox2;
    private JButton handInButton1;
    private JFormattedTextField privateCommentsFormattedTextField1;
    private JFormattedTextField addCommentsToMariaFormattedTextField;
    private JPanel MainPanel;
    private JComboBox comboBox1;
    private JComboBox comboBox2;

    public Dash (){
        setTitle("Dash Board");
        setSize(1500,900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(MainPanel);
        setLocationRelativeTo(null);


        handInButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(Dash.this,
                        "Handed in Successfully");



            }
        });


        handInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Dash.this,
                        "Handed in Succesfully");
            }
        });
    }

    public static void main(String[] args) {
        new Dash().setVisible(true);
    }
}
