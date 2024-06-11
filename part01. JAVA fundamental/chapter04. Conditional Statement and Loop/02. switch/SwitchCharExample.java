package ch04.sec03;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A':   // 'A'면 여기로 이동
            case 'a':   // 'a'면 여기로 이동
                // 결과적으로, 'A' or 'a'면 실행
                System.out.println("우수 회원입니다.");
                break;
            case 'B':   // 'B'면 여기로 이동
            case 'b':   // 'b'면 여기로 이동
                // 결과적으로, 'B' or 'b'면 실행
                System.out.println("일반 회원입니다.");
                break;
            default:
                // 'A', 'a', 'B', 'b' 넷 다 아니면 실행
                System.out.println("손님입니다.");
        }
    }
}
