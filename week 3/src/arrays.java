import java.lang.reflect.Array;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ages = new int[9];
		//array of ages
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5]	= 8;
		ages[6] = 28;
		ages[7]	= 93;
		ages[8] = 22;
		// average age print
		System.out.println(average(ages));
		//subtraction code
			int i = ages[ages.length - 1] - ages[0];
			System.out.println("age difference:");
			System.out.println(i);
			
		   String[] names = new String[6];{
				names[0] = "Sam";
				names[1] = "Tommy";
			    names[2] = "Tim";
				names[3] = "Sally";
				names[4] = "Buck";
				names[5] = "Bob";
				}
		   //below, i commented out my attempt at a question on the homework because i was spending multiple amounts of hours on it, yet i couldn't
		   //quite figure it out and it was holding me back from the rest of the course. if you could let me know the correct code, and why, that 
		   //would be great because this specific problem in the homework drove me nuts and i want to know the correct way of doing it that way i
		   // have something to lean back on in case i run into the same problem in the future. thank you!
		   //I really hate leaving something blank, but i truly tried my hardest and went to all kinds of online resources.	   //
		   //
		   //
	//	int[] nameLengths = new int[names.length - 1];	{
	//		for(int l = 1; l <= names.length; l ++ ) {
	//			names[l - 1] = names[l];
	//			System.out.println(l);
	//			}
	//		}	
			System.out.println("average number of characers per name");
			System.out.println(averageNumberOfChar(names));
			System.out.println("concatination");
			System.out.println(createConcatination(names));
			}
				
			
		
			public static int sum(int[] numbers , String String) {
				int sum = 0;
				for (int number : numbers) {
					sum += number;
				}
			return sum;
			}
			public static int average(int[] numbers) {
				int sum = 0;
				for (int number : numbers) {
					sum += number;
				}
				System.out.println("average age:");
			return sum / numbers.length;
       }
			public static int averageNumberOfChar(String[] names) {
				int total=0;
				for (int j = 0; j < names.length; j++) {
					total += names[j].length();
					
				}
				return total / names.length;
			}
			public static String createConcatination(String[] names) {
				int k = 0;
				String concatination = names[k];
				for(k = 0; k < names.length; k++) {
					System.out.print(names[k] + " ");
				}
				return concatination;
			}
			public static String multiplyString(String str, int num) {
				String result = "";
				for (int i = 0; i < num; i++) {
					result += str;
				}
				return result;
			}
			public static String fullName(String first, String last) {
				String result = first + " " + last;
				return result;
				}
			public static boolean sumGreaterThan100(int[] numbers ) {
				int sum = 0;
				for (int number : numbers) {
					sum += number;
					if(sum > 100) {
					return true;
					}
					else {
						return false;
					}
		       }
	  }
			public static double average(double[] numbers) {
				double sum = 0;
				for (double number : numbers) {
					sum += number;
				}
				return sum / numbers.length;
			}
			public static boolean arrayAverages(double[] numbers, double[] moreNumbers) {
				double average = 0;
				for (double number : numbers) {
					average += number / numbers.length;
					double moreAverage = 0;
					for (double moreNumber : moreNumbers) {
						moreAverage += moreNumber / moreNumbers.length;
					}
					if(average > moreAverage) {
						return true;
					}
					else {
						return false;
					}
				}
			}
			public static boolean willBuyDrink(boolean isHotOutside, double hasMoneyInPocket) {
				if(isHotOutside = true && hasMoneyInPocket > 10.50) {
					return true;
				}
				else {
					return false;
				}
			}
			public static boolean willGoToTheGym(boolean hasEnergy, int temperature) {
				if (hasEnergy = true && temperature <= 90) {
					return true;
				}
				else {
					return false;
				}
				// the above boolean method "willGoToTheGym" states true if one both has energy and the temperature is at a certain level.
				//I chose to use it because i enjoy boolean operators and methods the most. also, this method is relevant to my personal life, lol.
}
}

				
			
			
		
	
	
			
			
	
   		


