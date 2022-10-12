package fr.diginamic.operations;

import java.text.DecimalFormat;

public class Operations {
	
	public static String calcul(double a, double b, char operator) {
		String resultat;
		if(operator == '+') {
			resultat = "Le résultat est " + (a+b);
		}else if (operator == '-') {
			resultat = "Le résultat est " + (a-b);
		}else if (operator == '/') {
			resultat = "Le résultat est " + new DecimalFormat("0.00").format(a/b);
		}else if (operator == '*') {
			resultat = "Le résultat est " + new DecimalFormat("0.00").format(a*b);
		}else {
			resultat = "Vous n'avez pas renseigner d'opérateur.";
		}
		return resultat;
	}
}