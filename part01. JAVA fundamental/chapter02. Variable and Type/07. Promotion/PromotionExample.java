package ch02.sec07;

public class PromotionExample {
    public static void main(String[] args) {
        // 자동 타입 변환
        // byte(1) -> int(4)
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue: " + intValue);

        // char(2) -> int(4)
        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드: " + intValue);

        // int(4) -> long(8)
        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue: " + longValue);

        // long(정수) -> float(실수)
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue: " + floatValue);

        // float(4) -> double(8)
        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue: " + doubleValue);
    }
}