package com.proleesh.ex34;

public class CountDown {
    public static void main(String[] args) {
        int s = 10, e = 3;
        CountDown cd = new CountDown();
        int[] res = cd.solution(s, e);
        for(int num : res){
            System.out.print(num + " ");
        }
    }

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        int index = 0;

        for (int i = start_num; i >= end_num; --i) {
            answer[index] = i;
            ++index;
        }
        return answer;
    }
}
