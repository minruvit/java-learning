# Compiling without IDE, Package
## Package
- JAVA는 source 파일 및 컴파일된 ByteCode 파일을 쉽게 관리 하기 위해 **Package**를 사용
- ``package pack.age;``와 같은 형식으로 패키지 선언
- File System의 Directory와 비슷한 개념
- project_base\pack\age 경로에 source파일들이 저장 : source 파일이 저장되는 directory
- 패키지 선언이 포함된 source 파일을 컴파일하면, .class파일을 저장할 directory 아래에 패키지 선언한대로의 구조로 .class 파일이 생성됨
- project_base<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-- pack<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-- age<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--Hello.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-- out<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-- pack<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--age<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-- Hello.class
  - IntelliJ IDEA의 경우 위처럼 'out'폴더 아래에 컴파일 결과물들(.class 포함)을 저장하여 관리한다.
  - Eclipse IDE의 경우에는 소스 파일들은 'src' 폴더 아래에, 컴파일 결과물들은 'bin'폴더 아래에 저장하여 관리한다.
## Compiling without IDE, Package 실습
#### ※ Eclipse IDE가 source 및 bytecode 파일들을 관리하는 방식으로 진행해본다.
1. terminal을 실행한 후 현재 경로를 project_base로 이동한다.
2. directory tree를 아래와 같이 구성한다.<br>
project_base<br>
&nbsp;&nbsp;|-- src<br>
&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|-- ch01<br>
&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|--sec06<br>
&nbsp;&nbsp;|-- bin<br>
- 여기서 project_base directory는 실제로는 project root가 된다.
3. project_base\src\ch01\sec06에 Hello.java를 작성한다.
- .java source 파일은 Text 파일이므로, 아무 Text Editor를 사용하여 작성해도 무방하다.
4. 아래의 명령어를 실행하여 source 파일을 ByteCode 파일로 컴파일 및 생성한다.
````
javac -d bin src/ch01/sec06/Hello.java
````
- 경로 입력 시 "/"임에 주의하라
- `javac` 명령어의 `-d`옵션은 ByteCode 파일을 다른 경로에 저장할 때 사용한다.
- `javac -d [바이트코드파일저장위치] [소스경로/*.java]`
5. bin에 package directory와 ByteCode 파일이(ch01\sec06\Hello.class) 생성됐음을 확인한다.
6. 아래의 명령어를 실행하여 JVM으로 ByteCode 파일을 기계어로 번역 및 실행시킨다.
````
java -cp bin ch01.sec06.Hello
````
- 패키지 구분자로 .을 사용하고, 클래스명은 .class를 제외하고 Hello만 입력해야함에 주의
- `java` 명령어의 `-cp` 옵션은 'class search path'의 줄임말
- `java -cp [바이트코드파일위치] [패키지...클래스명]`
7. 콘솔에 Hello, Java가 출력됨을 확인한다.
### 상위 패키지와 하위 패키지를 구분짓는 기호는 dot(.)이다.
### 패키지 선언은 Bytecode 파일이 위치할 곳을 지정하는 것이다.
### -> 패키지 선언부와 명령어, 컴파일, 실행 시 그에 따른 directory 및 파일이 어떻게 생성되는지 주목할 것
### ※ 이후의 실습 코드들은 package를 생략하도록 함!