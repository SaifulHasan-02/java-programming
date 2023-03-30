class LinearStringSearch{
	public static void main(String[] args){
		String name="saiful";
		char target ='f';
		search(name,target);
		System.out.println(search(name,target));
		System.out.println(search2(name,target));
	}
	public static boolean search2(String str,char target){
		if(str.length()==0)
			return false;
		for(char ele : str.toCharArray()){
			if(ele==target)
				return true;
		}
		return false;
	}
	public static boolean search(String name ,char target){
		if(name.length()==0)
			return false;
		for(int i=0;i<name.length();i++){
			if(target==name.charAt(i))
				return true;
		}
		return false;
	}
}