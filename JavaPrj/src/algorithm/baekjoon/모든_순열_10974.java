package algorithm.baekjoon;
import java.util.*;
import java.io.*;
public class 모든_순열_10974 {
	public static boolean next_permutation(int a[]) {
		int i = a.length-1;
		while (i > 0 && a[i-1] >= a[i]) {
			i -= 1;
		}
		
		if (i <= 0) {
			return false;
		}
		
		int j = a.length-1;
		while (a[j] <= a[i-1]) {
			j -= 1;
		}
		
		int temp = a[j];
		a[j] = a[i-1];
		a[i-1] = temp;
		
		j = a.length-1;
		while (i < j) {
			temp = a[j];
			a[j] = a[i];
			a[i] = temp;
			i += 1;
			j -= 1;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i=0; i<n; i++) {
			a[i] = i+1;
		}
		do {
			for (int i=0; i<n; i++) {
				bw.append(a[i] + " ");
			}
			bw.append("\n");
		} while (next_permutation(a));
		bw.flush();
	}
}