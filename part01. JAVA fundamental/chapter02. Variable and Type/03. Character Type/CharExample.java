package ch02.sec03;

public class CharExample {
    public static void main(String[] args) {
        char c1 = 'A';      // 문자 저장
        char c2 = 65;       // 유니코드 직접 저장

        char c3 = '가';      // 문자 저장
        char c4 = 44032;    // 유니코드 직접 저장

        /* char 공백 초기화 */
        // char c5 = '';       // java: empty character literal
        char c6 = ' ';          // 공백 문자로 초기화. 일반적으로 권장.
        char c7 = '\u0000';     // null 문자로 초기화. 권장되지 않음.

        /* 콘솔에 변수에 저장된 값 출력 */
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c6);
        System.out.println(c7);
    }
}