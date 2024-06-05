## 문자열을 기본 타입으로 변환
- 문자열과 기본 타입을 서로 변환하는 경우는 매우 많이 발생함 
### String -> Primitive type
- `자료형(맨 앞자리 대문자)`.parse`자료형(맨 앞자리 대문자)`(`문자열`)
- int는 Integer임에 주의!
  
  | 변환 타입 | 사용 예시                                                                 |
  | --- |-----------------------------------------------------------------------|
  | String -> byte | ``String str = "10";``<br>``byte value = Byte.parseByte(str);``       |
  | String -> short | ``String str = "200";``<br>``short value = Short.parseShort(str);``   |
  | String -> int | ``String str = "300000";``<br>``int value = Integer.parseInt(str);``  |
  | String -> long | ``String str = "40000000000";``<br>``long value = Long.parseLong(str);`` | 
  | String -> float | ``String str = "12.345";``<br>``float value = Float.parseFloat(str);`` |
  | String -> double | ``String str = "12.345";``<br>``double value = Double.parseDouble(str);`` |
  | String -> boolean | ``String str = "true";``<br>``boolean value = Boolean.parseBoolean(str);`` |
### Primitive type -> String
- `String str = String.valueOf(primitiveType)`
### PrimitiveAndStringConversionExample.java 예제 참고