package listes;

import java.util.ArrayList;

public class TestListeInt {

	public static void main(String[] args) {
		ArrayList<Integer> liste1 = new ArrayList<Integer>();
		liste1.add(-1);
		liste1.add(5);
		liste1.add(7);
		liste1.add(3);
		liste1.add(-2);
		liste1.add(4);
		liste1.add(8);
		liste1.add(5);
		System.out.println("Afficher tous les éléments de la liste");
		for(Integer number : liste1) {
			System.out.println(number);
		}
		System.out.println("Afficher la taille de la liste");
		System.out.println(liste1.size());
		System.out.println("Afficher le plus grand élément");
		Integer biggestNumber=0;
		for(Integer numberInteger : liste1) {
			if(numberInteger>biggestNumber) {
				biggestNumber = numberInteger;
			}
		}
		System.out.println(biggestNumber);
		System.out.println("Supprimer le plus petit élément");
		Integer lowestNumber=0;
		for(Integer numberInteger : liste1) {
			if(numberInteger<lowestNumber) {
				lowestNumber = numberInteger;
			}
		}
		liste1.remove(lowestNumber);
		System.out.println(liste1);
		System.out.println("Transformer les éléments négatifs en éléments positifs");
		for(int i=0; i<liste1.size(); i++) {
			if(liste1.get(i)<0) {
				liste1.set(i, liste1.get(i)*-1);
			}
		}
		System.out.println(liste1);
	}

}
