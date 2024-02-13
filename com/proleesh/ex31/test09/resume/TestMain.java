package com.proleesh.ex31.test09.resume;

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("Tom");
        a.setPersonalInfo("male", "28");
        a.setWorkExperience("2018~2020", "XX회사");

        Resume b = (Resume) a.clone();
        b.setWorkExperience("2018~2019", "YY회사");

        Resume c = (Resume) a.clone();
        c.setPersonalInfo("male", "29");

        a.Display();
        b.Display();
        c.Display();
    }
}
