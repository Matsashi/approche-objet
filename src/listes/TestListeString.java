package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class TestListeString {

	public static void main(String[] args) {
		ArrayList<String> liste1 = new ArrayList<String>();
		liste1.add("Nice");
		liste1.add("Carcassonne");
		liste1.add("Narbonne");
		liste1.add("Lyon");
		liste1.add("Foix");
		liste1.add("Pau");
		liste1.add("Marseille");
		liste1.add("Tarbes");
		System.out.println("Afficher la ville avec le plus grand nombre de lettres");
		String longestName = "";
		for(String town : liste1) {
			if(town.length()>longestName.length()) {
				longestName = town;
			}
		}
		System.out.println(longestName);
		System.out.println("Changer tous les noms de ville en majuscules");
		for(int i=0; i<liste1.size(); i++) {
			liste1.set(i, liste1.get(i).toUpperCase());
		}
		System.out.println(liste1);
		System.out.println("Supprimer les villes qui commencent par N");
		Iterator<String> iter = liste1.iterator();
		while(iter.hasNext()) {
			String town = iter.next();
			if(Character.compare(town.charAt(0), 'N')==0) {
				iter.remove();
			}
		}
		System.out.println(liste1);
	}

}
