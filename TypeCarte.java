package Game;

public enum TypeCarte {
	Treffle,
	Pique,
	Carreau,
	Coeur;
	
	private static TypeCarte[] list = TypeCarte.values();
	public static TypeCarte getTypeCarte(int i) {
		return list[i];
	}
	
	public static int getLastIndex() {
		return list.length - 1;
	}
}
