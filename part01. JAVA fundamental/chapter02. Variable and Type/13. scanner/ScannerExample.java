package ch02.sec13;

import java.util.Scanner;       // ※ Scanner가 java.util 패키지에 있음을 컴파일러에게 알려줌. import : 6장

public class ScannerExample {
    public static void main(String[]args) throws Exception {
        Scanner scanner = new Scanner(System.in);   // Scanner 객체 생성 및 Scanner 변수에 대입

        System.out.print("x 입력: ");
        String strX = scanner.nextLine();   // strX에 Enter키가 입력되기 전까지의 모든 내용 문자열로 읽고 저장
        int x = Integer.parseInt(strX);     // x에 문자열 strX를 int로 변환 후 저장

        System.out.print("y 입력: ");
        String strY = scanner.nextLine();   // strY에 Enter키가 입력되기 전까지의 모든 내용 문자열로 읽고 저장
        int y = Integer.parseInt(strY);     // y에 문자열 strY를 int로 변환 후 저장

        int result = x + y;
        System.out.println("x + y: " + result);
        System.out.println();

        // ※ 중괄호 {} 안을 무한히 반복 실행함 : 4장
        while (true) {
            System.out.print("입력 문자열: ");
            String data = scanner.nextLine();
            if (data.equals("q")) {     // ※ 문자열이 같은지 비교할 때는 equals()를 사용. primitive type은 == 연산자 사용. : 5장
                break;  // 입력된 문자열이 q라면 반복을 중지
            }
            System.out.println("출력 문자열: " + data);
            System.out.println();
        }

        System.out.println("종료");
    }
}
