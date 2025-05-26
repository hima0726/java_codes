package javafs;

public class DisplayLowerCaseAndUpperCaseLetters {

	   public static void main(String args[])
	   {
	       String str="aBACbcEDed";

	       StringBuilder uppercase = new StringBuilder();
	       StringBuilder lowercase =new StringBuilder();

	       for(char c : str.toCharArray())
	       {

	              if(Character.isLowerCase(c))
	              {
	                  lowercase.append(c);

	              }
	              else {
	                  uppercase.append(c);
	              }

	       }

	        System.out.println("lower case:" + lowercase);
	        System.out.println("upper Case:" + uppercase);
	   }
	}