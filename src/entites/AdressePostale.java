package entites;

public class AdressePostale {
	
	public int number;
	public String name;
	public int postalCode;
	public String city;
	
	public AdressePostale(int newNumber, String newName, int newPostalCode, String newCity) {
		number = newNumber;
		name = newName;
		postalCode = newPostalCode;
		city = newCity;
	}
}
