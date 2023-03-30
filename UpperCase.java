//Find capital letter in string
class UpperCase{
	public static void main(String[] args){
		String name = "saiFul";
		
		//System.out.println(name.toUpperCase());
		//System.out.println(name.toLowerCase());
		/*
		for(int i=0;i<name.length();i++){
			char ch = name.charAt(i);
			char ch1 = Character.toUpperCase(ch);
			//System.out.println(ch);
			//System.out.println(ch1);
			if(ch==ch1)
				System.out.println(ch);
			
		}
		*/
		char ans = getCapital(name);
		char ansRec = getCapitalRec(name,0);
		System.out.println(ans);
		System.out.println(ansRec);
		
	}
	public static char getCapital(String name){
		for(int i=0;i<name.length();i++){
			if(Character.toUpperCase(name.charAt(i))==name.charAt(i))
				return name.charAt(i);
		}
		return 0;
	}
	public static char getCapitalRec(String name,int index){
		if(name.charAt(index)=='\0')
			return 0;
		if(Character.toUpperCase(name.charAt(index))==name.charAt(index))
			return name.charAt(index);
		return getCapitalRec(name,index+1);
	}
		
		
}