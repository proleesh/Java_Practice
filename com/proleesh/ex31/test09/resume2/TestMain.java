package com.proleesh.ex31.test09.resume2;

public class TestMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Resume a = new Resume("Jack");
        a.SetPersonalInfo("male", "29");
        a.SetWorkExperience("2021~2022", "XX회사");

        Resume b = (Resume) a.Clone();
        b.SetWorkExperience("2021~2023", "YY회사");

        Resume c = (Resume) a.Clone();
        c.SetWorkExperience("2021~2024", "ZZ회사");

        a.Display();
        b.Display();
        c.Display();
    }
}
