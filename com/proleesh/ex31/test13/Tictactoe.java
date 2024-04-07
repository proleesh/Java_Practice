package com.proleesh.ex31.test13;

import java.util.HashSet;
import java.util.Set;

public class Tictactoe {
    void main(){

        int[][] wins = {
                {0,0},
                {2,0},
                {1,1},
                {2,1},
                {2,2}
        };
        System.out.println(tictactoe(wins));
        System.out.println(wins.length);

    }
    public String tictactoe(int[][] moves){
        int[][] wins = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8},
                {0, 3, 6},
                {1, 4, 7},
                {2, 5, 8},
                // master
                {0, 4, 8},
                // sub
                {2, 4, 6}
        };

        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for(int i = 0; i < moves.length; ++i){
            int pos = moves[i][0] * 3 + moves[i][1];
            if(i % 2 == 0){
                setA.add(pos);
                if(check(setA, wins)){
                    return "A";
                }
            }else{
                setB.add(pos);
                if(check(setB, wins)){
                    return "B";
                }
            }
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }

    public boolean check(Set<Integer> set, int[][] wins){
        for(int[] win : wins){
            boolean flag = true;
            for(int pos : win){
                if(!set.contains(pos)){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return true;
            }
        }
        return false;
    }
}
