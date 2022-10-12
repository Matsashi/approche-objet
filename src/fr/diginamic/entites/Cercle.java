package fr.diginamic.entites;

import java.text.DecimalFormat;

public class Cercle {
	
	private double rayon;
	
	public Cercle(double newRayon) {
		setRayon(newRayon);
	}
	
	public String perimeter() {
		String perimetre = getRayon()*2 + "cm";
		return perimetre;
	}
	public String area() {
		String area = new DecimalFormat(".00").format(Math.pow(getRayon(), 2));
		return area + "cm²";
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}