# 연산자 (Operator)
- 부호/증감 연산자 : +, -, ++, --
- 산술 연산자 : +, -, *, /, %
- 비교 연산자 : ==, !=, <, <=, >, >=
- 논리 연산자 : &&, &, ||, |, ^, !
- 비트 논리 연산자 : &, |, ^, ~
- 비트 이동 연산자 : <<, >>, >>>
- 대입 연산자 : =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
- 삼항(조건) 연산자 : ?:
## 연산의 방향과 우선순위
<table>
  <tr>
    <th>연산자</th>
    <th>연산 방향</th>
    <th>우선순위</th>
  </tr>
  <tr>
    <td>증감(++, --), 부호(+, -), 비트(~), 논리(!)</td>
    <td><----------</td>
    <td rowspan="13" style="text-align: center;">높음<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>낮음</td>
  </tr>
  <tr>
    <td>산술(*, /, %)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>산술(+, -)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>쉬프트(<<, >>, >>>)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>비교(<, >, <=, >=, <u>instanceof</u>)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>비교(==, !=)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>논리(&)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>논리(^)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>논리(|)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>논리(&&)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>논리(||)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>조건(?:)</td>
    <td>----------></td>
  </tr>
  <tr>
    <td>대입(=, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=)</td>
    <td>----------></td>
  </tr>
</table>

### 괄호()로 묶으면 '최우선' 순위를 갖게 된다!
### 비교 연산자 中 'instanceof'?
- 객체가 특정 클래스나 인터페이스의 인스턴스인지 여부를 확인하는 데 사용.
- 주로 객체의 타입을 확인하고 타입 캐스팅을 안전하게 수행하기 위해 사용.
- 왼쪽 피연산자가 오른쪽에 지정된 클래스나 인터페이스 타입과 일치하면 true를, 그렇지 않으면 false를 반환.
  ```java
  if (object instanceof ClassName) {
      // object가 ClassName의 인스턴스인 경우 실행할 코드
  }
  ```
- OOP 개념을 배운 후 다시 확인해볼 것!