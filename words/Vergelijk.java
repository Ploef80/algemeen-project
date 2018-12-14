package words;

public class Vergelijk {

	public Vergelijk(String w1,String w2) {
		// TODO Auto-generated constructor stub
	   int I = 0;
	   boolean Match = true;
	     if (w1.length() - w2.length() == 1 ) 
	     {
	    	I = w2.length();
	    	for (I = w2.length();I > 0 ; I--)
	    	{
	    		String w3 = w2.substring(I -1, I);
	    		if  (w1.contains(w3) == false)
	    		{
	    			Match = false;
	    			break;
	    		}
	    	}
	     } else 
	     {
	    	Match = false;
	     }
	     if (Match == true)
	     {
	        System.out.println("Succes ");
	     }
	     else 
	     {
	        System.out.println("Helaas ");
	     }
	}

}
