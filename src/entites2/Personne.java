package entites2;

import entites.AdressePostale;

public class Personne {
	public String name;
	public String lastname;
	public AdressePostale postalAdress;
	
	public Personne(String newName, String newLastname, AdressePostale newAdress) {
		name = newName;
		lastname = newLastname;
		postalAdress = newAdress;
	}
	public String displayName() {
		String fullName = this.name + "" + this.lastname.toUpperCase();
		return fullName;
	}
}
