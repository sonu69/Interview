package javaProg;

public class ReverseName {

	public static void main(String[] args) {
	
		int[] age = {5,2,45,32,8,10};
		
		int largestNum = age[0];
		
		
		for(int i=1;i<age.length;i++) {
			
			if(largestNum<age[i]) {
				age[i]=largestNum;
			}else {
				
			}
			
		}
		
	}


}
