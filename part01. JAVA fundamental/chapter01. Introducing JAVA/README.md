# Chapter 01. 자바 시작하기
## 기계어, 프로그래밍 언어
### 기계어
- Binary code : 101101010...
- 사람이 이해하기에 어렵다.
- 반대로, 사람의 언어는 컴퓨터가 이해하기에 어렵다.
### 프로그래밍 언어
- 고급 언어, 저급 언어로 구분
#### 저급 언어
- 기계어에 가까운 언어
- Assembly Language
#### 고급 언어
- 사람이 쉽게 이해할 수 있는 언어
- compile 과정을 통해 기계어로 변환됨
- JAVA, C, C++, C#, Python ...
#### -> 프로그래밍 언어로 된 source 파일은 컴파일러를 거쳐, 기계어로 변환된 후 실행됨
## JAVA
- 1995년 Sun Microsystems에서 처음 발표됨
- 가장 성공한 프로그래밍 언어 中 하나
- 다양한 분야에서 사용됨
- Oracle이 라이선스를 갖고 있으며, JDK(Java Development Kit)를 배포하며 기술적 지원 중
### 중요한 특징
1. 모든 OS에서 실행 가능 : JVM
2. OOP(객체지향 프로그래밍)
3. 메모리 자동 정리
4. 방대한 OSL(Open Source Library)
### JDK
- Java Development Kit
- Java SE(Standard Edition)의 구현체
- Licence에는 Open JDK, Oracle JDK가 있음
- Open JDK vs Oracle JDK

| 구분 | OpenJDK | Oracle JDK |
| --- | --- | --- |
| Licence | GNU GPL version2 | Oracle Technology Network License |
| 사용료 | X | 개발 및 학습용 : X, 상업용 : 유료|
| 개발 소스 공개 의무 | X | X |
| 응답성, JVM 성능, 안정성 비교 | 떨어짐 | 뛰어남 |
| 비용 비교 | 저렴함 | 비쌈 |
| 다운로드 | [jdk.java.net](#https://jdk.java.net)<br>[adoptium.net](#https://adoptium.net) (LTS 제공) | [oracle.com/java/technologies/downloads](#https://oracle.com/java/technologies/downloads)
- LTS : Long Term Support. 다른 버전보다 안정적으로 사용 가능
- LTS 제공 version : JDK 8, JDK 11, JDK 17, JDK 21
### compile부터 실행까지
1. Java 언어로 Source 파일(.java) 작성
2. java compiler에서 .java 파일을 컴파일하여 ByteCode 파일(.class)을 생성
3. JVM에서 ByteCode 파일을 특정 OS가 이해하는 기계어로 번역 및 실행
- .java 파일 = Text / .class 파일 = Binary
- JVM(Java Virtual Machine, 자바 가상 머신) : ByteCode 파일을 기계어로 번역하고 실행시킴
- `javac` 명령어로 compile. : Source 파일 -> ByteCode 파일 생성
- `java` 명령어로 JVM을 가동하고 ByteCode 파일 -> 기계어 번역 및 실행
- ByteCode 파일은 OS와 관계없이 같은 내용으로 생성된다.
- ByteCode 파일에서 기계어로의 번역은 실행시키는 OS에 따라 달라져야 한다.<br>
즉, JVM은 OS별로 다르다!
#### ByteCode : OS 상관 없이 같음. / JVM : OS에 따라 상이함.
### 버전 언급 시 용어 정리
- Java n : 일반적인 Java 버전 언급
- JDK n : 개발 도구에 중점
- JRE n : 실행 환경에 중점
- Java SE-n : 스펙 내용에 중점
- Java SE(Java Standard Edition) : 자바 개발에서부터 실행까지의 모든 환경을 정의한 스펙.
## 실습 환경 구축
### JDK 설치
- Oracle JDK 21 내려받기 및 설치
### 환경 변수
- 프로그램들이 실행되면서 OS가 사용할 수 있는 값들
- 프로그램(ex. IDE)들이 JDK을 쉽게 사용할 수 있도록, 설정해주는 것이 권장됨
- 일반적으로 **JAVA_HOME** 이름으로 사용
- (Windows) 명령 프롬프트, 파워쉘과 같은 terminal에서 명령어를 입력하면, **Path** 환경 변수에 등록된 경로들의 순서대로 외부 명령, executable 프로그램, batch 파일을 찾는다
- `java`, `javac`와 같은 JAVA 명령어(실행 파일)들은 \bin에 위치해있다
- 보편적인 환경 변수 세팅 과정 (Windows 기준)
1. 환경 변수 편집창 진입
2. [시스템 변수] 항목에 [변수 이름]은 **JAVA_HOME**, [변수 값]은 **JDK 설치 경로**로 입력하여 새로운 환경 변수 생성
<br>-> `%JAVA_HOME%`으로서 환경 변수의 값에 접근 가능하게 된다.
3. [시스템 변수] 항목의 **Path** 환경 변수 편집창 진입
4. **%JAVA_HOME%\bin**을 입력 및 생성 후, 상위 순서로 올려줌
<br>-> **JDK 설치 경로\bin** 와 같은 의미가 된다.
5. terminal을 새로 시작 후, `java -version`, `javac -version` 명령어를 실행하여 제대로 출력되는지 확인
#### ※ 이를 응용하면 여러 version의 JDK을 필요에 따라 바꾸어 사용할 수 있다.
### IDE 설치
- JDK 21을 지원하는 버전의 Eclipse IDE 내려받기 및 설치