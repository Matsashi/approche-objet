package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		new Operations();
		String calc1 = Operations.calcul(5, 10, '-');
		String calc2 = Operations.calcul(5, 10, '+');
		String calc3 = Operations.calcul(5, 10, '/');
		String calc4 = Operations.calcul(5, 10, '*');
		String calc5 = Operations.calcul(5, 10, 'a');
		
		System.out.println(calc1);
		System.out.println(calc2);
		System.out.println(calc3);
		System.out.println(calc4);
		System.out.println(calc5);

	}

}
