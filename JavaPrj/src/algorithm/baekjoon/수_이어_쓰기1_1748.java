package algorithm.baekjoon;
import java.util.*;
public class 수_이어_쓰기1_1748 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 0;
		for (int st=1, len=1; st<=n; st*=10,len++) {
			int end = st*10-1;
			if (end > n) {
				end = n;
			}
			ans += (long)(end - st + 1) * len;
		}
		System.out.println(ans);
	}
}