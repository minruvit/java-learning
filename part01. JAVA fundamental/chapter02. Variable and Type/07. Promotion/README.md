## 자동 타입 변환(Promotion)
- 자동으로 타입 변환이 일어나는 것.
- <u>값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 대입될 때 발생</u>한다.
- byte < short, char < int < long < float < double
- 자동 타입 변환이 일어나는 예시
  ```java
  byte byteValue = 10;
  int intValue = byteValue;     // Promotion
  ```
- 정수 타입이 실수 타입으로 대입될 경우에는 무조건 자동 타입 변환됨.
  ```java
  long longValue = 5000000000L;
  float floatValue = longValue;     // 5.0E9F로 저장됨
  double doubleValue = longValue;   // 5.0E9로 저장됨
  ```
- char 타입의 경우 int 타입으로 자동 타입 변환되면 매핑되는 <b>'유니코드 값'</b>이 int 타입에 대입됨.
  ```Java
  char charValue = 'A';
  int intValue = charValue;     // 65가 저장됨
  ```
- 메모리에서 값이 복사되는 모양
  - 기존 byte 타입(1byte)의 변수에 '10'이 저장돼있을 때
  
    | 00001010 |
    | --- |
  - 이 변수를 int 타입(4byte)에 대입하면..

    | 00000000 | 00000000 | 00000000 | <u>00001010</u> |
    | --- | --- | --- |-----------------|

- 예외 : byte는 char보다 범위가 작아도 자동 타입 변환될 수 없다. -> 부호의 유무 차이
### 범위가 작은 정수 -> 범위가 큰 정수 -> 실수
### PromotionExample.java 예제 참고