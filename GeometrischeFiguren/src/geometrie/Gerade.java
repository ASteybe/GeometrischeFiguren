package geometrie;

public class Gerade 
{
	//OBJEKTATTRIBUTE
	private Punkt startPos;
	private Punkt endPos;
	
	// GETTER UND SETTER METHODEN 
	public Punkt getStartPos ()
	{
		return startPos;
	}
	public void setStartPos (Punkt startPos)
	{
		this.startPos = startPos;
	}
	
	public Punkt getEndPos ()
	{
		return endPos;
	}
	public void setEndPos (Punkt endPos)
	{
		this.endPos = endPos;
	}
	
	//KONSTRUKTOR
	public Gerade (Punkt start, Punkt ende)
	{
		startPos = start;
		endPos	= ende;
	}
	//OBJEKTMETHODEN
	public double laenge ()
	{
		return 12;
	}
	
	public boolean istLaengerAls (Gerade g2)
	{
		return false;
	}
	
	public boolean equals (Gerade g2)
	{
		return false;
	}
	
	

}
