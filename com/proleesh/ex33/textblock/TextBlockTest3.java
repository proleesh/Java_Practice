package com.proleesh.ex33.textblock;

public class TextBlockTest3 {
    void main(){
        String info = """
                ========================
                Name: %s
                Phone: %s
                Age: %d
                ========================
                """.formatted("홍길동", "010-1234-5678", 25);
        System.out.println(info);
    }
}
