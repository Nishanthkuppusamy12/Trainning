package MockInterviewQuestuions;

import java.util.HashSet;
import java.util.Set;

public class InterSection {
	public static void main(String[] args) {
		int arr1[]= {80,75,30,85,60};
		int arr2[]= {12,80,16,30,60};
		intersectionOfElements(arr1,arr2);
		printUnion(arr1,arr2 );
	}
	
	public static void printUnion(int arr1[],int arr2[]) {
		Set<Integer> s1 = new HashSet<>();
		for(int i=0;i<arr1.length;i++) {
			s1.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			s1.add(arr2[i]);
		}
		System.out.println("Union");
		System.out.println(s1);
	}
	public static void intersectionOfElements(int arr1[],int arr2[]) {
		
			
			Set<Integer> s = new HashSet<>();
			for(int i=0;i<arr1.length;i++) {

			s.add(arr1[i]);
			}
		for(int i=0;i<arr2.length;i++) {
			if(s.contains(arr2[i])) {
				System.out.println(arr2[i] + " ");
			}
		}
	}
}