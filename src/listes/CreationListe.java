package listes;

import java.util.ArrayList;
import java.util.Iterator;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		for(int i=1; i<=100; i++) {
			list1.add(i);
		}
		System.out.println(list1.size());
	}

}
