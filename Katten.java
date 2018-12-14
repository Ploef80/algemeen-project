package Dier;

public class Katten extends Huisdieren{

	public Katten() {
		super();
	}
 public Katten(String naam, int leefdtijd) {
		super(naam, leefdtijd);
		// TODO Auto-generated constructor stub
	}

public void geluid() {
	 System.out.println("Miauw");
 }
public void Omgeving() {
	System.out.println("Tuin");
}
public void eten() {
	System.out.println("JAMJAM");
}
}
