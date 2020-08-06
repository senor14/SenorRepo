package algorithm.baekjoon;

import java.util.Scanner;

public class 팩토리얼_0의_개수_1676 {

	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=5; i<=n; i*=5) {
            ans += n/i;
        }
        System.out.println(ans);
    }
}
