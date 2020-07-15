package Game;
import java.lang.Math;
public class Player {

	public String Nom ;
	public Carte[] Main;
	public boolean Donneur = false;
	public boolean isLeftD = false;
	public static byte solde = 50;
	
	
	public Player (String startName) {
		this.Nom = startName;
		this.Main = new Carte[2];
		
		for (int p=0 ; p < this.Main.length; p++)
		{
			// choix aléatoire des cartes 
			int p1 = (int)(Math.random()*13);
			int p2 = (int)(Math.random()*4);
			int p3 = (int)(Math.random()*2);
			Main[p] = new Carte(Numero.getNumero(p1), TypeCarte.getTypeCarte(p2), Couleur.getCouleur(p3));
		}
		this.Donneur = false;
	}
	
	public Player()
	{
		this.Nom = "Donneur";
		this.Donneur = true;
		this.Main = new Carte[5];
		for(int p=0; p<this.Main.length; p++)
		{// choix aléatoire des cartes 
			int p1 = (int)Math.random()*13;
			int p2 = (int)Math.random()*4;
			int p3 = (int)Math.random()*2;
			Main[p] = new Carte(Numero.getNumero(p1), TypeCarte.getTypeCarte(p2), Couleur.getCouleur(p3));			
		}		
	}
	
	public byte getSolde() {return solde;}
	
	public void fold(byte a) {
		// passer
		solde = (byte) (this.getSolde() -a);
	}
	public void raise(byte a) {
		// rencherir
		solde = (byte) (this.getSolde() -a);
	}
	public void call(byte a) {
		// payer
		solde = (byte) (this.getSolde() -a);
	}
	
	public String afficherPlayer() {
		String s =  this.Nom + " possède cette main \n" ;
		
		for(int i =0 ; i< this.Main.length; i++) {
			s+= this.Main[i].afficheCarte();
			s+=" \n";
		}
		return s;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Player a = new Player("Franck");
		String s = a.afficherPlayer();
		System.out.println(s);
	}

}
