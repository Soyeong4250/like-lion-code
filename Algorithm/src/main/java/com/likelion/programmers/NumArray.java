package com.likelion.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumArray {
    private int[] solution(int[] arr, int divisor) {
        // 1. array의 각 element 중 divisor로 나누어 떨어지는 값 구하기
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0) {
                numList.add(arr[i]);
            }
        }

        // 2. 나누어 떨어지는 element가 하나도 없다면  (List의 길이가 0이라면) numList에 -1을 담고
        //    나누어 떨어지는 element가 있다면 numList 오름차순 정렬하기
        if(numList.size() == 0) {
            numList.add(-1);
        } else {
            Collections.sort(numList);
        }

        // 3. numList와 길이가 맞는 정답 배열 생성 후 element 옮겨 담기
        int[] answer = new int[numList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray();

        System.out.println(Arrays.toString(numArray.solution(new int[]{5, 9, 7, 10}, 5)));
    }
}