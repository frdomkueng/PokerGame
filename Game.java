package Game;

import java.util.Scanner;

public class Game {
	
	public Player[] Players;
	public JeuDeCarte JeuDeCarte;
	public Player Donneur;
	
	public Game() {
		var scanner = new Scanner(System.in);
		System.out.println(" Saisir le nombre de player (s) " );
		int a = scanner.nextInt();
		this.Players = new Player[a];
		for(int i = 0; i < Players.length; i++)
		{
			var sc = new Scanner(System.in);
			System.out.println("Saisir le nom du jour " + i + " \n");
			String n = sc.next();
			this.Players[i] = new Player(n);
		}
		this.JeuDeCarte = new JeuDeCarte();
		this.Donneur = new Player();
		
	}
}
