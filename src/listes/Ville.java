package listes;

import java.util.ArrayList;

public class Ville {
	private String name;
	private int population;
	
	public Ville(String name, int population) {
		this.setName(name);
		this.setPopulation(population);
	}

	public static void main(String[] args) {
		ArrayList<Ville> listeVilles = new ArrayList<Ville>();
		listeVilles.add(new Ville("Nice", 343000));
		listeVilles.add(new Ville("Carcassonne", 47800));
		listeVilles.add(new Ville("Narbonne", 53400));
		listeVilles.add(new Ville("Lyon", 484000));
		listeVilles.add(new Ville("Foix", 9700));
		listeVilles.add(new Ville("Pau", 77200));
		listeVilles.add(new Ville("Marseille", 850700));
		listeVilles.add(new Ville("Tarbes", 40600));
		
		System.out.println("Afficher la ville la plus peuplée");
		Ville mostPeopleTown = new Ville(null, 0);
		for(Ville town : listeVilles) {
			if(town.population > mostPeopleTown.population) {
				mostPeopleTown = town;
			}
		}
		System.out.println(mostPeopleTown.name);
		System.out.println("Supprimer la ville la moins peuplée");
		Ville leastPeopleTown = listeVilles.get(0);
		for(int i=1; i<listeVilles.size(); i++) {
			if(leastPeopleTown.population > listeVilles.get(i).population) {
				leastPeopleTown = listeVilles.get(i);
			}
		}
		System.out.println(leastPeopleTown.name);
		listeVilles.remove(leastPeopleTown);
		System.out.println("Modifier les noms des villes de plus de 100 000 habitants en majuscule et afficher la liste");
		for(int i=0; i<listeVilles.size(); i++) {
			if(listeVilles.get(i).population > 100000) {
				listeVilles.get(i).name = listeVilles.get(i).name.toUpperCase();
			}
		}
		for (int i=0; i<listeVilles.size(); i++) {
			System.out.println(listeVilles.get(i).name);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

}
