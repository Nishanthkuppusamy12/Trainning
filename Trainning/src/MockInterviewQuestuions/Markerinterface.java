package MockInterviewQuestuions;

public class Markerinterface implements Cloneable{
	
	int i=1999;
	String st = "Nishanth";
	
	
	@Override
	public String toString() {
		return "Markerinterface [i=" + i + ", st=" + st + "]";
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		
		Markerinterface mi = new Markerinterface();
		System.out.println(mi.toString());
		
		Markerinterface mi1 = (Markerinterface) mi.clone();
		System.out.println(mi1.toString());
		
	}

}
