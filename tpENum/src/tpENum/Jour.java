package tpENum;
// yahya hachkeurr
public enum Jour {
	LUNDI(8), MARDI(8), MERCREDI(4), JEUDI(8), VENDREDI(7), SAMEDI(0), DIMANCHE(0);
	private int nbHeur;
	
	Jour(int nbHeur)
	{
		this.nbHeur = nbHeur;
	}
	public int getNbHeur()
	{
		return nbHeur;
	}
	public String action()
	{
		switch(this)
		{
			case SAMEDI: return "cinema";
			case DIMANCHE: return "dormire";
			default: return "travailler";
		}
	}
}
