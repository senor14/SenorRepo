package algorithm.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Order_12917 {

	public static void main(String[] args) {

		Descend dsc = new Descend();
		String s1 = "Zbcdefg";
		String result = dsc.solution(s1);
		System.out.println(result);

	}

}

class Descend {
    public String solution(String s) {
        String[] array = s.split("");
        Arrays.sort(array);
        Collections.reverse(Arrays.asList(array));
        return String.join("",array);
    }
}