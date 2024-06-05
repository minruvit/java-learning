package ch02.sec10;

public class PrimitiveAndStringConversionExample {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("10");            // String -> int
        double value2 = Double.parseDouble("3.14");     // String -> double
        boolean value3 = Boolean.parseBoolean("true");  // String -> boolean

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);

        String str1 = String.valueOf(value1);   // int -> String
        String str2 = String.valueOf(value2);   // double -> String
        String str3 = String.valueOf(value3);   // boolean -> String

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
    }
}
