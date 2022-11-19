package MockInterviewQuestuions;

import java.util.Optional;

public class Optionalclass {
	
	public static void main(String[] args) {
		
		String []s1 = {"a","b","c","d",null,"f"};
		Optional<String> opt =Optional.ofNullable(s1[4]);
		if(opt.isPresent())System.out.println(s1[4]);
		else System.out.println("value is NUll");
		opt.ifPresent(op ->System.out.println(opt)); 
		System.out.println(opt.orElse("default"));
	}

}
