package com.proleesh.ex31.test09.resume2;

public class Resume implements Cloneable{

    private String name;
    private String sex;
    private String age;

    private WorkExperience work;

    public Resume(String name) {
        this.name = name;
        work = new WorkExperience();
    }

    private Resume(WorkExperience work) throws CloneNotSupportedException {
        this.work = (WorkExperience) work.clone();
    }

    public void SetPersonalInfo(String sex, String age){
        this.sex = sex;
        this.age = age;
    }

    public void SetWorkExperience(String workDate, String company){
        work.WorkDate = workDate;
        work.Company = company;
    }

    public void Display(){
        System.out.println(name + " " + sex + " " + age);
        System.out.println("경력: " + work.WorkDate + " " + work.Company);
    }


    public Object Clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.work);
        obj.name = this.name;
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;
    }
}
