import java.util.Scanner;

public class Main_1040 {  // [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num*-1);
        sc.close();
    }
}
