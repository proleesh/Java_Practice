package com.proleesh.ex34;

public class SearchInsert {

    public static void main(String[] args) {
        SearchInsert si = new SearchInsert();
        int[] arr = {1, 3, 5, 6};
        System.out.println(si.searchInsert(arr, 5));
    }
    public int searchInsert(int[] nums, int target) {
        return left_bound(nums, target);
    }

    int left_bound(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        return left;
    }
}
