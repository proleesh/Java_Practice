package com.proleesh.ex33.java17;

public class TextBlock2 {
    public static void main(String[] args) {
        String sQuote = "Hamlet: \"There is nothing either good or bad, " +
                "but thinking makes it so\"";
        System.out.println(sQuote);

        String tbQuote = """
                Hamlet: "There is nothing either good or bad, but thinking makes it so"
                """;
        System.out.println(tbQuote);
    }
}
