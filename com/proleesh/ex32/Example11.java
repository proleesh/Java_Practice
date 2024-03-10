package com.proleesh.ex32;

import java.util.Scanner;

public class Example11 {
    void main(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 1; // 자신입력한 수를 포함
        int sum = 1; // 총합 초기화
        // 시작과 끝을 같은 인덱스로 초기화
        int start_i = 1; // 시작 인덱스 오른쪽 이동 즉 왼쪽에서 삭제
        int end_i = 1; // 끝 인덱스 오른쪽 이동 즉 확장

        while(end_i != N){
            if(sum == N){
                count++;
                end_i++;
                sum += end_i;
            }else if(sum > N){
                sum -= start_i;
                start_i++;
            }else{
                end_i++;
                sum += end_i;
            }
        }


        System.out.println(count);
    }
}
