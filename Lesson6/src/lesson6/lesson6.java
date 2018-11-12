package lesson6;

public class lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("Assignment Operators");
		  int num1 = 100;
	      int num2 = 20;

	      System.out.println("num1 + num2: " + (num1 + num2) );
	      System.out.println("num1 - num2: " + (num1 - num2) );
	      System.out.println("num1 * num2: " + (num1 * num2) ); 
	      System.out.println("num1 / num2: " + (num1 / num2) );
	      System.out.println("num1 % num2: " + (num1 % num2) );
	      
	      //Assignment Operators
	      System.out.println("Assignment Operators");
	      num1 = 10;
	      num2 = 20;

	      num2 = num1;
	      System.out.println("= Output: "+num2);

	      num2 += num1;
	      System.out.println("+= Output: "+num2);
		      
	      num2 -= num1;
	      System.out.println("-= Output: "+num2);
		      
	      num2 *= num1;
	      System.out.println("*= Output: "+num2);
		      
	      num2 /= num1;
	      System.out.println("/= Output: "+num2);
		      
	      num2 %= num1;
	      System.out.println("%= Output: "+num2);
	      
	      //Auto increment and Auto decrement
	      System.out.println("Auto Increment and Auto Decrement");
	      num1 = 10;
	      num2 = 20;

	      num2 = num1;
	      System.out.println("= Output: "+num2);

	      num2 += num1;
	      System.out.println("+= Output: "+num2);
		      
	      num2 -= num1;
	      System.out.println("-= Output: "+num2);
		      
	      num2 *= num1;
	      System.out.println("*= Output: "+num2);
		      
	      num2 /= num1;
	      System.out.println("/= Output: "+num2);
		      
	      num2 %= num1;
	      System.out.println("%= Output: "+num2);
	      
	      //boolean logic
	      System.out.println("Boolean Logic");
	      boolean b1 = true;
	      boolean b2 = false;

	      System.out.println("b1 && b2: " + (b1&&b2));
	      System.out.println("b1 || b2: " + (b1||b2));
	      System.out.println("!(b1 && b2): " + !(b1&&b2));
	      
	      //relationship
	      System.out.println("Relationship Operators");
	      num1 = 10;
	      num2 = 50;
	      if (num1==num2) {
	    	  System.out.println("num1 and num2 are equal");
	      }
	      else{
	    	  System.out.println("num1 and num2 are not equal");
	      }

	      if( num1 != num2 ){
	    	  System.out.println("num1 and num2 are not equal");
	      }
	      else{
	    	  System.out.println("num1 and num2 are equal");
	      }

	      if( num1 > num2 ){
	    	  System.out.println("num1 is greater than num2");
	      }
	      else{
	    	  System.out.println("num1 is not greater than num2");
	      }

	      if( num1 >= num2 ){
	    	  System.out.println("num1 is greater than or equal to num2");
	      }
	      else{
	    	  System.out.println("num1 is less than num2");
	      }

	      if( num1 < num2 ){
	    	  System.out.println("num1 is less than num2");
	      }
	      else{
	    	  System.out.println("num1 is not less than num2");
	      }

	      if( num1 <= num2){
	    	  System.out.println("num1 is less than or equal to num2");
	      }
	      else{
	    	  System.out.println("num1 is greater than num2");
	      }
	      
	      //bitwise operators
	      System.out.println("Bitwise Operators");
	      num1 = 11;  /* 11 = 00001011 */
	      num2 = 22;  /* 22 = 00010110 */
	      int result = 0;

	      result = num1 & num2;   
	      System.out.println("num1 & num2: "+result);

	      result = num1 | num2;   
	      System.out.println("num1 | num2: "+result);
	     
	      result = num1 ^ num2;   
	      System.out.println("num1 ^ num2: "+result);
	     
	      result = ~num1;   
	      System.out.println("~num1: "+result);
	     
	      result = num1 << 2;   
	      System.out.println("num1 << 2: "+result); result = num1 >> 2;   
	      System.out.println("num1 >> 2: "+result);
	      
	      //Ternary Operator
	      System.out.println("Ternary Operators");
	      num1 = 25;
	        /* num1 is not equal to 10 that's why
		 * the second value after colon is assigned
		 * to the variable num2
		 */
		num2 = (num1 == 10) ? 100: 200;
		System.out.println( "num2: "+num2);

		/* num1 is equal to 25 that's why
		 * the first value is assigned
		 * to the variable num2
		 */
		num2 = (num1 == 25) ? 100: 200;
		System.out.println( "num2: "+num2);
	      
	}

}
