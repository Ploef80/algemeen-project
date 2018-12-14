package words;

import java.util.*;

public class Input {

	public Input() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*Scanner woord1 = new Scanner(System.in);
     System.out.println("Geef 1ste woord:");
     String w1 = woord1.nextLine();
     System.out.println("Geef 2de woord:");
     String w2 = woord1.nextLine();
     // close woord1;
     //System.out.println(w1);
     //close Scanner woord1;
     woord1.close();
     new Vergelijk(w1,w2);
     */
     int a = 0 ,b = 0,c = 0,d = 0,e=0;
     String Scores = "EbAAdbBEaBaaBBdAccbeebaec";
     for (int i = Scores.length(); i >0 ; i--)
     {
    	String S1 = Scores.substring(i-1, i);
    	if (S1.contains("A"))
    	{
    		a--;
    	}
    	else if (S1.contains("a"))
    	{
    		a++;
    	}
    	else if (S1.contains("B"))
    	{
    		b--;
    	}
    	else if (S1.contains("b"))
    	{
    		b++;
    	}
    	else if (S1.contains("C"))
    	{
    		c--;
    	}
    	else if (S1.contains("c"))
    	{
    		c++;
    	}
    	else if (S1.contains("D"))
    	{
    		d--;
    	}
    	else if (S1.contains("d"))
    	{
    		d++;
    	}
    	else if (S1.contains("E"))
    	{
    		e--;
    	}
    	else if (S1.contains("e"))
    	{
    		e++;
    	}
     }
     Map<String,Integer> Uitkomst= new HashMap<>();
     Uitkomst.put("A",a);
     Uitkomst.put("B",b);
     Uitkomst.put("C",c);
     Uitkomst.put("D",d);
     Uitkomst.put("E",e);
     System.out.println(Uitkomst);
     System.out.print("A: " + a );
     System.out.print(" B: " + b );
     System.out.print(" C: " + c );
     System.out.print(" D: " + d );
     System.out.print(" E: " + e );
     printMap(Uitkomst);
	}
    private static void printMap(Map<String, Integer> Waarde){
    	Waarde.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry<String, Integer>::getValue).reversed())
                .forEach(System.out::println);
    }
}
