public class Stream{
	public static void main(String[] args){
		String up = "bacapplecad";
		String p = "";
		skip(p,up);
		String ans = skip2(up);
		String ans3 = skipApple(up);
		System.out.println(ans);
		System.out.println(ans3);
		
	}
	
	public static void skip(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		if(ch=='a'){
			skip(p,up.substring(1));
		}else{
			skip(p+ch,up.substring(1));
		}

	}
	public static String skip2(String up){
		if(up.isEmpty())
			return "";
		
		char ch = up.charAt(0);
		if(ch=='a'){
			return skip2(up.substring(1));
		}
		else{
			return ch+skip2(up.substring(1));
			
		}
	}
	public static String skipApple(String up){
		if(up.isEmpty())
			return "";
	
		if(up.startsWith("apple"))
			return skipApple(up.substring(5));
		return up.charAt(0)+skipApple(up.substring(1));
	}
		
}
		