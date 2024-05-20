package com.proleesh.ex34.errordef;

public class ErrorDef {
    /**
     * static 키워드 자체는, 정적의 의미를 가지지만, Java 언어의 관점에서는
     * static은 마크다. 즉 instance 멤버를 class 멤버로 변화하는 것
     * static은 class에 정의된 멤버 부분만 정의가능
     * 즉 static을 사용하면 member는 class 자체에 속하고
     * static을 사용 안했으면 member는 class instance에 속한다.
     * main에 쓸 수 없다.
     * static의 전 후 위치는 상관없고, 우측에만 안 쓰면 된다.
     *
     */
//    int num1 = num2 + 2;
//    int num2 = 10;
//    static int num1 = num2 + 2;
//    static int num2 = 10;
    int num1 = num2 + 2;
    static int num2 = 10;

    public void setNum1(int num1){

            this.num1 = num1;
}
    public int getNum1(){
        return num1;
    }

    public static void main(String[] args) {
        ErrorDef errorDef = new ErrorDef();
        System.out.println(errorDef.getNum1()); // 12
        errorDef.setNum1(100);
        System.out.println(errorDef.getNum1()); // 100
        int num3 = num2;
        System.out.println(num3); // 10
    }
}
