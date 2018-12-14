 package Dier;

public abstract class Huisdieren implements Dieren{
	String nm;
	int lf;
	static int aahuisdieren = 0;
	
	public Huisdieren()
	{
		aahuisdieren++;
		//int sn = aahuisdieren;
	}
     

	public Huisdieren(String naam, int leefdtijd) {
	    this();
		nm = naam;
		lf = leefdtijd;
		// TODO Auto-generated constructor stub
	}
    public void SetLeeftijd(int lf)
    {
    	this.lf = lf;
    }
    public void SetNaam(String nm)
    {
    	this.nm = nm;
    }
	public void eten() {
		System.out.println("Smak smak");
	}

	public static void GetaantHuisdieren() {
		System.out.println("Aantal huisdieren aangemaakt " + aahuisdieren);
	}
	public void slapen() {
		System.out.println("zzzzzzzzz");
	}

	public void getLeefdtijd() {
		System.out.println(lf);
	}

	public void getNaam() {
		System.out.println(nm);
	}

	public void geluid() {
		System.out.println("Onbekend ");
	}

	@Override
	public void Omgeving() {
		// TODO Auto-generated method stub
		System.out.println("Wereldwijd");
	}
}
