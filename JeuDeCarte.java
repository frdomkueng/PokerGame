package Game;

public class JeuDeCarte {
	
	public static final byte a = 52;
	
	public Carte[] paquetDeCarte ;
	
	public JeuDeCarte() {
		// initailisation par type de carte 
		this.paquetDeCarte = new Carte[a];
		for (Numero p : Numero.values())
		{
			for(TypeCarte t : TypeCarte.values())
			{
				int i = 0;
				if (t == TypeCarte.Carreau  || t == TypeCarte.Coeur ) 
				{
					Carte a = new Carte(p,t,Couleur.Rouge);
					a.afficheCarte();
					paquetDeCarte[i] = a;					
				}
				else {
					Carte b = new Carte(p,t,Couleur.Noire);
					b.afficheCarte();
					paquetDeCarte[i] = b;
				}
				i++;
			}
		}
	}
	
	public void afficherJeuDecarte () {
		for (int i=0; i< this.paquetDeCarte.length; i++)
		{
			this.paquetDeCarte[i].afficheCarte();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JeuDeCarte a = new JeuDeCarte();
		a.afficherJeuDecarte();
	}

}
