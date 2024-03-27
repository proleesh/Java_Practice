package com.proleesh.ex33.record;

import java.util.Optional;

public record Student(Integer id, String name, String email, Integer age) {
    public String concat(){
        return String.format("name: %s, age: %d", this.name, this.age);
    }

    // static method
    public static String emailToUpperCase(String email){
        return Optional.ofNullable(email)
                .orElse("Not found email")
                .toUpperCase();
    }

    public Student{
        if(id < 1){
            throw new RuntimeException("Because of id smaller than 1, you must have bigger than 1.");
        }
    }

    public Student(Integer id, String name){
        this(id,name, null, null);
    }
}
