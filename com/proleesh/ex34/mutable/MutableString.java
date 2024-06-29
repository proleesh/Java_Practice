package com.proleesh.ex34.mutable;

/**
 * StringBuilder 와 StringBuffer 의 차이점은 후자는 멀티쓰레드 환경에서 Thread 안전하고, 하지만 실행 효율성이 떨어짐
 * StringBuilder 은 멀티쓰레드가 아닌경우에 사용한다.
 */
public class MutableString {
    public static void main(String[] args) {
        var str = new StringBuilder("Hello ");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str.append("Java");
        System.out.println(str);

        System.out.println(System.identityHashCode(str));
        str.append(", Great!");
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
    }
}
