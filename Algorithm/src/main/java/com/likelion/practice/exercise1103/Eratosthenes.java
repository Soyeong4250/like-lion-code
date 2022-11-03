package com.likelion.practice.exercise1103;

import java.util.Arrays;

public class Eratosthenes {
    private void multipleOf(int num) {
        int N = num/2;  // 2씩 증가할 예정이므로 2로 나누어주기
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];

        Arrays.fill(checks, true);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
        }

        print(nums, checks);
    }

    public void print(int[] nums, boolean[] checks) {
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%d %s\n", nums[i], checks[i]);
        }
    }

    public static void main(String[] args) {
        Eratosthenes main = new Eratosthenes();

        main.multipleOf(100);
    }
}
