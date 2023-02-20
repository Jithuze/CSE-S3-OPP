import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Counter extends JFrame implements ActionListener {

    String s1, s2, s3;
    static JFrame f;
    static JTextField t;
    static JLabel l;

    Counter() {
        s1 = s2 = s3 = "";
    }

    public static void main(String[] args) {
        f = new JFrame("Counter");
        try {
            UIManager.setLookAndFeel(UIManager.getLookAndFeel());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Counter c = new Counter();
        t = new JTextField(10);
        t.setText("0");
        JButton c1, c2;

        c1 = new JButton("+");
        c2 = new JButton("-");

        JPanel p = new JPanel();
        c1.addActionListener(c);
        c2.addActionListener(c);
        p.add(c1);
        p.add(t);
        p.add(c2);
        p.setBackground(Color.blue);
        f.add(p);
        f.setSize(400, 200);
        f.show();
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        int num = Integer.parseInt(t.getText());
        if (s.equals("+")) {
            num++;
            t.setText(Integer.toString(num));
        } else if (s.equals("-")) {
            num--;
            t.setText(Integer.toString(num));
        }

    }
}
