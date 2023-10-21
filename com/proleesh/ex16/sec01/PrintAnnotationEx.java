package com.proleesh.ex16.sec01;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationEx {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method[] declaraedMethods = Service.class.getDeclaredMethods();
        for(Method method : declaraedMethods){
            // PrintAnnotation 얻기
            PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
            // 설정 정보를 이용해서 선 출력
            printLine(printAnnotation);
            // 메서드 호출
            method.invoke(new Service());

            // 설정 정보를 이용해서 선 출력
            printLine(printAnnotation);
        }
    }

    public static void printLine(PrintAnnotation printAnnotation) {
        int number = printAnnotation.number();
        for (int i = 0; i < number; i++) {
            String value = printAnnotation.value();
            System.out.print(value);
        }
        System.out.println();
    }
}
