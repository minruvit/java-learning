package ch02.sec06;

public class TextBlockExample {
    public static void main(String[] args) {
        // 이스케이프 문자 사용
        String str1 = "" +
            "{\n" +
            "\t\"id\":\"winter\",\n" +
            "\t\"name\":\"눈송이\"\n" +
            "}";

        // (java 13)텍스트 블록 문법
        String str2 = """
            {
                "id":"winter",
                "name":"눈송이"
            }
            """;

        System.out.println(str1);
        System.out.println("----------------------------------");
        System.out.println(str2);
        System.out.println("----------------------------------");
        // Line 26 : (java 14)끝의 \는 줄바꿈을 하지 않기 위함
        String str = """
        나는 자바를 \
        학습합니다.
        나는 자바 고수가 될 겁니다.
        """;
        System.out.println(str);
    }
}