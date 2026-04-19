package Swings;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageButtonDemo {

JLabel label;

ImageButtonDemo() {

JFrame f = new JFrame("Image Button Example");

label = new JLabel();
label.setBounds(50, 250, 400, 50);

JButton b1 = new JButton(new ImageIcon("digital.jpg"));
JButton b2 = new JButton(new ImageIcon("hourglass.jpg"));

b1.setBounds(50, 50, 150, 150);
b2.setBounds(250, 50, 150, 150);

// Digital Clock button
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
label.setText("Digital Clock is pressed");
}
});

// Hour Glass button
b2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
label.setText("Hour Glass is pressed");
}
});

f.add(b1);
f.add(b2);
f.add(label);

f.setSize(200, 400);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}

public static void main(String[] args) {
new ImageButtonDemo();
}
}