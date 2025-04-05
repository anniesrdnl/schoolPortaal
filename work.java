import javax.swing.*;

public class work extends JFrame{
    private JTabbedPane tabbedPane1;
    private JComboBox comboBox1;
    private JButton returnButton;
    private JCheckBox allStudentsCheckBox;
    private JComboBox comboBox2;
    private JCheckBox annieSardiniolaCheckBox;
    private JCheckBox louisMiguelCaballeroCheckBox;
    private JCheckBox faithCortezCheckBox;
    private JRadioButton acceptingSubmissionsRadioButton;
    private JComboBox comboBox3;
    private JFormattedTextField addClassCommentFormattedTextField;
    private JPanel mainnpanel;
    private JFormattedTextField addClassCommentFormattedTextField1;

    public work (){
        setTitle("Class Work");
        setSize(1500, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(mainnpanel);
    }
}
