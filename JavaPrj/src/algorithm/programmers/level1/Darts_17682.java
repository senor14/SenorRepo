package algorithm.programmers.level1;

public class Darts_17682 {

	public static void main(String[] args) {

		Darts dt = new Darts();
		String dartResult1 = "1S2D*3T";
		int result = dt.solution(dartResult1);
		System.out.println(result);

	}

}

class Darts {
    public int solution(String dartResult) {
    
        String[] str1 = dartResult.split("");
        int[] str2 = new int[3];
	    int j=0;
	   
	    for(int i=1; i<str1.length; i++)
	    {
		    if(str1[i].equals("S"))
		    {
			       if(i == 2)
			       {
			    	   str2[j] = (int)Math.pow(10, 1);
		    		   j++;
			       }
			       else if(i == 1)
			       {
			    	   str2[j] = (int)Math.pow(Integer.parseInt(str1[i-1]), 1);
			    	   j++;
			       }
			       else if(str1[i-2].equals("1"))
			       {
			    	   str2[j] = (int)Math.pow(10, 1);
		    		   j++;
		    	   }
		    	   else
		    	   {
			    	   str2[j] = (int)Math.pow(Integer.parseInt(str1[i-1]), 1);
			    	   j++;
			       }
		      }
		       else if(str1[i].equals("D"))
		       {
		    	   if(i == 2)
			       {
			    	   str2[j] = (int)Math.pow(10, 2);
		    		   j++;
		    	   }
			       else if(i == 1)
			       {
			    	   str2[j] = (int)Math.pow(Integer.parseInt(str1[i-1]), 2);
			    	   j++;
		    	   }
			       else if(str1[i-2].equals("1"))
			       {
			    	   str2[j] = (int)Math.pow(10, 2);
		    		   j++;
		    	   }
		    	   else
		    	   {
		    		   str2[j] = (int)Math.pow(Integer.parseInt(str1[i-1]), 2);
		    		   j++;
		    	   }	   
		     }
		     else if(str1[i].equals("T"))
		     {
			    if(i == 2)
			    {
				    str2[j] = (int)Math.pow(10, 3);
				    j++;
			    }
			    else if(i == 1)
			    {
				    str2[j] = (int)Math.pow(Integer.parseInt(str1[i-1]), 3);
				    j++;
			    }
			    else if(str1[i-2].equals("1"))
			    {
				    str2[j] = (int)Math.pow(10, 3);
				    j++;
			    }
			    else
			    {
				    str2[j] = (int)Math.pow(Integer.parseInt(str1[i-1]), 3);
				    j++;
			    }
		    }  
	    }
	   
	    for(int i=0; i<str1.length; i++)
	    {
		    if(str1[i].equals("*"))
		    {
			    if(i==2)
			    {
				    str2[0] *= 2;
			    }
			    else if(i!=str1.length-1)
			    {
				    str2[0] *= 2;
				    str2[1] *= 2;
			    }
			    else
			    {
				    str2[1] *= 2;
                    str2[2] *= 2;
			    }
		    }
		    else if(str1[i].equals("#"))
		    {
			    if(i==2)
			    {
				    str2[0] *= -1;
			    }
			    else if(i!=str1.length-1)
			    {
				    str2[1] *= -1;
			    }
			    else
			    {
				    str2[2] *= -1;
			    }
		    }
	    }
	    int sum=0;
	    for(int i=0; i<3; i++)
	    {
		    sum += str2[i];
	    }
        return sum;
    }
}