package Game;

public enum Couleur {
	Rouge, Noire;
	
	private static Couleur[] list = Couleur.values();
	
	public static Couleur getCouleur(int i) {
		return list[i];
	}
	public static int getLastIndex(){
		return list.length -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Couleur a = Couleur.Noire;
		System.out.println(a);
	}

}
