/*
 5.1 Compute partity
 
 ComputerParity.java
*/

public class ComputerParity {
	
	public static int parityCheck(String word) {
		long startTime =  System.nanoTime();
		int length = word.length();
		int count =0;
		char charArr[] = new char[length];
		charArr = word.toCharArray();
		for(int i=0; i< charArr.length; i++) {
			if ( charArr[i] == '1')  count++;
			if ( charArr[i] == '0')  count = count;
			  
		}
		count = count%2 ;
		long during = System.nanoTime() - startTime;
		return count;
			
	}
	
	// There is a neat trick that erase the lowest set bit in a word in a single operation 
	// which can be used to improve performance  in the best and average cases
	public static short parity(long x) {
		short result =0;
		while(x !=0 ) {
			result ^= 1; 
			x &= (x-1);  // Drops the lowest set bit of x;
		}
		return result;
		
	}
	 public  static void main(String args[]) {
		 String wordList[] = { "10001000", "10001001"} ;
		 long xList[] = {10001000, 10001001	};
		 	long startTime = System.nanoTime();
		 for( int i=0;  i< wordList.length; i++) {		 
			 System.out.println(String.format("parityCheck(%s) =%d", wordList[i], parityCheck(wordList[i])));
		 
		 	long duration = System.nanoTime() - startTime;
			System.out.println (String.format("Duration =%d ms" , duration/1000));
		}
		
		
	 	long startTime2 = System.nanoTime();
	  for( int i=0;  i< xList.length; i++) {		 
		 System.out.println(String.format("parityCheck(%s) =%d", xList[i], parity(xList[i])));
	 
	 	long duration2 = System.nanoTime() - startTime2;
		System.out.println (String.format("Duration =%d ms" , duration2/1000));
	}
	
		
	 }	
}
