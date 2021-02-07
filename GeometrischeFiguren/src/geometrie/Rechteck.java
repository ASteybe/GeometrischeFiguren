package geometrie;

public class Rechteck extends Figur2D 
{
	//Objektattribute
	private int breite; 
	private int laenge;
	
	//Getter und Setter Methoden
	public int getBreite() 
	{
		return breite;
	}
	
	public void setBreite(int breite) 
	{
		this.breite = breite;
	}
	
	public int getLaenge() 
	{
		return laenge;
	}
	
	public void setLaenge(int laenge) 
	{
		this.laenge = laenge;
	} 
	
	//Konstruktor(en)
	public Rechteck (Punkt bezug, int b, int l)
	{
		super(b, l);
		breite = bezug.getX_Koordinate();
		laenge = bezug.getY_Koordinate();
	}
	//Objekt - Methoden 
	public double diagonalenLaenge ( )
	{
		return 12;
	}
	
	public boolean flaecheKleinerAls (Figur2D f)
	{
		return false;
	}
	
	public boolean umfangKleinerAls (Figur2D f)
	{
		return false;
	}
	//OBJECT METHODEN
	public double umfang () 
	{
		return 12;
	}
	public double flaeche ()
	{
		return 14;
	}
	
	
	
}
