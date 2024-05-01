package com.proleesh.ex33;

public class TrapTest {
    void main(){
        int [] height = {
                0,1,0,2,1,0,1,3,2,1,2,1
        };
        System.out.println(trap(height));

    }

    public int trap(int[] height){
        if(height.length == 0){
            return 0;
        }

        int n = height.length;
        int res = 0;

        int[] l_max = new int[n];
        int[] r_max = new int[n];

        l_max[0] = height[0];
        r_max[n-1] = height[n-1];

        for(int i = 1; i < n; ++i){
            l_max[i] = Math.max(height[i], l_max[i - 1]);
        }
        for(int i = n - 2; i >= 0; --i){
            r_max[i] = Math.max(height[i], r_max[i + 1]);
        }
        for(int i = 1; i < n - 1; ++i){
            res += Math.min(l_max[i], r_max[i]) - height[i];
        }
        return res;
    }
}
