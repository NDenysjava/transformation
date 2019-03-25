package transformation;

import java.util.ArrayList;

public class Transformation {		
			
			public static int number = getSumByDiv(12345);
			public static int number1 = getSumByChars(12345);
				
						

		private static int getSumByDiv(int number) {
			 int result = 0;
			while (number != 0) {
				result = result + number%10;
				number = number/10; 
				
				}
			return result;
			
		}
		private static int getSumByChars(int number1) {
			String numAsString = String.valueOf(number1);
						
			char[] chars = numAsString.toCharArray();
			char q = numAsString.charAt(0);
			char q1 = numAsString.charAt(1);
			char q2 = numAsString.charAt(2);
			char q3 = numAsString.charAt(3);
			char q4 = numAsString.charAt(4);
			int r1 = Character.getNumericValue(q);
			int r2 = Character.getNumericValue(q1);
			int r3 = Character.getNumericValue(q2);
			int r4 = Character.getNumericValue(q3);
			int r5 = Character.getNumericValue(q4);
			
			ArrayList<Integer> list = new ArrayList<>();
	          list.add(r1);
	          list.add(r2);
	          list.add(r3);
	          list.add(r4);
	          list.add(r5);
	          
	          int sum = 0;
	          for ( int i : list) {
	        	  sum += i;
	        	  
	          }
			
			
		   
			return sum;
			
			
		}
		public static void main(String[] args) {
			
			System.out.println(number);
			System.out.println(number1);
		}
			
}