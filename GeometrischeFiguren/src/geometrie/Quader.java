package geometrie;

public class Quader extends Figur3D
{
	//Objekt Attribute
	private int hoehe;
	
	//Getter und Setter
	public int getHoehe ()
	{
		return hoehe;
	}
	
	public void setHoehe (int hoehe)
	{
		this.hoehe = hoehe;
	}

	//Konstruktoren
	public Quader (Rechteck r, int hoehe)
	{
		super(r);
		this.hoehe = hoehe;
	}
	//Objetkt Methoden
	public double volumen ()
	{
		return 12;
	}
	
	public double oberflaeche ()
	{
		return 12;
	}
	
	public double leangeRaumdiagonale ()
	{
		return 12;
	}
	
	public static boolean istWuerfel (Object o)
	{
		return false;
	}
	
	public boolean equals (Figur3D f)
	{
		return false;
	}
	
}
