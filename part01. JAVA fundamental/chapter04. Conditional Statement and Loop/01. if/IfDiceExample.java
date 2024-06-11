package ch04.sec02;

public class IfDiceExample {
    public static void main(String[] args) {
        // Math.random()은 0.0 이상 1.0 미만의 double 타입 난수를 생성한다.
        // 6을 곱하면 0.0 ~ 6.0 사이의 double 타입 난수 생성 가능
        // 이를 int 타입으로 casting
        int num = (int)(Math.random()*6) + 1;

        if (num == 1) {
            System.out.println("1번이 나왔습니다.");
        } else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else {
            System.out.println("6번이 나왔습니다.");
        }
    }
}
