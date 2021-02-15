package geometrie;

public class Zylinder extends Figur3D
{
	//Objekt Attribute
	private int hoehe;
	
	// Getter und Setter 
	public int getHoehe ()
	{
		return hoehe;
	}
	
	public void setHoehe (int hoehe)
	{
		this.hoehe = hoehe;
	}
	
	//Konstruktoren 
	public Zylinder (Kreis k, int hoehe)
	{
		super(k);
		this.hoehe = hoehe;
	}
	
	//Objekt Methoden 
	public double volumen ()
	{
		return 12;
	}
	public double oberflaeche ()
	{
		return 12;
	}

}
