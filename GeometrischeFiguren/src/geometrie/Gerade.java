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
		double leange;
		leange = endPos.getX_Koordinate() - startPos.getX_Koordinate();
		return laenge();
	}
	
	public boolean istLaengerAls (Gerade g2)
	{
		return (this.laenge() > g2.laenge());
	}
	
	public boolean equals (Gerade g2)
	{
		//return (this.equals(g2));	// geht das auch ??
		return ( (g2.getStartPos().equals(this.startPos) && g2.getEndPos().equals(this.endPos)) || (g2.getStartPos().equals(this.endPos) && g2.getEndPos().equals(this.startPos)) ); 
	}
}
