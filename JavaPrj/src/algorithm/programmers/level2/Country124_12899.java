package algorithm.programmers.level2;

public class Country124_12899 {

	public static void main(String[] args) {

		Country124 ct = new Country124();
		int n1 = 4;
		String result = ct.solution(n1);
		System.out.println(result);

	}

}

class Country124 {
    public String solution(int n) {
        String str = "";
		int count = 0;
		
		while(n != 0)
		{
			if(n % 3 == 0)
			{
				str = "4" + str;
				n = (n-1) / 3 ;
				
			}
			else
			{
				str = n%3 + str;
				n /= 3;
			}
			
		}
        return str;
    }
}