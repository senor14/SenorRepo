package algorithm.baekjoon;
import java.util.*;
public class ¼Ò¼ö_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> primes = new ArrayList<Integer>();
		boolean[] check = new boolean[10001];
		check[1] = true;
		for (int i = 2; i <= 10000; i++)
		{
			if (check[i] == false)
			{
				primes.add(i);
				for (int j = i*i; j <= 10000; j += i)
				{
					check[j] = true;
				}
			}
		}
		int ans = 0;
		int sum = 0;
		int cnt = 0;
		int m = sc.nextInt();
		int n = sc.nextInt();
		for (int i = m; i <= n; i++)
		{
			if (check[i] == false)
			{
				sum += i;
				if (cnt == 0)
				{
					ans = i;
					cnt++;
				}
			}
		}
		if (ans == 0)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(sum);
			System.out.println(ans);
		}
	}
}