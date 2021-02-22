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
	
	///////////////////////////////////////////////////////
	
	//Wird benoetigt um auf die Breite bzw. Länge des Rechtecks zugreifen zu koennen 
	public Rechteck getBoden ()
	{
		Figur2D myBoden = super.getBoden2D();
		return (Rechteck) myBoden; 
	}
	
	public void setBoden (Rechteck boden)
	{
		super.setBoden(boden);
	}
	///////////////////////////////////////////////////////
	
	//Konstruktoren
	public Quader (Rechteck r, int hoehe)
	{
		super(r);
		this.setHoehe(hoehe);
	}
	//Objetkt Methoden
	public double volumen ()
	{	
		// Volumen = Fläche * hoehe
		return this.getBoden2D().flaeche() * this.hoehe;
	}

	public double oberflaeche ()
	{
		//Oberfläche = 2 * A1 + 2 * A2 + 2 * A3
		int l = this.getBoden().getLaenge();
		int b = this.getBoden().getBreite();
		
		return 2 * l * b + 2 * l * this.hoehe + 2 * b * this.hoehe;
	}
	
	public double leangeRaumdiagonale ()
	{	
		int a = this.getBoden().getLaenge();
        int b = this.getBoden().getBreite();
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(this.hoehe, 2));
	}
	
	public static boolean istWuerfel (Object o)
	{
		if (o instanceof Quader)	
		{
			
		}
		return false;
	}
	
	public boolean equals (Figur3D f)
	{
		return false;
	}
	
}
