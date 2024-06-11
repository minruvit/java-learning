## if
- '조건식'의 결과에 따라 블록 실행 여부가 결정된다.
- 조건식에는 true 또는 false 값을 산출할 수 있는 연산식, boolean 변수가 올 수 있다.
- 조건식이 true면 블록을 실행, false면 실행하지 않는다.
- 중괄호 {} 블록 내에 실행문이 하나밖에 없으면 중괄호 생략 가능. (but 생략하지 않는 것을 권장)
```java
if ( 조건식 ) {
    실행문;
    실행문;
    ...
}

if ( 조건식 )
    실행문;
```
### IfExample.java 예제 참고
## else
- 조건문의 조건식이 false이면 else 문 블록이 실행된다.
- if 문을 두 개 이용하는 것보다 else 문을 활용하는 것이 더욱 간결한 코딩이 됨.
```java
if ( 조건식 ) {
    (조건식이 true이면 실행)
    실행문;
    실행문;
    ...
} else {
    (조건식이 false이면 실행)
    실행문;
    실행문;
    ...
}
```
### IfElseExample.java 예제 참고
## else if
- 상위 조건문의 조건식이 false일 경우 이 블록이 평가됨.
- 조건식이 true이면 해당 블록이 실행.
- else if의 수는 제한이 없다
- 여러 개의 조건식 중 true가 되는 else if 블록만 실행, 전체 조건문을 벗어난다.
- 마지막에는 else 블록을 추가할 수 있다.
  - 모든 조건문의 조건식이 false일 경우 실행.
```java
if ( 조건식1 ) {
    (조건식1이 true)
    실행문;
    실행문;
    ...
} else if ( 조건식2 ) {
    (조건식2가 true)
    실행문;
    실행문;
    ...
} else {
    (조건식1 및 조건식2가 false)
    실행문;
    실행문;
    ...
}
```
### IfElseIfElseExample.java 예제 참고
### IfDiceExample.java 예제 참고
## 중첩 if 문
- if 문의 블록 내부에는 또 다른 if 문을 사용할 수 있다.
- 중첩의 단계는 제한이 없다.
- 프로그램 작성 및 분석을 어렵게 만드는 요소 중 하나이다.
```java
if ( 조건식1 ) {
    if ( 조건식2 ) {

        }else{

        }
        }
        }
        }
```
### IfNestedExample.java 예제 참고