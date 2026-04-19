package String_Functions;

public class TruncateStringDemo {

public static void main(String[] args) {

String input = "Java Programming Language is powerful";

// Calling user-defined function
String result = truncate(input, 20);

System.out.println("Original String: " + input);
System.out.println("Truncated String: " + result);
}

// User-defined function
public static String truncate(String str, int length) {

if (str == null) {
return null;
}

if (str.length() <= length) {
return str;
}

// Shorten and add ellipsis
return str.substring(0, length) + "...";
}

}