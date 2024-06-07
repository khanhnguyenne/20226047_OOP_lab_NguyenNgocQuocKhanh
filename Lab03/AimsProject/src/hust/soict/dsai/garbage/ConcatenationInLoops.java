package hust.soict.dsai.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        long startTime, endTime;

        // Using String
        startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for String: " + (endTime - startTime) + "ms");

        // Using StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for StringBuilder: " + (endTime - startTime) + "ms");

        // Using StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("");
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time for StringBuffer: " + (endTime - startTime) + "ms");
    }
}
