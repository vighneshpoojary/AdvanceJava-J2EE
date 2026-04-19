package Swings;

import java.awt.Color;
import javax.swing.*;

public class ColorTabbedPaneDemo {

ColorTabbedPaneDemo() {

JFrame f = new JFrame("CMY Tabbed Pane");

JPanel cyanPanel = new JPanel();
JPanel magentaPanel = new JPanel();
JPanel yellowPanel = new JPanel();

// Set colors
cyanPanel.setBackground(Color.CYAN);
magentaPanel.setBackground(Color.MAGENTA);
yellowPanel.setBackground(Color.YELLOW);

// Create tabbed pane
JTabbedPane tp = new JTabbedPane();

tp.addTab("Cyan", cyanPanel);
tp.addTab("Magenta", magentaPanel);
tp.addTab("Yellow", yellowPanel);

f.add(tp);

f.setSize(400, 400);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}

public static void main(String[] args) {
new ColorTabbedPaneDemo();
}
}