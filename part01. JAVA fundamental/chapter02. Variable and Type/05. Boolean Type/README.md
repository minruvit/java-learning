## 논리 타입의 기초
- 참과 거짓을 의미하는 논리 리터럴은 각각 true, false이다.
- 논리 리터럴을 저장하는 변수 타입이 boolean이다.
  ```java
  boolean stop = true;
  boolean stop = false;
  ```
- 두 가지 상태값을 저장할 필요가 있을 때 쓰이며,
- 그 상태값에 따라 조건문과 제어문의 실행 흐름을 변경하는 데 주로 사용된다.
- '비교(>, <, >=, <=, ==, !=)' 및 '논리(&&, ||)' 연산의 산출값이 true, false이므로 이를 boolean 타입 변수에 대입할 수 있다.
  ```java
  int x = 10;
  boolean result = (x == 20);           // 변수 x의 값이 20인가?
  boolean result = (x != 20);           // 변수 x의 값이 20이 아닌가?
  boolean result = (x > 20);            // 변수 x의 값이 20보다 큰가?
  boolean result = (0 < x && x < 20);   // 변수 x의 값이 0보다 크고, 20보다 작은가?
  boolean result = (x < 0 || x > 200);  // 변수 x의 값이 0보다 작거나 200보다 큰가?
  ```
  ※ 연산식에 대해서는 3장을 참고

### BooleanExample.java 예제 참고