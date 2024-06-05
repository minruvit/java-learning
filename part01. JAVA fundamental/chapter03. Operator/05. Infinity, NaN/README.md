## 나눗셈 연산 후 NaN, Infinity
- 나눗셈`/` 또는 나머지`%` 연산에서 좌측 피연산자가 정수이고 우측 피연산자가 0일 경우,<br>
  => 예외 `ArithmeticException`이 발생.
  ```java
  5 / 0 -> 예외 발생
  5 % 0 -> 예외 발생 
  ```
- 좌측 피연산자가 실수이거나, 우측 피연산자가 0.0 or 0.0f인 경우,<br>
  => 예외는 발생하지 않음<br>
  => 그러나, 연산의 결과가 `Infinity` 혹은 `NaN`(Not a Number)이 된다!
- `Infinity` 혹은 `NaN` 상태에서 어떤 연산을 하더라도 결과는 계속해서 그대로 유지된다.
   ```java
   Infinity + 2 -> infinity
   NaN + 2 -> NaN
   ```
- `/`와 `%`의 결과가 `Infinity` 혹은 `NaN`인지 먼저 확인하고 다음 연산을 수행하는 것이 권장된다!
- `Double.isInfinite()`, `Double.isNaN()`을 사용
- `Infinity` 혹은 `NaN`인 경우 true를, 아니라면 false를 반환
  ```java
  boolean result = Double.isInfinite(변수);
  boolean result = Double.isNaN(변수);
  ```
### InfinityAndNaNCheckExample.java 예제 참고
