package MockInterviewQuestuions;

import java.util.HashSet;
import java.util.Set;

public class OnlyDigites {
	
	public static void main(String[] args) {
		
		String s = "09";
		int len = s.length();
		System.out.println(containsDigits(s,len));
		
	}
	public static boolean containsDigits(String str , int n) {
		
	  for(int i=0;i<n;i++) {
		  if(str.charAt(i)<'0' || str.charAt(i)>'9') {
			  return false;
		  }
	  }
	  return true;
	}
}
