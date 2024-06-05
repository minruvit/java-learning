package ch03.sec02;

public class ArithmeticOperatorExample {
    public static void main(String[] args) {
        byte v1 = 10;
        byte v2 = 4;
        long v4 = 10L;

        int result1 = v1 + v2;  // 모든 피연산자는 int타입으로 promotion되어 연산
        System.out.println("result1: " + result1);

        long result2 = v1 + v2 - v4;    // 모든 피연산자는 long 타입으로 promotion되어 연산
        System.out.println("result2: " + result2);

        double result3 = (double)v1 / v2;   // v1을 double 타입으로 casting하여 v1이 double로 변환되고, v2는 자동으로 double 타입으로 promotion되어 연산

        System.out.println("result3: " + result3);

        int result4 = v1 % v2;
        System.out.println("result4: " + result4);
    }
}
