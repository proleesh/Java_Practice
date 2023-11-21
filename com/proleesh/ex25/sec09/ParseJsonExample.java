package com.proleesh.ex25.sec09;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ParseJsonExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new FileReader("/Users/sunghyuklee/member.json"));
        String json = br.readLine();
        br.close();

        //JSON 파싱
        JSONObject root = new JSONObject(json);
        // 속성 정보 읽기
        System.out.println("id: " + root.getString("id"));
        System.out.println("name: " + root.getString("name"));
        System.out.println("age: " + root.getInt("age"));
        System.out.println("student: " + root.getBoolean("student"));

        JSONObject tel = root.getJSONObject("tel");
        System.out.println("home: " + tel.getString("Home"));
        System.out.println("mobile: " + tel.getString("Mobile"));

        JSONArray skill = root.getJSONArray("skill");
        System.out.println("skill: ");
        for(int i=0; i< skill.length(); ++i){
            System.out.println(skill.get(i) + ", ");
        }
    }
}
