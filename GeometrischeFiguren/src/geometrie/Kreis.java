package geometrie;

public class Kreis extends Figur2D 
{
	//Klassenattribute
	private static int DEFAULT_RADIUS = 5;
	
	//Objekt Attribute
	private int radius;
	
	//Getter und Setter
	public static int getDEFAULT_RADIUS() 
	{
		return DEFAULT_RADIUS;
	}
	public static void setDEFAULT_RADIUS(int dEFAULT_RADIUS) 
	{
		DEFAULT_RADIUS = dEFAULT_RADIUS;
	}
	public int getRadius() 
	{
		return radius;
	}
	public void setRadius(int radius) 
	{
		this.radius = radius;
	}
	//Konstruktor(en)
	public Kreis (Punkt bezug, int radius)
	{
		super(bezug);
		this.radius = radius;
	}
	public Kreis (Punkt bezug)
	{
		super(bezug);
	}
	//OBJECT METHODEN
	public double umfang ()
	{
		return 12;
	}
	public double flaeche ()
	{
		return 12;
	}
	

}
