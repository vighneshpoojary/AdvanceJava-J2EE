package String_Functions;

public class WordCountDemo {

public static void main(String[] args) {

String input = "Java programming is very powerful";

// Calling user-defined function
int count = countWords(input);

System.out.println("Input String: " + input);
System.out.println("Number of words: " + count);
}

// User-defined function
public static int countWords(String str) {

if (str == null || str.trim().isEmpty()) {
return 0;
}

// Split by one or more spaces
String[] words = str.trim().split("\\s+");

return words.length;
}

}