package com.proleesh.ex25.sec12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Collections.addAll(books,
                new Book(1, "자바 Comparator"),
                new Book(1, "Python Flask Framework"),
                new Book(3, "Linux OS"),
                new Book(2, "Spring Framework"),
                new Book(4, "자바스크립트")
                );
        System.out.println("[1] 오름차순");
        Collections.sort(books, new AscendingNo());
        System.out.println(books);

        System.out.println("[2] 내림차순");
        Collections.sort(books, new DescendingNo());
        System.out.println(books);

        System.out.println("[3] 오름차순 직접구현");
        Collections.sort(books, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                int res = Integer.valueOf(o1.getNo()).compareTo(o2.getNo()) * -1;
                if(res == 0){
                    res = o1.getTitle().compareTo(o2.getTitle()) * -1;
                }
                return res;
            }
        });
        System.out.println(books);

        System.out.println("[4] Comparator.reverseOrder() method 사용");
        Collections.sort(books, Comparator.reverseOrder());
        System.out.println(books);

        System.out.println("[5] Alphabet 내림차순 정렬");
        List<String> lists = new ArrayList<>();
        Collections.addAll(lists, "S","e","b","a","s","t","i","a","a","n");
        Collections.sort(lists, Comparator.reverseOrder());
        System.out.println(lists);

        System.out.println("[6] 대소문자 구분없이 Alphabet 오름차순 정렬");
        Collections.sort(lists, String.CASE_INSENSITIVE_ORDER);
        System.out.println(lists);



    }
}
