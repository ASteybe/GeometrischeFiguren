package geometrie;

public abstract class Figur2D 
{
	//OBJEKTATTRIBUTE
	private Punkt bezug;
	
	//GETTER UND SETTER-METHODEN
	public Punkt getBezug() 
	{
		return bezug;
	}

	public void setBezug(Punkt bezug) 
	{
		this.bezug = bezug;
	}
	
	//KONSTRUKTOREN
	public Figur2D (Punkt bezug)
	{
		this.bezug = bezug;
	}
	
	public Figur2D (int bezugX, int bezugY)
	{
		this.bezug.setX_Koordinate(bezugX);
		this.bezug.SetY_Koordinate(bezugY);
	}
	
	//ABSTRAKTE METHODEN
	public abstract double umfang ();
	public abstract double flaeche ();

}
