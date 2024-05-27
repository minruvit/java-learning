package ch02.sec05;

/* stop 변수값에 따라 if 블록과 else 블록 중 하나를 실행하고,
   연산식의 결과를 boolean 변수에 저장해서 출력한다. */
public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }

        int x = 10;
        boolean result1 = (x == 20);    // 변수 x의 값이 20인가?
        boolean result2 = (x != 20);    // 변수 x의 값이 20이 아닌가?
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}