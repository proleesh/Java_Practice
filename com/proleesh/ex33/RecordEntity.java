package com.proleesh.ex33;

public record RecordEntity(Long id, String name, Integer age, String regNumber) {

    public static final String currentYear = "24";

    public boolean isNewEntity(){
        return regNumber().substring(0, 2).equals(currentYear);
    }

    public static RecordEntity createBlankRecordEntity(){
        return new RecordEntity(2L, " ", 24, " ");
    }
}
