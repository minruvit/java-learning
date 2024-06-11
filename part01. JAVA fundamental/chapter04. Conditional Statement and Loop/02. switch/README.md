## switch
- '변수의 값'에 따라서 실행문이 결정된다.
- 같은 기능의 if문 보다 코드가 간결해짐.
```java
switch(변수) {
    case 값1:
        (변수가 값1일 경우)
        ...
        break;
    case 값2:
        (변수가 값2일 경우)
        ...
        break;
    default:
        (변수가 값1, 값2 모두 아닐 경우)
        ...
}
```
- 괄호 안의 변수값에 따라 해당 case로 가서 실행문을 실행.
- 변수값과 동일한 값을 갖는 case가 없으면 `default`로 가서 실행문을 실행.
- `default`가 필요없다면 생략 가능
#### SwitchExample.java 예제 참고
### break
- case 끝에 있는 `break;`는 다음 case를 실행하지 않고 switch 문을 빠져나가기 위해 필요함.
- 만약 `break`가 없다면, 다음 case들이 값과 상관없이 연달아 실행된다!
  - ※ 이는 switch가 **fall-through** 형태로 동작하기 때문이다. 괄호 안의 변수가 해당하는 `case`로 간 후, 그 블록부터 무엇이 됐건 쭉 실행시키기 때문에, 제어문처럼 활용하기 위해선 break가 필요한 것!
#### SwitchNoBreakCaseExample.java 예제 참고
### 괄호 안의 변수 타입
- switch 문의 괄호에는 정수 타입(byte, char, short, int, long)과 <u>문자열 타입(String)</u> 변수를 사용할 수 있다.
#### SwitchCharExample.java 예제 참고
### Expressions (표현식) (java 12+)
- break 문을 없애는 대신, '화살표'와 '중괄호' 사용 => 가독성이 좋아짐
#### SwitchExpressionsExample.java 예제 참고
- 스위치된 값을 변수에 바로 대입할 수도 있다.
  - 단일 값일 경우, 화살표 오른쪽에 값을 기술
  - 중괄호를 사용할 경우, `yield` 키워드(java 13+)로 값을 지정
    - 이 경우에는 `default`가 반드시 존재해야함!
  ```java 13
  type var = switch (grade) {
      case "값1" -> 변수값;
      case "값2" -> {
          ...;
          yield 변수값;
      }
      default -> 변수값;
  };    // 끝에 반드시 ; 붙이기!
  ```
#### SwitchValueExample.java 예제 참고
