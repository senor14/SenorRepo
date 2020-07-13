package algorithm.baekjoon;

import java.util.Scanner;

public class 에라토스테네스의_체_2960 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        int cnt = 0;
        boolean[] check = new boolean[n+1];
        check[0] = check[1] = true;
        for (int i=2; i <= n; i++) {
            if (check[i] == true) {
                continue;
            }
            for (int j=i; j<=n; j+=i) {
            	if (check[j] == true) {
                    continue;
                }
            	check[j] = true;
                cnt++;
                if(cnt == k)
                {
                	ans = j;
                	break;
                }
                	
            }
        }

        System.out.println(ans);

	}

}
