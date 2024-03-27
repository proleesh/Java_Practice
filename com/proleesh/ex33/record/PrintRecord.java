package com.proleesh.ex33.record;

import java.util.StringJoiner;

public record PrintRecord(Integer id, String name) implements PrintInterface {
    @Override
    public void print() {
        StringJoiner joiner = new StringJoiner("-");
        StringJoiner s = joiner.add(id.toString()).add(name);
        System.out.println("info: " + s);
    }
}
