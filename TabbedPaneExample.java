package Swings;

import java.awt.Color;
import javax.swing.*;

public class TabbedPaneExample {

JFrame f;

TabbedPaneExample() {

f = new JFrame("Tabbed Pane Example");

JPanel p1 = new JPanel();
JPanel p2 = new JPanel();
JPanel p3 = new JPanel();

// Set background colors
p1.setBackground(Color.BLUE);
p2.setBackground(Color.RED);
p3.setBackground(Color.GREEN);

JTabbedPane tp = new JTabbedPane();
tp.setBounds(50, 50, 300, 200);

tp.add("BLUE", p1);
tp.add("RED", p2);
tp.add("GREEN", p3);

f.add(tp);

f.setSize(400, 400);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}

public static void main(String[] args) {
new TabbedPaneExample();
}
}