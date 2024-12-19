package org.example;

public class StringMax {
    public static String findMaxString(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }

    public static void main(String[] args) {
        // Example Test Case
        String str1 = "Apple";
        String str2 = "Peach";
        String str3 = "Banana";
        String max = findMaxString(str1, str2, str3);
        System.out.println("Maximum string: " + max);
    }
}

