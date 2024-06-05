## 키보드 입력 데이터를 변수에 저장 : Scanner
- 키보드로부터 입력된 데이터를 읽는 방법은 여러 가지가 있다
- 이 절에서는 `Scanner`에 대해 다룸
- `Scanner` 타입 변수를 생성하고, 대입연산자 `=`를 사용하여 `new` 연산자로 생성한 `Scanner`객체를 변수에 대입
- ``Scanner scanner = new Scanner(System.in);``
- 이후, `scanner.nextLine()`을 실행하면 키보드로 입력된 내용을 **문자열**로 읽고 좌측 변수에 저장한다.
- ``String inputData = scanner.nextLine();``
- `scanner.nextLine()`은 `Enter`키가 입력되기 전까지 '블로킹(대기)' 상태가 되며, `Enter`키가 입력되면 지금까지 입력된 모든 내용을 **문자열**로 읽는다.
### ScannerExample.java 예제 참고
