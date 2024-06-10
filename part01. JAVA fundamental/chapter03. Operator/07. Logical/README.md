## 논리 연산자
- 논리곱(AND, &&), 논리합(OR, ||), 배타적 논리합(XOR, ^), 논리 부정(NOT, !) 연산을 수행
- 흐름 제어문인 조건문(if), 반복문(for, while) 등에서 주로 이용
- 논리 연산자 종류

<div style="margin-left: 26px;">
    <table>
        <tr>
            <th>구분</th>
            <th colspan="3">연산식</th>
            <th>결과</th>
            <th>설명</th>
        </tr>
        <tr>
            <td rowspan="4">AND<br>(논리곱)</td>
            <td>true</td>
            <td rowspan="4">&& 또는 &</td>
            <td>true</td>
            <td>true</td>
            <td rowspan="4">피연산자 모두가 true일 경우에만<br>연산 결과가 true</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>false</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td rowspan="4">OR<br>(논리합)</td>
            <td>true</td>
            <td rowspan="4">|| 또는 |</td>
            <td>true</td>
            <td>true</td>
            <td rowspan="4">피연산자 중 하나만 true이면<br>연산 결과는 true</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td rowspan="4">XOR<br>(배타적 논리합)</td>
            <td>true</td>
            <td rowspan="4">^</td>
            <td>true</td>
            <td>false</td>
            <td rowspan="4">피연산자가 하나는 true이고<br>다른 하나가 false일 경우에만<br>연산 결과가 true</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>true</td>
            <td>true</td>
        </tr>
        <tr>
            <td>false</td>
            <td>false</td>
            <td>false</td>
        </tr>
        <tr>
            <td rowspan="2">NOT<br>(논리 부정)</td>
            <td rowspan="2"> </td>
            <td rowspan="2">!</td>
            <td>true</td>
            <td>false</td>
            <td rowspan="2">피연산자의 논리값을 바꿈</td>
        </tr>
        <tr>
            <td>true</td>
            <td>false</td>
        </tr>
    </table>
</div>

- &&, || vs &, |
  - &&와 &는 산출 결과는 같지만 연산 과정이 조금 다름.
  - &&는 앞의 피연산자가 false라면 뒤의 피연산자를 평가하지 않고 바로 false 산출.
  - &는 두 피연산자를 무조건 모두 평가해서 결과를 산출함.
  - -> &&가 &보다 더 효율적으로 동작!
  - ||, |도 마찬가지이다.
### LogicalOperatorExample.java 예제 참고
