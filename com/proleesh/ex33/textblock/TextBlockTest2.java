package com.proleesh.ex33.textblock;

public class TextBlockTest2 {
    void main(){
        String msg = """
                <html>
                <body>
                <h1>Hello world</h1>
                </body>
                </html>
                """;
        System.out.println(msg);

        // 5 word space
        String indent = msg.indent(5);
        System.out.println(indent);
    }
}
