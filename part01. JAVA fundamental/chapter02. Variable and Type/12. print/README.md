## 콘솔로 변수값 출력
- ``System.out.println()``, ``System.out.print()``, ``System.out.printf()``
- 모니터(명령 프롬프트, 터미널, 콘솔 등)에 값을 출력하기위해 사용하는 메소드들
- 각 메소드들의 의미

  | 메소드 | 의미                                 |
  | --- |------------------------------------|
  | ``System.out.println(내용);`` | 괄호 안의 내용을 출력하고, <u>행을 바꿔라.</u>     |
  | ``System.out.print(내용);`` | 괄호 안의 내용을 출력하고, <u>행은 바꾸지 않는다.</u> |
  | ``System.out.printf(내용);`` | <u>형식 문자열</u>에 맞추어 값을 출력하라.        |
- ``System.out.printf()``
  - printf의 'f'는 'format'의 의미
  - ``System.out.printf("형식문자열", 값1, 값2, ...)``
    - 형식 문자열 : ``%[argument_index$] [flags] [width] [.precision] conversion``
      - `%`, `conversion`은 필수로 작성, 그 외의 항목들은 생략 가능
      - `%` : 형식 문자열의 시작을 뜻함.
      - `conversion` : d(정수), f(실수), s(문자열)
      - `argument_index$` : 값의 순번. 형식 문자열에 포함될 값이 두 개 이상일 경우 포함.
        - ex) 1$ : 첫 번째 값, 2$ : 두 번째 값
      - `flags` : 빈 공간을 채우는 방법.
        - 생략 시 : 왼쪽이 공백으로 채워짐
        - \- : 오른쪽이 공백으로 채워짐
        - 0 : 공백 대신 0으로 채워짐
        - 오른쪽을 0으로 채우는 flag는 없음.
      - `width` : <u>소수점을 포함</u>한 전체 자릿수
      - `.precision` : 소수 이하 자릿수
      - 자주 사용되는 형식 문자열
        
        | 형식화된 문자열 | | 설명 | 출력 형태                                |
        | --- | --- | --- |--------------------------------------|
        | 정수 | %d<br>%6d<br>%-6d<br>%06d | 정수<br>6자리 정수. 왼쪽 빈자리 공백<br>6자리 정수. 오른쪽 빈자리 공백<br>6자리 정수. 왼쪽 빈자리 0채움 | 123<br>\_\_\_123<br>123___<br>000123 |
        | 실수 | %10.2f<br>%-10.2f<br>%010.2f | 정수 7자리 + 소수점 + 소수 2자리. 왼쪽 빈자리 공백<br>정수 7자리+소수점+소수 2자리. 오른쪽 빈자리 공백<br>정수 7자리+소수점+소수 2자리. 왼쪽 빈자리 0 채움 | \_\_\_\_123.45<br>123.45____<br>0000123.45 |
        | 문자열 | %s<br>%6s<br>%-6s | 문자열<br>6자리 문자열. 왼쪽 빈자리 공백<br>6자리 문자열. 오른쪽 빈자리 공백 | abc<br>\_\_\_abc<br>abc___ |
        | 특수 문자 | \t<br>\n<br>%% | 탭(tab)<br>줄바꿈<br>% | <br><br>% |
### PrintfExample.java 예제 참고