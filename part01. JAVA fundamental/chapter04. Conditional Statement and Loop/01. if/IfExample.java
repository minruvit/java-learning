package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다.");
        }

        if (score < 90)
            System.out.println("점수가 90보다 작습니다.");     // if 문에 중괄호가 없다면, 실행문 하나만 if 실행문에 해당.
            System.out.println("등급은 B입니다.");            // if 문과는 상관없는 실행문
    }
}
