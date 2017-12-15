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
    super("Lx9_6演示");
    //Container c=getContentPane();
    jl1 = new JLabel("<html><h3>请输入您的密码：", JLabel.CENTER);
    jl2 = new JLabel("请输入密码！");
    jl3 = new JLabel("您有三次输入机会", JLabel.LEFT);
    jp1 = new JPasswordField(8);
    p = new JPanel();
    jb1 = new JButton("<html><h3>提交");
    jb1.setActionCommand("tijiao");
    jb2 = new JButton("<html><h3>取消");
    jb2.setActionCommand("quxiao");
    p.setBorder(BorderFactory.createTitledBorder("密码设置"));
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
          jl2.setText("密码输入成功！");
          n--;
        } else {
          jl2.setText("密码输入不对，请重新输入！");
          jp1.setText("");
        }
      else
        jl2.setText("密码不能为空！");
    jp1.setText("");
    ;
    if (e.getSource() == jb2) {
      jp1.setText("");

      jl2.setText("请输入！");
    }
    jl3.setText("第" + n + "次输入！");
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
