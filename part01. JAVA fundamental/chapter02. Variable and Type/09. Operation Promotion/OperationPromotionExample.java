package ch02.sec09;

public class OperationPromotionExample {
    public static void main(String[] args) {
        /* 리터럴간의 연산 */
        byte result1 = 10 + 20;         // 컴파일 단계에서 연산
        System.out.println("result1: " + result1);

        /* 변수간의 연산 */
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;      // int 타입으로 promotion되어 연산. 결과값 int
        System.out.println("result2: " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;    // 피연산자들은 long타입으로 promotion되어 연산. 결과값 long
        System.out.println("result3: " + result3);

        char v6 = 'A';
        char v7 = 1;
        int result4 = v6 + v7;       // int 타입으로 promotion되어 연산. 결과값 int
        System.out.println("result4: " + result4);      // int 형태 그대로 출력
        System.out.println("result4: " + (char)result4);    // char로 casting 후 출력 -> 해당 unicode에 매핑되는 문자

        int v8 = 10;
        int result5 = v8 / 4;       // 정수 연산의 결과는 '정수'
        System.out.println("result5: " + result5);

        int v9 = 10;
        double result6 = v9 / 4.0;  // int, double간의 연산 -> int는 double로 promotion -> 결과값 double
        System.out.println("result6: " + result6);

        int v10 = 1;
        int v11 = 2;
        double result7 = (double)v10 / v11;     // v10을 double로 casting 후 연산 -> v11은 double로 promotion
        System.out.println("result7: " + result7);
    }
}