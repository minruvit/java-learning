package ch03.sec05;

public class InfinityAndNaNCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        /* line 8, 9를 번갈아 주석 처리하면서 실행해보기 */
        double z = x / y;   // => Infinity
        double z = x % y;   // => NaN

        // 잘못된 코드
        System.out.println(z + 2);

        // 적절한 코드
        if (Double.isInfinite(z) || Double.isNaN(z)) {  // || 연산자 3.7절
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }
    }
}
