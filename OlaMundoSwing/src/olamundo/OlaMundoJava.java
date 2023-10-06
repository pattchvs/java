package olamundo;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoJava extends JFrame{
    private JPanel painelMain;
    private JTextField txtName;
    private JLabel textLabel;
    private JButton btnClick;

    public OlaMundoJava() {
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick,txtName.getText()+" Hello");
            }
        });
    }
    public static void main(String[] args) {
        OlaMundoJava h=new OlaMundoJava();
        h.setContentPane(h.painelMain);
        h.setTitle("Hello");
        h.setBounds(600, 200, 200, 200);
//        h.setSize(300, 400);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


