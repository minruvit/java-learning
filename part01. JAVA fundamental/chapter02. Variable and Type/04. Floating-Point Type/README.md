## 실수 타입의 기초
- 실수 타입에는 float과 double이 있다.
- 실수 타입의 메모리 할당 크기, 저장되는 값의 범위

  | 타입    | 메모리 크기(byte) | 메모리 크기 (bit) | 저장되는 값의 허용 범위(양수 기준)       | 유효 소수 이하 자리 |
  |:------|:-------------|:-------------|:---------------------------|:------------|
  | float | 4byte        | 32bit        | 1.4\*10^-45 ~ 3.4\*10^38   | 7자리         |
  | double | 8byte        | 64bit        | 4.9\*10^-324 ~ 1.8\*10^308 | 15자리        |

- JAVA는 [IEEE 754 표준](https://en.wikipedia.org/wiki/IEEE_754)에 근거하여 float, double 타입의 값을 부동 소수점(floating-point) 방식으로 메모리에 저장한다.
- float 타입과 double 타입은 가수와 지수를 저장하기 위해 전체 bit를 다음과 같이 나누어 사용한다.
  #### +  m  x  10^n (+ = 부호, m = 가수, n = 지수)
  | 구분 | 부호 | 지수(mantissa) | 가수(exponent) |
  | --- | --- |--------------|--------------|
  | float | 1bit | 8bit | 23bit |
  | double | 1bit | 11bit | 52bit |
- 최상위 1bit는 양수 및 음수를 결정짓는 부호로, 0이면 양수, 1이면 음수가 된다.
- double이 float보다 지수와 가수 부분의 bit 수가 더 크므로, 더 크고 정밀한 실수를 저장할 수 있다.
  - double이라는 이름 또한 float에 비해 약 2배의 정밀도를 갖는다는 의미로 붙여짐.
## 실수 리터럴 작성법
### 컴파일러는 실수 리터럴을 기본적으로 'double' 타입으로 해석하므로, double 타입 변수에 대입해야한다.
- 10진수 리터럴
  ```java
  double x = 0.25;
  double y = -3.14;
  ```
- e 또는 E가 포함된 10의 거듭제곱 리터럴
  ```java
  double x = 5e2;       // 5.0 x 10^2 = 500.0
  double y = 0.12E-2    // 0.12 x 10^-2 = 0.0012
  ```
### float 타입에 대입하고 싶다면 리터럴 뒤에 'f' 혹은 'F'를 붙여 컴파일러에게 float타입임을 알려야한다.
  ```java
  float var = 3.14f;
  float var = 3E6F;
  ```

### FloatDoubleExample.java 예제 참고