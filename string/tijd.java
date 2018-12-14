package string;
import java.util.*;

public class tijd {

	public tijd(String T) {
		// TODO Auto-generated constructor stub

	    String Tijdvak;
	    HashMap<Integer,String> getal = new HashMap();
	    getal.put(0, "oh ");    getal.put(1, "one");      getal.put(2, "two");    getal.put(3, "three");
	    getal.put(4, "four");   getal.put(5, "five");     getal.put(6, "six");    getal.put(7, "seven");
	    getal.put(8, "eight");  getal.put(9, "nine");     getal.put(10, "ten");   getal.put(11, "eleven");
	    getal.put(12, "twelve");getal.put(13, "thirteen");getal.put(20, "twenty");getal.put(30,"thirty");
	    getal.put(40,"fourty"); getal.put(50,"fifty");
	    String minute1 = "";
	    String minute2 = "";
	    if (T.contains(":"))
	     {
	         System.out.println("Goed formaat");
	         if (T.length() > 5)
	         {
	        	 T = T.substring(0,5);
	         }
	         if (T.length()== 5) {
	        	 System.out.println("Lengte is goed");
	        	 int uren = Integer.parseInt(T.substring(0, 2));
	        	 int minuten = Integer.parseInt(T.substring(3,5));
	        	 if (uren >= 12 ) {
	        		 Tijdvak = "PM";
	        		 if (uren > 12) {
	        			 uren = uren -12;
	        		 }
	        	 } else {
	        		 Tijdvak = "AM";
	        		 if (uren == 0)
	        		 {
	        			 uren = 12; 
	        		 }
	        	 }
	        	 if (minuten < 10) 
	        	 {
	        		minute1 = "oh ";
	        		minute2 = getal.get(minuten);
	        	 } else if (minuten >= 10 && minuten <= 13)
	        	 {
	        		 minute1 = getal.get(minuten);
	        	 }
	        	 else 
	        	 {
	        		 if (minuten > 13 &&  minuten < 20)
	        		 {
	        			 int minuten2 = minuten - 10;
	        			 minute1 = getal.get(minuten2);
	        			 minute2 = "teen";
	        		 } 
	        		 else if (minuten == 20 || minuten == 30 || minuten == 40 ||minuten == 50)
	        		 {
	        			minute2 = getal.get(minuten); 
	        		 } 
	        		 else if (minuten < 30)
	        		 {
	        			 minute1 = "twenty";
	        			 minute2 = getal.get(minuten -20);
	        		 }
	        		 else if (minuten < 40)
	        		 {
	        			 minute1 = getal.get(30);
	        			 minute2 = getal.get(minuten -30);
	        		 }
	        		 else if (minuten < 50)
	        		 {
	        			 minute1 = getal.get(40);
	        			 minute2 = getal.get(minuten -40);
	        		 }
	        		 else if (minuten < 60)
	        		 {
	        			 minute1 = getal.get(50);
	        			 minute2 = getal.get(minuten -50);
	        		 }
	        	 }
	        	 System.out.println("It`s " + getal.get(uren) + " o'clock "+ minute1 + minute2 + " " + Tijdvak);
	         }
	     }
	}

}
