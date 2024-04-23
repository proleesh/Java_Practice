package com.proleesh.ex31.test13;

public class RandomStr {
    void main(){
        var result = "";
        for(var i = 0; i < 6; ++i){
//            var intVal = (Math.random() * 26 + 65);
            var intVal = (Math.random() * 26 + 97);
            result += (char)intVal;
        }
        System.out.println(result);
    }
}
