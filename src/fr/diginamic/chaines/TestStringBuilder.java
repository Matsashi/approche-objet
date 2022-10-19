package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		long debut = System.currentTimeMillis();
		StringBuilder counter = new StringBuilder();
		for(Integer i=1; i<=100000; i++) {
			counter.append(i.toString());
		}
		long fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes : " + (fin-debut));
		String counter2 = "";
		for(Integer i=1; i<=100000; i++) {
			counter2 = counter2 + i;
		}
		fin = System.currentTimeMillis();
		System.out.println("Temps écoulé en millisecondes : " + (fin-debut));
		
	}

}
