package Game;

public enum Numero {
	Un, Deux, Trois, Quatre, Cinq, Six, Sept, Huit, Neuf, Dix, Valet, Dame, Roi ;
	
	private static Numero[] list = Numero.values();
	
	public static Numero getNumero(int i) {
		return list[i];
	}
	public static int getLastindex() {
		return list.length - 1 ;
	}
	
}
