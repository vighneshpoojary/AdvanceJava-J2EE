package String_Functions;


public class NullOrWhitespaceCheck {

public static void main(String[] args) {

String str1 = null;
String str2 = "";
String str3 = "   ";
String str4 = "Hello";

// Testing the function
System.out.println("str1: " + isNullOrEmpty(str1));
System.out.println("str2: " + isNullOrEmpty(str2));
System.out.println("str3: " + isNullOrEmpty(str3));
System.out.println("str4: " + isNullOrEmpty(str4));
}

// User-defined function
public static boolean isNullOrEmpty(String str) {
return str == null || str.trim().isEmpty();
}

}