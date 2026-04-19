package String_Functions;

public class NumericCheckDemo {

public static void main(String[] args) {

String str1 = "12345";
String str2 = "12a45";

// Calling user-defined function
System.out.println("str1 is numeric: " + isNumeric(str1));
System.out.println("str2 is numeric: " + isNumeric(str2));
}

// User-defined function
public static boolean isNumeric(String str) {

if (str == null || str.isEmpty()) {
return false;
}

for (int i = 0; i < str.length(); i++) {
if (!Character.isDigit(str.charAt(i))) {
return false;
}
}

return true;
}

}