package Collectionpgms;

import java.util.*;

public class Setpgms {

	public static void main(String[] args) {

		Integer[] a = { 33, 22, 43, 56, 55, 78, 44, 76 };
		Integer[] b = { 44, 56, 43, 78, 2, 4, 45, 3, 8 };

		Set<Integer> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(a));
		Set<Integer> set2 = new HashSet<>();
		set2.addAll(Arrays.asList(b));

		Iterator<Integer> i = set1.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println(set2.contains(3));

		Set<Integer> union = new HashSet<>(set1);
		union.addAll(set2);
		System.out.println(union);
		System.out.println(set2.containsAll(set1));
		System.out.println(set2.hashCode());
		System.out.println(set2.isEmpty());
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);

		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);

	}

}
