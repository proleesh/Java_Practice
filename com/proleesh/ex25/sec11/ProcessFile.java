package com.proleesh.ex25.sec11;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 스트림의 특징
 * 1. 데이터를 담고 있는 저장소(collections)이 아니다.
 * 2. 스트림은 원본 데이터 소스를 변경하지 않는다.즉 read only
 * 3. 스트림은 iterator 처럼 일회용이다. (필요하면 다시 스트림을 생성해야 함)
 * 4. 최종 연산 전까지 중간연산을 수행되지 않는다.(lazy)
 * 5. 무제한 일 수도 있다. (Short Circuit 메소드를 사용하여 제한할 수 있다.)
 * 6. 손쉽게 병렬 처리할 수 있다. (멀티 쓰레드 사용)
 * 7. 기본형 스트림으로 IntStream, LongStream, DoubleStream등 제공
 *  오토박싱 등의 불필요한 과정이 생략됨.
 *  Stream<Integer> 대신에 IntStream을 사용하는게 더 효율적이다.
 */
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
