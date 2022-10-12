package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		new CercleFactory();
		Cercle cercle1 = CercleFactory.createCercle(5.05);
		Cercle cercle2 = CercleFactory.createCercle(10.075);
		System.out.println(cercle1.perimeter());
		System.out.println(cercle1.area());
		System.out.println(cercle2.perimeter());
		System.out.println(cercle2.area());
	}

}
