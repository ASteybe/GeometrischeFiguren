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
		super(b, l);	//Konstruktor Aufruf Superklasse (Figur2D)
		this.breite = bezug.getX_Koordinate();
		this.laenge = bezug.getY_Koordinate();
	}
	//OBJECT METHODEN
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
		// a² + b² = c²    ² --> ALT(festhalten) + 253
		// c --> Diagonale
		return Math.sqrt (Math.pow(this.breite,2) + Math.pow(this.laenge,2));
	}
	
	public boolean flaecheKleinerAls (Figur2D f)
	{
		return false;
	}
	
	public boolean umfangKleinerAls (Figur2D f)
	{
		return false;
	}
	
}
