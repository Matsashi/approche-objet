package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	
	public static Cercle createCercle(double newRayon) {
		Cercle cercle1 = new Cercle(newRayon);
		return cercle1;
	}
}
