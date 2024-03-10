package com.proleesh.ex33.java17;

public class TextBlock3 {
    void main(String[] args) {
        String tbBookTitle1 = """
                Java
                Python
                Artificial Intelligence
                """; // Java/nPython/nArtificial Intelligence/n

        System.out.print(tbBookTitle1);

        System.out.println();

        String tbBookTitle2 = """
                Java
                Python
                Artificial Intelligence""";

        System.out.print(tbBookTitle2); // Java/nPython/nArtificial Intelligence no /n at end;
        System.out.println("[end line 없어]");
    }
}
