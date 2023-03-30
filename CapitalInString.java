class CapitalInString{
	public static void main(String[] args){
		String str = "geekForgeek";
		//System.out.println(capitalLetter(str));
		//System.out.println(capitalLetterRec(str,0));
		//System.out.println(reverseString(str));
		//reverseStringRec(str);
		System.out.println(lenghtOfStringRec(str));
	}
	public static String reverseString(String str){
		
		String p="";
		for(int i=0;i<str.length();i++)
			p=str.charAt(i)+p;
		return p;
	}
	public static int lenghtOfStringRec(String str){
		
	}
		
	/*
	public static int reverseStringRec(String str,int index){
		if(index==0)
			return;
		String p ="";
		p=p+str.charAt(index-1);
		reverseStringRec(str,index-1);
		System.out.println(p);
	}
			

	public static char capitalLetter(String str){
		if(str.length()==0)
			return 0;
		for(int i=0;i<str.length();i++){
			if(Character.toUpperCase(str.charAt(i))==str.charAt(i)){
				return str.charAt(i);
			}
		}
		return 0;
	}
	static char capitalLetterRec(String str,int index){
		if(str.charAt(index)=='\0')
			return 0;
		else if(Character.toUpperCase(str.charAt(index)))
			return str.charAt(index);
		try{
			return capitalLetterRec(str,index+1);
		}
		catch(Exception e){
			System.out.println(e);
		}
		return 0;
	}
	*/
}