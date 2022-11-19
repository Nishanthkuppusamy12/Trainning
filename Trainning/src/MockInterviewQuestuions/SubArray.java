package MockInterviewQuestuions;

public class SubArray {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		int n = arr.length;
		int k=3;
		int result =0;
		
		for(int i=0;i<n;i++) {
			int sum =0;
			
			for(int j=i;j<n;j++) {
				 
				sum = sum +arr[j];
				if(sum == k) {
					result++;
				}
			}
		}
		System.out.println(" number of subArrays that sums up to "+k+ " is " + result);
		
	}

}
