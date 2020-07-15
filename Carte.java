package Game;
import Game.Numero;
import Game.TypeCarte;


import Game.Couleur;

public class Carte {

	public Numero n;
	public TypeCarte t;
	public Couleur c;
	public boolean prise = false;
	
	public Carte(Numero startN, TypeCarte startT, Couleur startC)
	{ 
		this.n = startN;
		this.t = startT;
		this.c = startC;
	}
	
	public Numero getNCarte() {
		return this.n;
	}
	public Couleur getCCarte() {
		return this.c;
	}
	public TypeCarte getTCarte(){
		return this.t;
	}
	
	public String afficheCarte() {
		 String s = "La carte possédée est de numéro " + this.n +
				" de couleur " + this.c +
				" de type " + this.t ;
				return s;
	}
	
	
	public static void main(String arg[]) {
		
		//Carte a = new Carte(Numero.Un, TypeCarte.Carreau, Couleur.Noire);
		//a.afficheCarte();
		
		for( Numero p : Numero.values())
		{
			System.out.println(p);
			Carte a = new Carte(p, TypeCarte.Carreau, Couleur.Noire);
			a.afficheCarte();
		}
		
	}
	
}
