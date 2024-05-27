package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        String name = "홍길동";
        String job = "프로그래머";
        System.out.println(name);
        System.out.println(job);

        String str = "나는 \"자바\"를 배웁니다.";    // 문자열에 큰따옴표를 넣기 위해 \"를 사용.
        System.out.println(str);

        str = "번호\t이름\t직업 ";    // 문자열에 탭 문자를 넣기 위해 \t를 사용.
        System.out.println(str);

        System.out.print("나는\n");   // 개행 문자를 넣기 위해 \n를 사용.
        System.out.print("자바를\n");
        System.out.print("배웁니다.\n");
    }
}