package com.proleesh.ex34;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        System.out.println(longestConsecutive.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for(int num : nums){
            numSet.add(num);
        }

        int longest = 0;

        for(int num : nums){
            if(!numSet.contains(num - 1)){
                int length = 1;

                while(numSet.contains(num + length)){
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

