package algorithm.programmers.level1;

public class Year_2016 {

	public static void main(String[] args) {
		
		Y2016 y = new Y2016();
		int a1 = 5;
		int b1 = 24;
		String result = y.solution(a1, b1);
		System.out.println(result);

	}

}

class Y2016 {
	  public String solution(int a, int b) {
	        String[] weeks = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
		    int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
			String answer = "";
			int day = 0;
			for(int i=0; i< a-1; i++) {
				day += month[i];
			}
			day += b-1;
			day %= 7;
			answer = weeks[day];
			
			return answer;
	  }
	}
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import java.util.Date;
// class Solution {
//	     public String solution(int a, int b)throws Exception {
	    
//	         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd") ;

//	         String answer="";
//	         String date="2016";
//	         StringBuilder sb=new StringBuilder(date);
	        
//	         if(a<=9&&a>=1)
//	         {      
//	             sb.append("0"+a);
//	             String s=sb.toString();
//	             date=s;
//	         }
//	         else
//	         {
//	             sb.append(a+"");
//	             String s=sb.toString();
//	             date=s;
//	         }
//	         if(b<=9&&b>=1)
//	         {      
//	             sb.append("0"+b);
//	             String s=sb.toString();
//	             date=s;
//	         }
//	         else
//	         {
//	             sb.append(b+"");
//	             String s=sb.toString();
//	             date=s;
//	         }
//	         Date nDate = dateFormat.parse(date) ;   
	        
//	         Calendar cal = Calendar.getInstance() ;
//	         cal.setTime(nDate);
	        
//	         int dayNum = cal.get(Calendar.DAY_OF_WEEK) ;
	       
//	         switch(dayNum){
//	             case 1:
//	             answer = "SUN";
//	             break ;
//	         case 2:
//	             answer = "MON";
//	             break ;
//	         case 3:
//	             answer = "TUE";
//	             break ;
//	         case 4:
//	             answer = "WED";
//	             break ;
//	         case 5:
//	             answer = "THU";
//	             break ;
//	         case 6:
//	             answer = "FRI";
//	             break ;
//	         case 7:
//	             answer = "SAT";
//	             break ;
	             
//	     }
	    
//	         return answer;
	    
//	     }
	// }