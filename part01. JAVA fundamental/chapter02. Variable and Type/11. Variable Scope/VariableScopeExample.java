package ch02.sec11;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1 > 10) {
            int v2 = v1 - 10;
        }
        // int v3 = v1 + v2 + 5;   // v2 변수를 사용할 수 없기 때문에 compile error.

        // 중괄호 블록은 단독으로도 쓰일 수 있다!
        {
            int v4 = 3;
            System.out.println("inner: " + v4);
        }
        // System.out.println("outer: " + v4);  // v4 변수를 사용할 수 없기 때문에 compile error.
    }
}
