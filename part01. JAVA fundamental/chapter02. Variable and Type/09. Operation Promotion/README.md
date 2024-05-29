## 연산식에서 자동 타입 변환
- JAVA는 실행 성능을 향상시키기 위해, <u>리터럴간의 연산은 컴파일 단계에서 수행</u>하여 바이트코드를 생성함.
  ```java
  byte result = 10 + 20;        // 컴파일 시 byte result = 30;로 변환됨
  float result = 1.2f + 3.4f;   // 컴파일 시 float result = 4.6f;로 변환됨
  ```
  - 실행 시 덧셈 연산이 없으므로 실행 성능이 향상된다.
- but, <u>변수간의 연산은 실행 시 수행</u>된다.
  - promotion
    - int 타입보다 범위가 작은 <u>byte, short 타입의 변수는 int 타입으로 promotion되어 연산이 수행</u>된다.
      ```java
      byte x = 10;
      byte y = 20;
      byte result = x + y;    // 컴파일 에러, x와 y가 int로 promotion되므로, 결과값도 int
      int result = x + y;     // 연산의 결과값은 int이므로 int에 저장
      ```
    - 특별한 이유가 없다면 특정 정수형 변수가 연산에 사용된다면 int로 선언하는 것이 실행 성능에 도움된다.
    - long 타입이 피연산자로 사용되면 다른 피연산자는 long으로 promotion된다. -> long에 저장
    - 피연산자 중 하나가 double 타입이면 다른 피연산자도 double로 promotion된다. -> double에 저장
  - casting
    - 범위가 더 작은 타입으로 연산해야할 경우 casting하고 연산을 수행한다.
      ```java
      int intValue = 10;
      double doubleValue = 5.5;
      int result = intValue + (int)doubleValue;   // 10 + 5
      ```
    - Java에서 정수 연산의 결과는 항상 정수가 되기 때문에 아래 코드는 0.0을 출력한다.
      ```java
      int x = 1;
      int y = 2;
      double result = x / y;
      System.out.println(result);    // 콘솔에 0.0이 출력됨!
      ```
      - 0.5를 출력시키기 위해서는 정수 연산이 아닌 실수 연산으로 바꿔줘야 한다.
      - Widening Conversion
      - => 위 경우, 피연산자 중 하나 이상을 double 타입으로 변환한다!
        ```java
        int x = 1;
        int y = 2;
        
        /* 방법1 */
        double result = (double)x / y;    // x를 실수로 casting -> 실수, 정수 연산 수행 -> y(정수)는 double로 promotion
        /* 방법2 */
        double result = x / (double)y;    // y를 실수로 casting -> 실수, 정수 연산 수행 -> x(정수)는 double로 promotion
        /* 방법3 */
        double result = (double)x / (double)y;
        
        // (double)(x / y)는 x / y가 먼저 수행되어 0이 산출되고, 이를 double로 변환한다는 의미이므로 적절하지 않음.
        ```
### OperationPromotionExample.java 예제 참고
- Java에서 \+ 연산자는 두 가지 기능을 갖고 있다.
  - 피연산자가 <u>모두 숫자</u>인 경우 : <u>덧셈 연산</u>
  - 피연산자 중 <u>하나가 문자열</u>인 경우 : <u>결합 연산</u>
- 결합 연산 시, 문자열이 아닌 다른 피연산자는 문자열로 promotion되어 수행된다!
  ```java
  int value = 3 + 7;     // int value = 10;
  String str = "3" + 7;  // String str = "3" + "7"; (7이 promotion) -> String str = "37";
  String str = 3 + "7";  // String str = "3" + "7"; (3이 promotion) -> String str = "37";
  ```
- 연산식에서 + 연산자가 연이어 나오면, 앞에서부터 순차적으로 연산을 수행
- 먼저 수행된 연산이 덧셈 연산이라면, 그 결과를 가지고 다음 + 연산을 수행한다
- **먼저 수행된 연산이 결합 연산이라면, 이후의 + 연산도 모두 결합 연산이 된다!**
  ```java
  int value = 1 + 2 + 3;      // int value = 3 + 3; -> int value = 6;
  String str = 1 + 2 + "3";   // String str = 3 + "3" -> String str = "33";
  String str = 1 + "2" + 3;   // String str = "12" + 3 -> String str = "123";
  String str = "1" + 2 + 3;   // String str = "12" + 3 -> String str = "123";
  ```
- 순차적으로 연산을 수행하지 않고 특정 부분을 우선 연산하고 싶다면 ()로 감싼다
- **()는 항상 최우선으로 연산을 수행한다**
  ```java
  String str = "1" + (2 + 3);  // String str = "1" + 5; -> String str = "15";
  ```
### StringConcatExample.java 예제 참고