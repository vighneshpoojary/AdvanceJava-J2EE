package Swings;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryListDemo {

CountryListDemo() {

JFrame f = new JFrame("Country List Demo");

String countries[] = {
"USA", "India", "Vietnam", "Canada", "Denmark",
"France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
};

JList<String> list = new JList<>(countries);
list.setBounds(50, 50, 200, 200);

list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

// Event handling
list.addListSelectionListener(new ListSelectionListener() {
public void valueChanged(ListSelectionEvent e) {

if (!e.getValueIsAdjusting()) {
String selected = list.getSelectedValue();
System.out.println("Selected Country: " + selected);
}
}
});

f.add(list);

f.setSize(400, 300);
f.setLayout(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setVisible(true);
}

public static void main(String[] args) {
new CountryListDemo();
}
}