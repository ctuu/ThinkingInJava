import java.awt.*;
import java.awt.event.*;

import java.awt.Label;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class newhanoi extends Frame implements TextListener, ItemListener {
  static newhanoi frm = new newhanoi();
  static int[][] storage;
  static ArrayList<Object> lab5 = new ArrayList<Object>();
  static int u;
  static int v;
  static boolean c = true;
  static int count = 0;
  static int n = 2;
  static int timeset = 150;
  static int first = 510;
  static int middle = 540;
  static int third = 540;
  static Button bt6 = new Button("暂停");
  static Button bt4 = new Button("下一步");
  static Button bt5 = new Button("自动执行");
  static TextField field2 = new TextField();
  static int cuont;
  static Label lab3 = new Label("已经执行的步骤是：");
  static Button bt1 = new Button("开始");
  static TextField field = new TextField();
  static Button bt2 = new Button("停止");
  static Button bt3 = new Button("刷新");
  static Label label3 = new Label("点此自动运行");
  static Frame frame = new Frame();
  static Label label = new Label("请输入要搬的塔的个数(1-10)");
  static Label lab[] = new Label[10];
  static Checkbox che1 = new Checkbox("快");
  static Checkbox che2 = new Checkbox("中");
  static Checkbox che3 = new Checkbox("慢");

  static Label lab2 = new Label("演示速度：");
  public void go() {
    CheckboxGroup gro = new CheckboxGroup();
    bt1.addActionListener(new aListener());
    bt2.addActionListener(new aListener());
    bt3.addActionListener(new aListener());
    bt4.addActionListener(new aListener());
    bt5.addActionListener(new aListener());
    bt6.addActionListener(new cctionListener());
    che1.addItemListener(frm);
    che2.addItemListener(frm);
    che3.addItemListener(frm);
    che1.setCheckboxGroup(gro);
    che2.setCheckboxGroup(gro);
    che3.setCheckboxGroup(gro);
    field.addTextListener(frm);
    frm.setResizable(false);
    frm.setTitle("汉诺塔问题研究：");
    frm.setLayout(null);
    frm.setSize(800, 600);
    frm.setBackground(Color.pink);
    bt4.setBounds(480, 560, 100, 30);
    lab3.setBounds(540, 60, 100, 15);
    field2.setBounds(650, 60, 30, 20);
    label.setBounds(20, 560, 150, 15);
    bt1.setBounds(340, 560, 120, 30);
    bt2.setBounds(600, 560, 120, 30);
    bt3.setBounds(340, 560, 120, 30);
    bt6.setBounds(340, 560, 120, 30);
    che1.setBounds(90, 580, 30, 15);
    che2.setBounds(120, 580, 30, 15);
    che3.setBounds(150, 580, 30, 15);
    lab2.setBounds(20, 580, 50, 15);
    field.setBounds(170, 560, 20, 15);
    label3.setBounds(80, 565, 80, 15);
    bt5.setBounds(200, 560, 120, 30);
    frm.add(bt6);
    frm.add(label3);
    frm.add(bt5);
    frm.add(bt4);
    frm.add(lab3);
    frm.add(field2);
    frm.add(field);
    frm.add(label);
    frm.add(lab2);
    frm.add(bt1);
    frm.add(bt2);
    frm.add(bt3);
    frm.add(che1);
    frm.add(che2);
    frm.add(che3);
    bt6.setVisible(false);
    label3.setVisible(false);
    bt4.setVisible(false);
    bt5.setVisible(false);
    frm.setVisible(true);
    bt1.setVisible(true);
    bt3.setVisible(false);
    bt2.setVisible(true);
    field2.setVisible(false);
    lab3.setVisible(false);
    storage = new int[(int) (Math.pow(2, 10) - 1)][3];
    frm.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  public class class2 implements Runnable {
    public void run() {
      bt5.setVisible(false);
      bt4.setVisible(false);
      bt6.setVisible(true);
      label3.setVisible(false);
      int j = v;
      for (int i = j; i < Math.pow(2, n) - 1; i++) {
        if (c == true) {
          setbeforcolor(lab, storage[v][1]);
          timest(timeset);
          move1(lab, storage[v][0], storage[v][1], storage[v][2]);
          timest(timeset);
          setaftercolor(lab, storage[v][1]);

          v++;
          if (i == Math.pow(2, n) - 2) {
            JOptionPane.showMessageDialog(
                frm, "汉诺塔执行完毕", "warning!", JOptionPane.WARNING_MESSAGE);
          }
        } else {
          break;
        }
      }
      bt6.setVisible(false);
      bt3.setVisible(true);
    }
  }

  public static void main(String[] args) {
    try {
      newhanoi test = new newhanoi();
      test.go();
      Runnable threadjob = (Runnable) new newhanoi();
      Thread thread1 = new Thread(threadjob);
      thread1.start();
    } catch (Exception ex) {
      System.out.print("");
    }
  }
  public void paint(Graphics g) {
    g.drawLine(100, 540, 100, 100);
    g.drawLine(20, 540, 180, 540);
    g.drawLine(260, 540, 400, 540);
    g.drawLine(330, 540, 330, 100);
    g.drawLine(500, 540, 680, 540);
    g.drawLine(590, 540, 590, 100);
  }

  public class aListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      Button btn = (Button) e.getSource();
      if (btn == bt1) {
        for (int i = 0; i < n; i++) {
          lab[i] = new Label();
          lab[i].setSize(24 * (i + 1), 50);
          lab[i].setLocation(100 - lab[i].getWidth() / 2, 540 - 50 * (n - i));
          lab[i].setBackground(Color.red);
          frm.add(lab[i]);
        }
        bt1.setVisible(false);
        Hanoi(100, 330, 590, n, lab);
        bt2.setVisible(true);
        bt4.setVisible(true);
        field2.setVisible(true);
        lab3.setVisible(true);
        bt3.setVisible(true);
        label.setVisible(false);
        field.setVisible(false);
        che1.setVisible(false);
        che2.setVisible(false);
        che3.setVisible(false);
        lab2.setVisible(false);
        bt5.setVisible(true);
        label3.setVisible(true);
      }
      if (btn == bt3) {
        bt3.setVisible(false);
        bt2.setVisible(false);
        bt1.setVisible(true);
        bt4.setVisible(false);
        bt1.setVisible(true);
        bt2.setVisible(true);
        label.setVisible(true);
        field.setVisible(true);
        for (int i = 0; i < n; i++) {
          frm.remove(lab[i]);
          field.setVisible(true);
          first = 540 - n;
          middle = 540;
          third = 540;
        }
        che1.setVisible(true);
        che2.setVisible(true);
        che3.setVisible(true);
        v = 0;
        u = 0;
        count = 0;
        field2.setText(String.valueOf(count));
        label3.setVisible(false);
        bt5.setVisible(false);
      }
      if (btn == bt2) {
        System.exit(0);
      }
      if (btn == bt4) {
        bt1.setVisible(false);
        bt3.setVisible(false);
        bt2.setVisible(true);
        move1(lab, storage[v][0], storage[v][1], storage[v][2]);
        v++;
        label.setVisible(false);
        bt3.setVisible(true);
        if (v == Math.pow(2, n) - 1) {
          JOptionPane.showMessageDialog(
              frm, "汉诺塔执行完毕", "WARNINT!", JOptionPane.WARNING_MESSAGE);
          bt3.setVisible(true);
        }
        bt5.setVisible(true);
      }
      if (btn == bt5) {
        c = true;
        Runnable r = new class2();
        Thread t = new Thread(r);
        t.start();
      }
    }
  }
  private void Hanoi(int i, int j, int k, int n2, Label[] lab3) {
    if (n2 == 1) {
      storage[u][0] = i;
      storage[u][1] = 1;
      storage[u][2] = k;
      lab5.add(lab3);
      u = u + 1;
    } else {
      Hanoi(i, k, j, n2 - 1, lab3);
      storage[u][0] = i;
      storage[u][1] = n2;
      storage[u][2] = k;
      lab5.add(lab3);
      u = u + 1;
      Hanoi(j, i, k, n2 - 1, lab3);
    }
  }

  private void setaftercolor(Label[] lab4, int i) {
    lab4[i - 1].setBackground(Color.red);
  }

  private void move1(Label[] lab4, int first2, int i, int third2) {
    count++;
    field2.setText(String.valueOf(count));
    if (first2 == 100 && third2 == 330) {
      lab4[i - 1].setLocation(330 - lab4[i - 1].getWidth() / 2, middle - 50);
      first = first + 50;
      middle = middle - 50;
    }
    if (first2 == 100 && third2 == 590) {
      lab4[i - 1].setLocation(590 - lab4[i - 1].getWidth() / 2, third - 50);
      first = first + 50;
      third = third - 50;
    }
    if (first2 == 330 && third2 == 100) {
      lab4[i - 1].setLocation(100 - lab4[i - 1].getWidth() / 2, first - 50);
      middle = middle + 50;
      first = first - 50;
    }
    if (first2 == 330 && third2 == 590) {
      lab4[i - 1].setLocation(590 - lab4[i - 1].getWidth() / 2, third - 50);
      middle = middle + 50;
      third = third - 50;
    }
    if (first2 == 590 && third2 == 100) {
      lab4[i - 1].setLocation(100 - lab4[i - 1].getWidth() / 2, first - 50);
      third = third + 50;
      first = first - 50;
    }
    if (first2 == 590 && third2 == 330) {
      lab4[i - 1].setLocation(330 - lab4[i - 1].getWidth() / 2, middle - 50);
      third = third + 50;
      middle = middle - 50;
    }
  }

  private void timest(int timeset2) {
    try {
      Thread.sleep(timeset2);
    } catch (Exception ex) {
      System.out.print("fuck");
    }
  }

  private void setbeforcolor(Label[] lab4, int i) {
    lab4[i - 1].setBackground(Color.green);
  }

  @Override
  public void textValueChanged(TextEvent e) {
    TextField txt = (TextField) e.getSource();
    if (txt == field) {
      try {
        n = Integer.parseInt(txt.getText());
      } catch (Exception ex) {
        bt1.setVisible(false);
        return;
      }
      if (n > 0 && n <= 10) {
        first = 540 - 50 * n;
        bt1.setVisible(true);
      } else {
        bt1.setVisible(false);
      }
    }
  }
  @Override
  public void itemStateChanged(ItemEvent e) {
    if (che1.getState() == true) {
      timeset = 50;
    } else if (che2.getState() == true) {
      timeset = 150;
    } else {
      timeset = 500;
    }
  }
  public class cctionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      c = false;
      bt4.setVisible(true);
      bt5.setVisible(true);
    }
  }
}
