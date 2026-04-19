package String_Functions;

import java.util.Random;

public class RandomStringDemo {

public static void main(String[] args) {

int length = 10;

// Calling user-defined function
String randomStr = generateRandomString(length);

System.out.println("Random String: " + randomStr);
}

// User-defined function
public static String generateRandomString(int length) {

String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
Random random = new Random();
String result = "";

for (int i = 0; i < length; i++) {
int index = random.nextInt(characters.length());
result += characters.charAt(index);
}

return result;
}

}