package String_Functions;


public class SubstringCountDemo {

public static void main(String[] args) {

String mainString = "Java is fun. Java is powerful. Java is popular.";
String subString = "Java";

// Calling user-defined function
int count = countOccurrences(mainString, subString);

System.out.println("Main String: " + mainString);
System.out.println("Substring: " + subString);
System.out.println("Occurrences: " + count);
}

// User-defined function
public static int countOccurrences(String mainStr, String subStr) {

if (mainStr == null || subStr == null || subStr.isEmpty()) {
return 0;
}

int count = 0;
int index = 0;

while ((index = mainStr.indexOf(subStr, index)) != -1) {
count++;
index += subStr.length();
}

return count;
}

}