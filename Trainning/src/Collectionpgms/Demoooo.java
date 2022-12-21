package Collectionpgms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demoooo {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1,2,3,4,5,6);
		List<Integer> k =li.stream().filter(e->e%2==0).map(e->e*e).collect(Collectors.toList());
		System.out.println(k);
	}
}
