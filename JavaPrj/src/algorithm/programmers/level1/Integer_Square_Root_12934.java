package algorithm.programmers.level1;

public class Integer_Square_Root_12934 {

	public static void main(String[] args) {
		Integersquareroot isr = new Integersquareroot();
		long n1 = 121;
		long result = isr.solution(n1);
		System.out.println(result);
	}
}

class Integersquareroot {
    public long solution(long n) {
        long s = (long)Math.sqrt(n);
        if(s * s == n)
        {
            return (long)Math.pow(s+1,2);
        }
        else
        {
            return -1;
        }
    }
}