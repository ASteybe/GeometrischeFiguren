package geometrie;

public class Rechteck extends Figur2D 
{
	//Objekt Attribute
	private int breite; 
	private int laenge;
	
	//Getter und Setter
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
	
	//Konstruktoren
	public Rechteck (Punkt bezug, int b, int l)
	{
		super(b, l);	//Konstruktor Aufruf Superklasse (Figur2D)
		this.breite = bezug.getX_Koordinate();
		this.laenge = bezug.getY_Koordinate();
	}
	//Objekt Methoden
	public double umfang () 
	{
		return (2*this.breite) + (2*this.laenge); 
	}
	
	public double flaeche ()
	{
		return (this.breite) * (this.laenge); 
	}
	
	public double diagonalenLaenge ( )
	{
		// a� + b� = c�    � --> ALT(festhalten) + 253
		// c --> Diagonale
		return Math.sqrt (Math.pow(this.breite,2) + Math.pow(this.laenge,2));
	}
	
	public boolean flaecheKleinerAls (Figur2D f)
	{
		 return this.flaeche() < f.flaeche();
	}
	
	public boolean umfangKleinerAls (Figur2D f)
	{
		return this.umfang() < f.umfang();
	}
	
}
