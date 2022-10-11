package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		AdressePostale maison1 = new AdressePostale(10, "rue de la république", 28110, "Lucé");
		AdressePostale maison2 = new AdressePostale(5, "boulevard des maréchaux", 44100, "Nantes");
		Personne personne1 = new Personne("Matthew", "Pottier", maison1);
		Personne personne2 = new Personne("Test", "Ostérone", maison2);
		

	}

}
