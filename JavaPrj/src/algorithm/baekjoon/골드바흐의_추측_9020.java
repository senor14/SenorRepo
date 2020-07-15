package algorithm.baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class ∞ÒµÂπŸ»Â¿«_√ﬂ√¯_9020 {

	public static final int MAX = 10000;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean[] check = new boolean[MAX+1];
        ArrayList<Integer> prime = new ArrayList<Integer>();
        check[0] = check[1] = true;
        for (int i=2; i <= MAX; i++) {
            if (check[i] == true) {
                continue;
            }
            prime.add(i);
            for (int j=i+i; j<=MAX; j+=i) {
                check[j] = true;
            }
        }
        int t = sc.nextInt();
        int temp = 0;
        System.out.println(prime.size());
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i=0; i<prime.size(); i++) {
                int p = prime.get(i);
                if(p>n/2)
                	break;
                if (check[n - p] == false) {
                    temp = p;
                }
            }
            System.out.println(temp + " " + (n-temp));
        }
    }
}
