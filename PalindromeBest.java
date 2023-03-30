import java.util.Scanner;
class PalindromeBest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String p="";
		boolean ans = isPalindrome(str);
		if(ans==true)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
		/*
		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			p=ch+p;
			System.out.println(p);
		}
		if(p==str)
			System.out.println(p +" Palindrome");
		else
			System.out.println("NOT PALINDROME");
		*/
	}
	public static boolean isPalindrome(String str){
		int i = 0;
		int j = str.length()-1;
		while(i<j){
			if(str.charAt(i)!= str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}
		