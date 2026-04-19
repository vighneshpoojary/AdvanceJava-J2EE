package String_Functions;

public class CapitalizeWordsDemo {

public static void main(String[] args) {

String input = "java programming language";

// Calling user-defined function
String result = capitalizeWords(input);

System.out.println("Original String: " + input);
System.out.println("Capitalized String: " + result);
}

// User-defined function
public static String capitalizeWords(String str) {

if (str == null || str.isEmpty()) {
return str;
}

String[] words = str.split("\\s+");
String result = "";

for (String word : words) {
if (word.length() > 0) {
result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
}
}

return result.trim();
}

}