package com.proleesh.ex34.arraybasic;

/**
 * 정적 배열과 동적 배열을 동시에 사용하지 마세요
 * 예를 들어, 동적으로 배열의 길이를 지정한 뒤
 * 또 그 동적으로 생성한 배열에 값을 넣은 작업은 하지 마세요
 * 안좋은 습관이에요
 * 안좋은 예시:
 * String[] strArr = new String[5];
 * strArr[0] = "안녕"; 이런식으로 하지 마세요
 *
 * 그리고 배열이 만약에 정적이라면 초기화 완성시 배열의 길이는 수정 불가에요
 * 자바의 배열 변수는 reference type 변수에요
 * 자바의 배열 변수는 배열 자체가 아니라 heap 메모리에 가리키고 있습니다
 * 만약에 배열 변수를 수정 시도할려면, 배열 변수의 길이가 가변하다는 가상을 느낍니다.
 * 즉 배열 자체는 변하지 않았고, 배열 변수의 가리키는 방향이 변했다.
 * 이게 배열의 특징이에요
 */
public class ArrayTest {
    public static void main(String[] args) {
        // 정적 배열 초기화 첫번째 방식
        String[] books = new String[]
                {
                        "자바 마스터",
                        "스프링 마스터",
                        "분산 시스템 마스터",
                        "데이터베이스 마스터"
                };
        // 정적 배열 초기화 두번째 방식
        String[] names =
                {
                        "이순신",
                        "세종",
                        "홍길동"
                };
        // 동적 배열 초기화 방식
        String[] strArr = new String[5];
        // 배열 길이 계산
        System.out.println("첫번째: " + books.length);
        System.out.println("두번째: " + names.length);
        System.out.println("세번째: " + strArr.length);
    }
}
