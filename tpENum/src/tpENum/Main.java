package tpENum;

public class Main {

	public static void main(String[] args) {
		
		Jour jour = Jour.SAMEDI;
		
		System.out.println("numero de " + jour + " : " + jour.ordinal());
		System.out.println(jour + " : " + jour.action());
		
		for(Jour j : Jour.values())
		{
			System.out.println("nombre d'heur de " + j + " : " + j.getNbHeur());
		}
		
	}

}
