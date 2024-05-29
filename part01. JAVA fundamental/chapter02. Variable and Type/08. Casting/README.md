## 강제 타입 변환(Casting)
- 강제로 다른 타입으로 변환하는 것
- 캐스팅 연산자로 괄호()를 사용, 괄호 안에 들어가는 타입은 '변환할 타입'
- 작은 범위 타입을 큰 범위 타입으로 casting : 확대 변환(widening conversion)
- 큰 범위 타입을 작은 범위 타입으로 casting : 축소 변환(narrowing conversion)
  - 축소 변환의 경우 데이터의 손실이 발생할 수 있다.
#### 이 장에서는 narrowing conversion을 다룹니다!
### 부호 있는 정수 타입
```java
int intValue = 10;
byte byteValue = (byte)intValue;    // casting
```
- 메모리에서 값이 복사되는 모양
  - intValue

    | 00000000 | 00000000 | 00000000 | 00001010 |
    |--------------|--------------|--------------|----------|
  - (byte)intValue

    | ~~00000000~~ | ~~00000000~~ | ~~00000000~~ | 00001010 |
    |--------------|--------------|--------------|----------|
  - intValue의 앞 3byte는 삭제되고 뒤 1byte가 byteValue로 대입.
  - byteValue
    
    | 00001010 |
    |--- |
- 위 경우는 원래 값 10이 byte의 범위에 있으므로 원래 값이 보존된다.
- but, byte의 범위를 벗어나는 값이 casting되는 경우?
  ```java
  int intValue = 103029770;
  byte byteValue = (byte)intValue;
  ```
  - intValue
    
    | 00000110 | 00100100 | 00011100 | 00001010 |
    | --- | --- | --- | --- |
  - (byte)intValue

    | ~~00000110~~ | ~~00100100~~ | ~~00011100~~ | 00001010 |
    |--------------|--------------|--------------|----------|
  - intValue의 앞 3byte는 삭제되고 뒤 1byte가 byteValue로 대입.
  - byteValue

    | 00001010 |
    |----------|
- 위 경우는 원래 값이 보존되지 않고 맨 뒤 1byte의 값만 유지(-128 ~ 127)되어 byte 변수에 대입된다.
- 그러면, casting 후 보존된 맨 앞 bit(부호비트)가 1이면?
  ```java
  int intValue = 3054;        // ~~~ 00001011 11101110
  byte byteValue = intValue;  // 11101110
  ```
  - byteValue를 출력해보면, -18이 나온다!
#### int -> byte, int -> short, long -> byte, long -> short 등..
### 부호 있는 정수 타입 -> char
- 주의할 점은 char 타입의 허용 범위인 0~65535 사이의 값(뒤 2byte)만 원래 값을 유지한다!
#### short -> char
- short과 char는 byte의 크기는 같으나 부호의 유무 차이가 있다.
- short은 맨 앞 bit가 부호 bit인 반면, char의 맨 앞 bit는 값과 관련돼있다.
- 음수가 저장된 short(부호 bit가 1)을 char로 casting하면?
  ```java
  short shortValue = -30000;            // 10001010 11010000
  char charValue = (char)shortValue;    // 10001010 11010000
  ```
  - 2진수 10001010 11010000 (35536)을 short 타입의 변수에 저장하면 10진수 -30000
  - char 타입 변수에 저장하면 10진수 35536으로서 저장된다.
  - 출력해보면 shortValue는 -30000, charValue는 諐를 출력한다.
### 실수 -> 정수
```java
double doubleValue = 3.14;
int intValue = (int)doubleValue;  // 정수 부분인 3만 저장
 ```
- 실수 타입은 정수 타입보다 항상 큰 허용 범위를 가진다.
- 대상 정수 타입으로 casting 해야한다.
- **소수점이하 부분은 버려지고, 정수 부분만 저장된다.**
### double -> float
```java
double doubleValue = 3.141592;
float floatValue = (float)doubleValue;
```
- 지수부(E)는 double의 기저인 1023을 뺀 후 float의 기저인 127을 더한다.
- 가수부(M)은 double의 가수부 52자리 중 23자리만 저장되고 나머지는 버려진다.
  - 가수부의 24번째 자리 값이 1이라면 반올림이 발생하여 23번째 자리의 값이 1 증가한다.
- float 타입의 범위를 초과하는 값을 float으로 형변환하는 경우, '무한대' 또는 '+-0'을 결과로 얻는다.
- 출처 : [https://devroy.tistory.com/9](https://devroy.tistory.com/9)
### CastingExample.java 예제 참고
### 여기까지 살펴본 내용들로 말미암아, 변수 타입은 저장된 일련의 bit들을 '읽는 방식'과 관련이 있음을 알 수 있다!
### Promotion vs Casting : 자동적이냐, 강제적이냐?
### 다음 절에서 Widening conversion을 다룹니다.