## Declaration variable(변수 선언)
- <u>어떤 타입의 데이터</u>를 저장할 것인지, <u>변수 이름</u>이 무엇인지를 결정하는 것
- 저장되는 값의 타입과 이름만 결정됐을 뿐, <u>아직 메모리에 할당된 것은 아님!</u>
```java
int age;        // 정수(int) 값을 저장할 수 있는 age 변수 선언
double value;   // 실수(double) 값을 저장할 수 있는 value 변수 선언
```
## 대입 연산자 =
- 선언된 변수에 값을 저장하는 연산자.
- 우측 값을 좌측 변수에 대입하는 연산자로 사용됨
```java
int score;  // 변수 선언
score = 90; // 변수 score에 값 90 대입
```
## Initialization Variable(변수 초기화)
- 변수에 최초로 값을 대입하는 행위.
- 이 때의 값을 '초기값'이라고 한다.
- 변수를 선언함과 동시에 초기화(대입)할 수도 있다.<br>
`int score = 90;`
- 변수 초기화가 됐을 때야 비로소 <u>메모리에 할당된다.</u>
- 초기화되지 않은 변수를 연산에 사용할 경우 컴파일 에러(The local variable value may not have been initialized) 발생
```java
int value;
int result = value + 10;    // compile error
```
- VariableInitializationExample.java 예제 참고
## 변수는 실행문 등에 사용되어 변수값을 활용한다.
- VariableUseExample.java 예제 참고
## 변수 복사
- 변수는 또 다른 변수에 대입되어 <u>메모리 간에 값을 복사</u>할 수 있다.
```java
int x = 10;
int y = x;  // 변수 y에 변수 x의 값을 대입
```
## 변수의 값을 서로 바꾸기 위해서는 임시로 값을 저장할 변수가 하나 더 필요하다!
- VariableExchangeExample.java 예제 참고