import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lx9_6 extends JFrame implements ActionListener {
  JLabel jl1, jl2, jl3;
  int n = 0;
  JPasswordField jp1, jp2;
  JButton jb1, jb2;
  JPanel p;

  //JFrame f;
  public Lx9_6() {
    super("Lx9_6��ʾ");
    //Container c=getContentPane();
    jl1 = new JLabel("<html><h3>�������������룺", JLabel.CENTER);
    jl2 = new JLabel("���������룡");
    jl3 = new JLabel("���������������", JLabel.LEFT);
    jp1 = new JPasswordField(8);
    p = new JPanel();
    jb1 = new JButton("<html><h3>�ύ");
    jb1.setActionCommand("tijiao");
    jb2 = new JButton("<html><h3>ȡ��");
    jb2.setActionCommand("quxiao");
    p.setBorder(BorderFactory.createTitledBorder("��������"));
    p.setLayout(new GridLayout(2, 2));
    p.add(jl1);
    p.add(jp1);
    p.add(jb1);
    p.add(jb2);
    jb1.addActionListener(this);
    jb2.addActionListener(this);
    //f.add(p);
    getContentPane().add(p, BorderLayout.NORTH);
    getContentPane().add(jl2, BorderLayout.CENTER);
    getContentPane().add(jl3, BorderLayout.WEST);

  }

  public void actionPerformed(ActionEvent e) {

    if (e.getActionCommand().equals("tijiao")) {
      n++;
      System.out.print(n);
    }

    if (e.getSource() == jb1)
      if (jp1.getPassword().length > 0)
        if (String.valueOf(jp1.getPassword()).equals("123456")) {
          jl2.setText("��������ɹ���");
          n--;
        } else {
          jl2.setText("�������벻�ԣ����������룡");
          jp1.setText("");
        }
      else
        jl2.setText("���벻��Ϊ�գ�");
    jp1.setText("");
    ;
    if (e.getSource() == jb2) {
      jp1.setText("");

      jl2.setText("�����룡");
    }
    jl3.setText("��" + n + "�����룡");
    if (n > 3)
      System.exit(0);
  }

  public static void main(String a[]) {
    Lx9_6 f = new Lx9_6();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(400, 200);
    f.setVisible(true);
  }
}
