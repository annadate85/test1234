package test;

public class Palindrome {

	public static void main(String[]args) {
		String name="dad";
		String rev="";
		for(int i=name.length()-1;i>=0;i--) {
			rev=rev+name.charAt(i);
		}
		System.out.println("actual result is "+ rev);
		System.out.println("exp reult is "+ name);
		if(name.equals(rev)) {
			System.out.println("the given is palidrome");
		}
		else {
			System.out.println("the given is not a palidrome");
	
		}
	}

}
