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
		return name;
	}
	public String displayLastname() {
		return lastname;
	}
	public AdressePostale displayAdress() {
		return postalAdress;
	}
	public String displayFullName() {
		String fullName = this.name + " " + this.lastname.toUpperCase();
		System.out.println(fullName);
		return fullName;
	}
	public String changeLastName(String newLastName) {
		lastname = newLastName;
		return this.displayFullName();
	}
	public String changeName(String newName) {
		name = newName;
		return this.displayFullName();
	}
	public String changeAdress(AdressePostale newAdress) {
		postalAdress = newAdress;
		return this.displayFullName();
	}
	
}
