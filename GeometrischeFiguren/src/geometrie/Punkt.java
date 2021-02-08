package geometrie;

import java.lang.Math;

public class Punkt 
{
	// OBJEKTATTRIBUTE
	private int xKoordinate;
	private int yKoordinate;
	
	// GETTER UND SETTER - METHODEN 
	public int getX_Koordinate ()
	{
		return xKoordinate;
	}
	public void setX_Koordinate (int xKoordinate)
	{
		this.xKoordinate = xKoordinate;
	}
	
	
	public int getY_Koordinate ()
	{
		return yKoordinate;
	}
	public void SetY_Koordinate (int yKoordinate)
	{
		this.yKoordinate = yKoordinate;
	}
	
	//KONSTRUKTOREN
	public Punkt (int x, int y)
	{
		xKoordinate = x;
		yKoordinate = y;
	}
	public Punkt (Punkt p2) 
	{ 
		xKoordinate = p2.getX_Koordinate();
		yKoordinate = p2.getY_Koordinate();
	}
	
	//OBJEKTMETHODEN;
	public double abstand (Punkt p)
	{
		double x1 = 0, x2 = 0, y1 = 0, y2 = 0;
		//Berechnung Euklidischer Abstand
		// (x1-y1)2 + (x2-y2)2
		x1 = Math.pow(x1, 2);
		x2 = Math.pow(x2, 2);
		y1 = Math.pow(y1, 2);
		y2 = Math.pow(y2, 2);
		
		return x1 - y1 + x2 - y2;
	}
	public void verschieben ( int deltaX, int deltaY)
	{
		this.xKoordinate = getX_Koordinate() + deltaX;
		this.yKoordinate = getY_Koordinate() + deltaY;
	}
	public boolean equals ( Punkt p1)
	{
		// Ueberpruefung der inhaltlichen Gleichheit zweier Objekte
		return (p1.getX_Koordinate() == this.xKoordinate && p1.getY_Koordinate() == this.yKoordinate);
	}
	
	
}

