package algorithm.baekjoon;
import java.util.*;
public class ¼¿ÇÁ_³Ñ¹ö_4673 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] sNum = new boolean[10001];
		for (int i = 1; i <= 10000; i++)
		{
			String s = i + "";
			int sum = i;
			for (int j = 0; j < s.length(); j++)
			{
				sum += Integer.parseInt(s.charAt(j) + "");
			}
			if (sum <= 10000)
			{
				sNum[sum] = true;
			}
		}
		for (int i = 1; i <= 10000; i++)
		{
			if (sNum[i] == false)
			{
				System.out.println(i);
			}
		}
	}
}