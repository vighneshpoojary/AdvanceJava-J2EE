package String_Functions;

public class RemoveWhitespaceDemo {

public static void main(String[] args) {

String input = "  Java   Programming   Language  ";

// Calling user-defined function
String result = removeWhitespace(input);

System.out.println("Original String: '" + input + "'");
System.out.println("After removing whitespace: '" + result + "'");
}

// User-defined function
public static String removeWhitespace(String str) {

if (str == null) {
return null;
}

// Remove all whitespace characters
return str.replaceAll("\\s", "");
}

}