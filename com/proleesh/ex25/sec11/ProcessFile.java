package com.proleesh.ex25.sec11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Cat{
    private String name, colour;

    public Cat(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
public class ProcessFile {
    public static void main(String[] args) {
        List<Cat> cats = loadCats("com/proleesh/ex25/sec11/Cats.txt");
        cats.forEach(System.out::println);
    }

    public static List<Cat> loadCats(String filename) {
        List<Cat> cats = new ArrayList<>();
        /**
         * Files.lines()메서드를 사용하여 파일을 스트피밍할 수 있습니다. 스트림의 데이터 요소로
         * 파일에서 한 번에 한 줄씩 제공됩니다.
         * Paths.get()메서드를 사용하면 경로를 얻어낼 수 있습니다.
         */
        try(Stream<String> stream = Files.lines(Paths.get(filename))){
            /**
             * 스트림의 데이터를 처리하기 위해 터미널 작업인 Stream 인터페이스의 forEach()메서드를
             * 사용합니다.
             * .split()메서드를 사용하면 특정 구분자로 구분이 가능하다.
             */
            stream.forEach(line -> {
                String[] catsArray = line.split("/");
                cats.add(new Cat(catsArray[0], catsArray[1]));
            });
        }catch(Exception e){
            e.printStackTrace();
        }
        return cats;
    }
}
