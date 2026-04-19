package String_Functions;

public class PerformanceTestDemo {

public static void main(String[] args) {

int iterations = 10000;

// StringBuffer Performance Test
long startTimeBuffer = System.nanoTime();
StringBuffer sbuffer = new StringBuffer();

for (int i = 0; i < iterations; i++) {
sbuffer.append("AIET");
}

long endTimeBuffer = System.nanoTime();
long timeBuffer = endTimeBuffer - startTimeBuffer;

System.out.println("StringBuffer Time: " + timeBuffer + " ns");

// StringBuilder Performance Test
long startTimeBuilder = System.nanoTime();
StringBuilder sbuilder = new StringBuilder();

for (int i = 0; i < iterations; i++) {
sbuilder.append("AIET");
}

long endTimeBuilder = System.nanoTime();
long timeBuilder = endTimeBuilder - startTimeBuilder;

System.out.println("StringBuilder Time: " + timeBuilder + " ns");

// Justification
if (timeBuilder < timeBuffer) {
System.out.println("StringBuilder is faster than StringBuffer.");
} else {
System.out.println("StringBuffer is faster than StringBuilder.");
}

}

}