package com.proleesh.ex31;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {
        var contents = new String(Files.readAllBytes(
                Paths.get("/Users/sunghyuklee/Downloads/test/test.txt")), StandardCharsets.UTF_8);
        List<String> words = List.of(contents.split("\\PL+"));

        long count = 0;
        for(String w : words){
            if(w.length() > 12) count++;
        }
        System.out.println(count);

        count = words.stream()
                .filter(w -> w.length() > 12)
                .count();
        System.out.println(count);


        count = words.parallelStream()
                .filter(w -> w.length() > 12)
                .count();
        System.out.println(count);
    }
}
