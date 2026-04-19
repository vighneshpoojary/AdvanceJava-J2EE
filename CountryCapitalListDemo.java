package Swings;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.HashMap;
import java.util.Map;

public class CountryCapitalListDemo {

CountryCapitalListDemo() {

JFrame f = new JFrame("Country - Capital Demo");

String countries[] = {
"USA", "India", "Vietnam", "Canada", "Denmark",
"France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
};

// Map for country-capital relation
Map<String, String> capitalMap = new HashMap<>();

capitalMap.put("USA", "Washington D.C.");
capitalMap.put("India", "New Delhi");
capitalMap.put("Vietnam", "Hanoi");
capitalMap.put("Canada", "Ottawa");
capitalMap.put("Denmark", "Copenhagen");
capitalMap.put("France", "Paris");
capitalMap.put("Great Britain", "London");
capitalMap.put("Japan", "Tokyo");
capitalMap.put("Africa", "Addis Ababa");
capitalMap.put("Greenland", "Nuuk");
capitalMap.put("Singapore", "Singapore");

JList<String> list = new JList<>(countries);
list.setBounds(50, 50, 200, 200);

list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

// Event handling
list.addListSelectionListener(new ListSelectionListener() {
public void valueChanged(ListSelectionEvent e) {

if (!e.getValueIsAdjusting()) {

String country = list.getSelectedValue();
String capital = capitalMap.get(country);

System.out.println("Capital of " + country + " is: " + capital);
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
new CountryCapitalListDemo();
}
}