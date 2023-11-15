package com.proleesh.ex24.sec12;

import java.io.Serial;
import java.io.Serializable;

public class Member implements Serializable {

    @Serial
    private static final long serialVersionUID = 8382605528716950830L;
    private String id;
    private String name;

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
