import java.util.*;
class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str= sc.nextLine();
		System.out.println(palindrome(str));
	}
	static boolean palindrome(String str){
		str=str.toLowerCase();
		for(int i=0;i<str.length()/2;i++){
			char l = str.charAt(i);
			char r = str.charAt(str.length()-1-i);
			if(l!=r)
				return false;
		}
		return true;
	}
	
}