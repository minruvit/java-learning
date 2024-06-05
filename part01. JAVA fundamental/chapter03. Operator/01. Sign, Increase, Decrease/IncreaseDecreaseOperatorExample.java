package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        // 단독으로 쓰일 때는 연산 결과가 같다
        x++;
        ++x;
        System.out.println("x=" + x);

        System.out.println("---------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("---------------");
        z = x++;        // 후행. 모든 연산이 끝난 후에 1 증가, = 대입 연산도 '연산'이다!
        System.out.println("z=" + z);   // 12
        System.out.println("x=" + x);   // 13

        System.out.println("---------------");
        z = ++x;        // 선행. 1 먼저 증가시킨 후, 나머지 연산 수행!
        System.out.println("z=" + z);   // 14
        System.out.println("x=" + x);   // 14

        System.out.println("---------------");
        z = ++x + y++;  // x는 1이 증가된 상태로, y는 모든 연산이 끝난 후에 1 증가된다.
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
