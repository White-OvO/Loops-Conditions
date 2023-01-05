/**
 * 
 */
/**
 * @author Gaby
 *
 */
module project_lab_work {
	/*
	  //// Modulo Operator = % is the same as division. 
	
}
//CHP2_EX1
//Write an equation that uses num1, num2, num3, and num4. In this equation you will divide num1 by num2 and assign that value to a double variable named 
//answer1. Then create a double variable named answer2. In answer2 you will assign the product of num3 x num4. 
//Then create another double variable named finalAnswer and assign to that the value of answer1 added to answer2. 



//public static void main(String[] args) {
//Scanner in = new Scanner(System.in);
//double num1, num2, num3, num4;
//num1 = in.nextDouble();
//num2 = in.nextDouble();
/num3 = in.nextDouble();
/num4 = in.nextDouble();

// add your code below this line
////SOLUTION 



//double answer1, answer2, finalAnswer;
//answer1 = num1 / num2;
//answer2 = num3 * num4;
//finalAnswer = answer1 + answer2;





			// CHP2_EX2
///You are given 3 variables, num1, num2, and num3; all are of type double. Divide num1 by num2 and then divide that answer by num3. Formatted like this: ( 1 / 2) / 3 Assign the answer to a variable of type double named myDivision.
	
	/		Scanner in = new Scanner(System.in);
	/				double num1, num2, num3;
	/num1 = in.nextDouble();
	num2 = in.nextDouble();
	num3 = in.nextDouble();
	
	// Solution 
	Scanner in = new Scanner(System.in);
	double num1, num2, num3;
	num1 = in.nextDouble();
	num2 = in.nextDouble();
	num3 = in.nextDouble();
	//solution
	double myDivision = (num1 / num2) / num3;
	
	
	
	
	
	
	
	//// Create an equation that adds num1 and num2 and then multiply that by num3. Format it as follows: (2 + 2) x 3. Assign that answer to variable named yourAnswer.
	
	Scanner in = new Scanner(System.in);
	int num1, num2, num3;
	num1 = in.nextInt();
	num2 = in.nextInt();
	num3 = in.nextInt();
	
	/Solution
	NA
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// CHP2_EX:3
	//Using two String variables, firstName and lastName, 
		Write an equation that will concatenate the two Strings and assign the value to a String variable fullName. 
		Make sure your add a space between firstName and lastName (ex. "John Doe").
	
	Scanner in = new Scanner(System.in);
	String firstName = in.nextLine();
	String lastName = in.nextLine();
	// add your code below this line 
	
	//Wrong answer (myfirst respounce)
	String firstName = "Tom";
	String lastName = "Sawyer";
	String fullName = ("firstName" + " " + "lastName");
	
	//// SOLUTION 
	  //read instructions the first name and last name strings are already given and there for we must
	     ajust string a fullname like the instructions stated opt; note there is no " " .  
	    
	     
	     
	     Answer - String fullName = firstname + " " + lastName;
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     Pratice String test;
	     public static svoid main(string[]args) {
	    	 String word1 = " Hello ";
	    	 String word2 = " World"
	         String word3 =  "Crazy"
	         
	          /// system.out.print(word1 + word3 + word2) this command will read "Hello Crazy World"
	         
	         
	         
	         
	         
	         
	         
	         
	  
	         
	         // CHP2 Example 4. Using the modulo operator find the remainder of num1 divided by num2. 
	            //Assign that answer to an integer variable called finalAnswer.
	         
	        		 public static void main(String[] args) {
	     		Scanner in = new Scanner(System.in);
	     		int num1, num2;
	     		num1 = in.nextInt();
	     		num2 = in.nextInt();
	     		// add your code below this line
	     		
	     			//personal solution (wrong)
	     			double finalAnswer = num1 /num2 ;
	        
	     			//Solution
	     			int finalAnswer = num1 % num2;
	         
	         
	         
	         
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			
	     			// CHP2 EXP5.   Create an equation that adds num1 and num2 and then multiply that by num3. Format it as follows: (2 + 2) x 3. 
	     			//Assign that answer to variable named yourAnswer.     			
	     			/public static void main(String[] args) {
	     				Scanner in = new Scanner(System.in);
	     				int num1, num2, num3;
	     				num1 = in.nextInt();
	     				num2 = in.nextInt();
	     				num3 = in.nextInt();

	     		        // write your code below this line
//Wrong answer:
	     			double  youranswer= (num1 + num2) *Num3;	
	     			
	     			///right answer
	     			/ int yourAnswer = (num1 + num2) * num3;
	     			
	     			
	     			
	     			
	     	//You are given 3 variables; num1, num2, and num3. 

First, multiply num1 and num2 together. Second, find the remainder of that product (num1 * num2) when divided by num3 (use the modulo (%) operator). 

Do the entire operation in one line and assign the answer to the variable myAnswer. 

Make sure you use the normal order of operations (PEMDAS)		
	     			
				//public static void main(String[] args) {
//Scanner in = new Scanner(System.in);
//int num1, num2, num3;
//num1 = in.nextInt();
//num2 = in.nextInt();
//num3 = in.nextInt();
//( Wronganswer)
/
//  (ANSwer)
int myAnswer = (num1 * num2) % num3;










/*
 * 
 * 
 * 
 */















///Write a program that creates a new variable of type int named multiplyResults. 
//Multiply the values in num1 and num2 together and assign that product to the variable you created multiplyResults.



/public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num1, num2;
	num1 = in.nextInt();
	num2 = in.nextInt();
	
// add your code belowb WRONG
                int multiresults = (num1 * num2)

    		
  // add your code above ANSWER
    			int multiplyResults = num1 * num2;
		



                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                /*Chp2 question 8
                 * 
                 * 
                 * 
                 * Larger or Smaller? Create an if/else statement that will print "Larger" if firstNumber is 
                 * larger than secondNumber or print "Smaller" otherwise.
                 * 
                 * 
                 * 
                 * 
                 * 
                 * 
					                 * A: public static void main(String[] args) {
							Scanner in = new Scanner(System.in);
							int numericGrade = in.nextInt();
							// Do not change the code above this line
					
							// write your if/else if statement here and check your conditions using the variable numericGrade
					
					A:									public static void main(String[] args) {
									Scanner in = new Scanner(System.in);
									int firstNumber = in.nextInt();
									int secondNumber = in.nextInt();
									
									//Add your code here:
									if (firstNumber > secondNumber) {
									    System.out.println("Larger");
									} else {
									    System.out.println("Smaller");
									}
									
								}
							}
                 * 
                 */
                
                
                
                
                
                
                
                /* chp2 q 9
              * 
     * How Many Digits Are In A Number? Create an if / else if statement to determine how many digits are in the variable 
     *  num and then prints a message to the console indicating how many digits are in num. Depending on the result, print one the following:
     *  num + " is a two digit number." num + " is a three digit number." num + " is a four digit number." num + " is a five digit number." "Your number is smaller than 10 or larger than 99999."
     *  
     *  
     *  A:
     * public static void main(String args[]){
				        Scanner in = new Scanner(System.in);
				        int num=in.nextInt();
				        
				       //write your conditional statement below this line
				        if(num <100 && num>=10) {
				            System.out.println(num + " is a two digit number.");
				        }
				        else if(num <1000 && num>=100) {
				            System.out.println(num + " is a three digit number.");
				        }
				        else if(num <10000 && num>=1000) {
				            System.out.println(num + " is a four digit number.");
				        }
				        else if(num <100000 && num>=10000) {
				            System.out.println(num + " is a five digit number.");
				        }
				        else {
				            System.out.println("Your number is smaller than 10 or larger than 99999.");
				        }
				    }
				}  
     *  
     *  
                
                

                
         
                
                
                
                
                
                
                /*CHp2 q 10        Smaller, Larger or Equal
* Smaller, Larger or Equal? Create an if/else if statement that checks myNumber against 
*um1 and based on which condition evaluates to true, print one of the following messages:
num1 + " is smaller than my number, " + myNumber num1 + " is larger than my number, " + myNumber num1 + " is equal to my number, " + myNumber
*
* 
*/
                
                
                
                
                
                
                
                
                
                
                
                                *
                                *
                                *
                 */
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	     }
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
}