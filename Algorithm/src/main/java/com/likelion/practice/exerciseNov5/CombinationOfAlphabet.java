package com.likelion.practice.exerciseNov5;

public class CombinationOfAlphabet {
    static StringBuilder answer = new StringBuilder();
    private void combination(char[] alphabet, int idx) {
        if(idx == alphabet.length) {
            answer.append(new String(alphabet));
            answer.append('\n');
            return;
        }

        for (int i = 65; i < 91; i++) {
            alphabet[idx] = (char)i;
            combination(alphabet, idx+1);
        }
    }

    private void combination2(String prefix, int select) {
        if(prefix.length() == select) {
            System.out.println(prefix);
            return;
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            combination2(prefix + ch, select);
        }
    }

    public static void main(String[] args) {
        CombinationOfAlphabet main = new CombinationOfAlphabet();
        int select = 2;
        char[] alphabet = new char[select];
        System.out.println("-----conbination-----");
        main.combination(alphabet, 0);
        System.out.println(answer.toString());
        System.out.println("-----conbination2-----");
        main.combination2("", select);
    }
}
