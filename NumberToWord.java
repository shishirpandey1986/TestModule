package com.toshiba.practice;
 public class NumberToWord{
	 public static void main(String[] args) {
		 numbertoword1 a =new numbertoword1();
		a.display(5008);
	}
 }
	class  numbertoword1{
		String output;
		public String display(int n){
			String current = null;
			if(n<20){
				
			output=numNames[n];
				System.out.println(output);
			}else{
				int thousands=n/1000;
				int restofthousand = n%1000;
				String s=specialNames[thousands];
				System.out.println("thousands"+s);
				int  hundreds=restofthousand/100;
			//	String s2=hundreds[];
				
				//number is 789 if we use %10 we get 9 in current
	            current = numNames[n % 10];
	            n /= 10;
	            
	            current = tensNames[n % 10] + current;
	            n /= 10;
	        }
	        if (n == 0) return current;
	        return numNames[n] + " hundred" + current;
	    }
	    
	    private static final String[] specialNames = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	    };
	    
	    private static final String[] tensNames = {
	        "",
	        " ten",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	        " seventy",
	        " eighty",
	        " ninety"
	    };
	    
	    private static final String[] numNames = {
	        "",
	        " one",
	        " two",
	        " three",
	        " four",
	        " five",
	        " six",
	        " seven",
	        " eight",
	        " nine",
	        " ten",
	        " eleven",
	        " twelve",
	        " thirteen",
	        " fourteen",
	        " fifteen",
	        " sixteen",
	        " seventeen",
	        " eighteen",
	        " nineteen"
	    };
}
