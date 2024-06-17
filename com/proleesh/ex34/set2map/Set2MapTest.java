package com.proleesh.ex34.set2map;

public class Set2MapTest {
    public static void main(String[] args) {
        Set2Map<String, Integer> names = new Set2Map<>();
        names.put("이순신", 22);
        names.put("홍길동", 32);
        names.put("장보고", 52);
        System.out.println(names);

        System.out.println(names.size());

        names.removeEntry("이순신");
        System.out.println("\"이순신\"키를 삭제한 후: " + names);
        System.out.println("홍길동의 나이: " + names.get("홍길동"));
        System.out.println("\"장보고\"라는 Key 존재 여부: "
                + names.containsKey("장보고"));

        System.out.println("\"82\"라는 Value 존재 여부: " +
                names.containsValue(82));

        names.clear();
        System.out.println("After clear(): " + names);
    }
}
