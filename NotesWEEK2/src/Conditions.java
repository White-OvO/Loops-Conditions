
public class Conditions {
	public static void main (String[] args) {
		String name = "Christopherg";
		
		// WEEK@2 CONDITIONS

			
			
		if(name == "Chris") {
			System.out.println("Hello im Chris");
		
		} else {
			System.out.println("You are not Chris");
			
		}		
			
			int age = 13;
			
			if(age >= 16) {
				System.out.println("You can get your lincese!");
			}  else {
				System.out.println("Please wait" + "  " + ( 16 - age )+ "year(s) to get your lincese");
			
			}
			
			double costOfMilk = 2;
			
			if(costOfMilk <= 2) {
				System.out.println("Buying two");
			} else if (costOfMilk <= 5 ) {
				System.out.println("Buying 1");
			} else {
				System.out.println("Not Buying any milk ");
			}

			char grade = 'C';
				
			switch (grade) {
				case 'A' :
					System.out.println("90%");
					break;
				case 'B' :
					System.out.println("80%");
					break;
				case 'C' :
					System.out.println("70%");
					break;
				
				
				default :
					System.out.println("0%");
				
		}
			
			if (5 == 5) {
				if (4 == 4) {
					System.out.println("5 is 5 and 4 is 4");
				} else {
					System.out.print("5 is 5");
				}
	}
			if (5 == 5 && 4 ==4) {
				System.out.println("yes");
				
				System.out.println(2 == 2 );
				System.out.println(2 > 5 );
				System.out.println(5 <= 5);
				System.out.println(2 == 2 && 1 <5);
				System.out.println(true && true);
				System.out.println(true && false);
			System.out.println(false || false );
			System.out.println(true || false );
			System.out.println(2 == 2 || 1 ==5);
			System.out.println(2 < 1 || 1 == 5);
		System.out.println("Hello FRiends");
		System.out.println("Hello FRiends");	
		System.out.println("Hello FRiends");
		System.out.println("Hello FRiends");
		System.out.println("Hello FRiends");
		
		
		
	/*
	 * 
		Question how do I make a new string in the project without haveing a new line printed out with public
		status
		
	 * 
	 * 
	 */
		
		
		if (name == "Chris") {
			System.out.println("Hello Chris!");
		} else { 
			System.out.println("Your not Chris!" + " " + name );
		}
		
		
		
		
		
		String word1 = "HI there!";
		String word2 = "Well, Hello friend.";
		
				if (word1.length() > word2.length() ) {
		System.out.println("word1  has more characters");
				} else {
			
		System.out.println("Word2 has more characters");
		
		
			
	///// WRONG  BELOW !  will not print below
		int num = 48;
		if ( num > 100 ) {
			System.out.println("numer is Greater than 100");
		if  (num < 100) {
			System.out.println("number is Less than 50");
		} else {
			System.out.println("You hit the spot!");
			
			
			int a = 495;
			int b = 243;
			
			if ( ( a*b) % 2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
				
				// working with conditonals ( break does not need a B just a b ).   
				int num1 = 3;
				char letter;
				
				switch (num1) {
				case 1:
					letter = 'a';
					break;
				case 2:
					letter = 'b';
					break;
				case 3:
					letter = 'c';
					break;
				case 4:
					letter = 'd';
					break;
				case 5:
					letter = 'f';
					break;
				default:
					letter ='z';
				}
				
				
				
				
			}
			
			
			
	
	 	}
		
		}
		}
		
		
		
		

			
			}
	}
}
