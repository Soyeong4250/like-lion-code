package com.likelion.practice.exerciseNov5;

import java.util.*;

public class RadixSort2 {
    private int[] getDigits(int[] arr) {
        HashSet<Integer> hash = new HashSet<>();

        for (int num:arr) {
            if(num == 0) hash.add(1);
            else hash.add((int)(Math.log10(num + 1)));
        }

        int[] digits = new int[hash.size()];
        int idx = 0;
        for (int num : hash) {
            digits[idx++] = num;
        }

        Arrays.sort(digits);

        return digits;
    }

    private int[] sort(int[] arr, int digit) {
        Queue<Integer>[] qArr = new Queue[10];
        for (int i = 0; i < qArr.length; i++) {
            qArr[i] = new ArrayDeque<>();
        }

        for (int i = 0; i < arr.length; i++) {
            int divisor = (int)Math.pow(10, digit - 1);
            qArr[Math.floorDiv(arr[i], divisor) % 10].add(arr[i]);
        }

        int idx = 0;
        for (int i = 0; i < qArr.length; i++) {
            while(!qArr[i].isEmpty()) {
                arr[idx++] = qArr[i].poll();
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        RadixSort2 main = new RadixSort2();

        int[] arr = new int[]{7, 4, 5, 9, 1, 0};
        int[] digits = main.getDigits(arr);
        for (var digit : digits) {
            arr = main.sort(arr, digit);
            System.out.println(Arrays.toString(arr));
        }
    }
}
