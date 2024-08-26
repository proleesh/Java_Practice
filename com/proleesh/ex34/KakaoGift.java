package com.proleesh.ex34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KakaoGift {
    public static void main(String[] args) {
        List<String> f = new ArrayList<>();
        f.add("muzi");
        f.add("ryan");
        f.add("frodo");
        f.add("neo");
        List<String> g = new ArrayList<>();
        g.add("muzi frodo");
        g.add("muzi frodo");
        g.add("ryan muzi");
        g.add("ryan muzi");
        g.add("frodo muzi");
        g.add("frodo ryan");
        g.add("neo muzi");
        System.out.println(solution(f,g));

    }

    public static int solution(List<String> friends, List<String> gifts){
        int answer = 0;
        Map<String, Map<String, Integer>> gifted = new HashMap<>();
        Map<String, Integer> giftIdx = new HashMap<>();

        for(String friend : friends){
            gifted.put(friend, new HashMap<>());
            giftIdx.put(friend, 0);
        }

        for(String gift : gifts){
            String[] parts = gift.split(" ");
            String t = parts[0]; // 선물을 준 사람
            String f = parts[1]; // 받은 사람

            Map<String, Integer> giftMap = gifted.get(t);
            giftMap.put(f, giftMap.getOrDefault(f, 0) + 1);
            gifted.put(t, giftMap);

            giftIdx.put(t, giftIdx.get(t) + 1);
            giftIdx.put(f, giftIdx.get(f) - 1);
        }

        int[] willGet = new int[friends.size()];


        for(int i = 0; i < friends.size(); ++i){
            String curr = friends.get(i);
            for(int j = i + 1; j < friends.size(); ++j){
                String another = friends.get(j);

                int a = gifted.get(curr).getOrDefault(another, 0);
                int b = gifted.get(another).getOrDefault(curr, 0);

                if(a > b){
                    willGet[i] += 1;
                }else if(a < b){
                    willGet[j] += 1;
                }else{
                    int ai = giftIdx.get(curr);
                    int bi = giftIdx.get(another);
                    if(ai > bi){
                        willGet[i] += 1;
                    }else if(ai < bi){
                        willGet[j] += 1;
                    }
                }
            }
        }

        for(int count : willGet){
            answer = Math.max(answer, count);
        }
        return answer;
    }
}
