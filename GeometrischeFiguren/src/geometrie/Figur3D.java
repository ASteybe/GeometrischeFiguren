package geometrie;

public abstract class Figur3D 
{
	//Attribute
	private Figur2D boden;
	
	//Getter und Setter Methoden
	public Figur2D getBoden2D ()
	{
		return boden;
	}
	public void setBoden ( Figur2D boden)
	{
		this.boden = boden;
	}
	
	
}
