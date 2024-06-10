## 비트 논리 연산자
- bit 단위로 논리 연산을 수행
- 0과 1이 피연산자가 됨. => 2진수 0과 1로 저장되는 <u>'정수' 타입(byte, short, int, long)만 피연산자가 될 수 있다</u>
- 비트 논리 연산자 종류
  <table>
    <tr>
      <th>구분</th>
      <th colspan="3">연산식</th>
      <th>결과</th>
      <th>설명</th>
    </tr>
    <tr>
      <td rowspan="4">AND<br>(논리곱)</td>
      <td>1</td>
      <td rowspan="4">&</td>
      <td>1</td>
      <td>1</td>
      <td rowspan="4">두 bit 모두 1일 경우에만<br>연산 결과는 1</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>1</td>
      <td>0</td>
    </tr>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>0</td>
    </tr>
    <tr>
      <td rowspan="4">OR<br>(논리합)</td>
      <td>1</td>
      <td rowspan="4">|</td>
      <td>1</td>
      <td>1</td>
      <td rowspan="4">두 bit 중 하나라도 1이면<br>연산 결과는 1</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>1</td>
    </tr>
    <tr>
      <td>0</td>
      <td>1</td>
      <td>1</td>
    </tr>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>0</td>
    </tr>
    <tr>
      <td rowspan="4">XOR<br>(배타적 논리합)</td>
      <td>1</td>
      <td rowspan="4">^</td>
      <td>1</td>
      <td>0</td>
      <td rowspan="4">두 bit 중 하나만 1이고<br>다른 하나는 0일 경우<br>연산 결과는 1</td>
    </tr>
    <tr>
      <td>1</td>
      <td>0</td>
      <td>1</td>
    </tr>
    <tr>
      <td>0</td>
      <td>1</td>
      <td>1</td>
    </tr>
    <tr>
      <td>0</td>
      <td>0</td>
      <td>0</td>
    </tr>
    <tr>
      <td rowspan="2">NOT<br>(논리 부정)</td>
      <td rowspan="2"> </td>
      <td rowspan="2">~</td>
      <td>1</td>
      <td>0</td>
      <td rowspan="2">보수</td>
    </tr>
    <tr>
      <td>0</td>
      <td>1</td>
    </tr>
  </table>

- 비트 논리 연산의 과정
  - ex) 45, 25 간의 비트 논리 연산
    - 45
    
      | 0 | 0 | 1 | 0 | 1 | 1 | 0 | 1 |
      | --- | --- | --- | --- | --- | --- | --- | --- |
    - 25

      | 0 | 0 | 0 | 1 | 1 | 0 | 0 | 1 |
      | --- | --- |---|---| --- |---| --- | --- |
    - 비트 논리곱(&) 연산
      <table>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">&</td>
        </tr>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">=</td>
        </tr>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">9</td>
        </tr>
      </table>
    - 비트 논리합(|) 연산
      <table>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">|</td>
        </tr>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">=</td>
        </tr>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">61</td>
        </tr>
      </table>
    - 비트 배타적 논리합(^) 연산
      <table>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">^</td>
        </tr>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">=</td>
        </tr>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>0</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">52</td>
        </tr>
      </table>
    - 45의 비트 논리 부정(~) 연산
      <table>
        <tr>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">~</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">=</td>
        </tr>
        <tr>
          <td>1</td>
          <td>1</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
          <td>0</td>
          <td>1</td>
          <td>0</td>
        </tr>
        <tr style="text-align: center;">
          <td colspan="8">-46</td>
        </tr>
      </table>
      - 최상위 비트가 1이면 음수!
- 비트 논리 연산자는 byte, short, char 타입 피연산자를 int 타입으로 자동 변환 후 연산을 수행
  <br>=> 따라서, 연산 결과도 int 변수에 대입 해야함
  ```java
  byte num1 = 45;
  byte num2 = 25;
  // byte result = num1 & num2;    // 컴파일 에러
  int result = num1 & num2;
  ```
- 비트 논리 연산이 사용되는 예로, C언어의 uint8_t 타입과 java의 byte 타입 간의 데이터 통신 등이 있다.

### BitLogicExample.java 예제 참고
