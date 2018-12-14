package string;
import java.util.*;
import java.time.*;

public class Run {
    public String Tijdvak;
	public Run() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	     Scanner tijd = new Scanner(System.in);
	     System.out.print("Geef tijd in 24 uur formaat: ");
	     String tijdom = tijd.nextLine();
	     new tijd(tijdom);
	    // datum en tijd van nu  
		 LocalDateTime Nu = LocalDateTime.now();
	     // omzetten naar string
		 String N = String.valueOf(Nu);
	     int g = N.lastIndexOf("T");
	     g++;
	     // alleen tijdvak
	      N = N.substring(g,16);
	     new tijd(N);
     
	}

}
