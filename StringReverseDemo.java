package String_Functions;

public class StringReverseDemo {

public static void main(String[] args) {

String original = "Hello Java";

// Calling user-defined function
String reversed = reverseString(original);

System.out.println("Original String: " + original);
System.out.println("Reversed String: " + reversed);
}

// User-defined function
public static String reverseString(String str) {

if (str == null) {
return null;
}

String reversed = "";

for (int i = str.length() - 1; i >= 0; i--) {
reversed += str.charAt(i);
}

return reversed;
}

}