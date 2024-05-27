package ch02.sec02;

public class ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
        // byte var6 = 128;    // incompatible types: possible lossy conversion from int to byte
        // short var7 = 32768; // incompatible types: possible lossy conversion from int to short

        /* 콘솔에 변수에 저장된 값 출력 */
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }
}
