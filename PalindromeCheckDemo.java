package String_Functions;

public class PalindromeCheckDemo {

public static void main(String[] args) {

String input = "A man, a plan, a canal: Panama";

// Calling user-defined function
boolean result = isPalindrome(input);

System.out.println("Input String: " + input);
System.out.println("Is Palindrome: " + result);
}

// User-defined function
public static boolean isPalindrome(String str) {

if (str == null) {
return false;
}

// Remove punctuation and spaces, convert to lowercase
String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

// Reverse the string
String reversed = "";
for (int i = cleaned.length() - 1; i >= 0; i--) {
reversed += cleaned.charAt(i);
}

// Check equality
return cleaned.equals(reversed);
}

}