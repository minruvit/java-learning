package ch01.sec08;		// 패키지 선언


public class Hello {	// 클래스 선언.
						// Hello : 클래스명.
						// 클래스명은 숫자로 시작 X, 공백 포함 X
						// source 파일명과 '완전히' 일치해야한다.
						// {...} 중괄호 블록을 '클래스 블록'이라고 한다.
						// 클래스 블록에는 클래스의 정의 내용이 작성됨.
	public static void main(String[] args) {	// main() 메소드
												// {...} 중괄호 블록을 '메소드 블록'이라고 한다.
												// 바이트코드 파일을 실행하면 main() 메소드 블록이 실행됨.
												// => main() 메소드 : 프로그램 실행 진입점(entry point)
		System.out.println("Hello,Java");
	}
}