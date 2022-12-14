import java.util.Scanner;

public class Main4596 {
    private int[] solution(int max, int r, int c) {
        Scanner sc = new Scanner(System.in);


        /*int[][] num = new int[9][9];

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = sc.nextInt();
                if(max < num[i][j]) {
                    max = num[i][j];
                    r = i+1;
                    c = j+1;
                }
            }
        }*/

        int n;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                n = sc.nextInt();

                if(max < n) {
                    max = n;
                    r = i+1;
                    c = j+1;
                }
            }
        }

        return new int[]{max, r, c};
    }

    public static void main(String[] args) {
        Main4596 main = new Main4596();

        int max = -1;
        int r = 0;
        int c = 0;

        int[] answer = main.solution(max, r, c);
        System.out.println(answer[0]);
        System.out.printf("%d %d\n", r, c);
    }

}
