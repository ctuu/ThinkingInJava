import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Login extends JFrame {
  public static void run(final JFrame f,final int width, final int height) {
    System.out.println(width);
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        f.setTitle(f.getClass().getSimpleName());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(width, height);
        f.setVisible(true);
      }
    });
  }
  private JLabel
    l1 = new JLabel("name",JLabel.CENTER),
    l2 = new JLabel("passwd",JLabel.CENTER),
    l3 = new JLabel("result");
  private JTextField
    tf1 = new JTextField(10);
  private JPasswordField
    pf1 = new JPasswordField(10);
  private JButton
    bt1 = new JButton("submit"),
    bt2 = new JButton("cancel");
  
  private ActionListener sub = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      if(String.valueOf(pf1.getPassword()).equals("123456"))
          l3.setText("successful");
      else
        l3.setText("Login failed");
    }
  };
  private ActionListener cancl = new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      pf1.setText("");
      tf1.setText("");
    }
  };
  public Login() {
    setLayout(new GridLayout(4,2));
    add(l1);
    add(tf1);
    add(l2);
    add(pf1);
    bt1.addActionListener(sub);
    bt2.addActionListener(cancl);
    add(bt1);
    add(bt2);
    add(l3);
  }
  public static void main(String[] args) {
    run(new Login(), 300, 200);
  }
}