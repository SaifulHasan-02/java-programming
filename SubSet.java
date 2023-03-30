import java.util.*;
class SubSet{
	public static void main(String[] args){
		subSet("","abc");
		///subSetKhudSe("","abc");
		//subSetAscii("","abc");
	//	System.out.println(subSetRet("","abc"));
	//	System.out.println(subSetRetAscii("","abc"));
	
	}
	public static void subSet(String p, String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subSet(p+ch,up.substring(1));
		subSet(p,up.substring(1));
		
	}
	public static void subSetKhudSe(String p,String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subSetKhudSe(p+ch,up.substring(1));
		subSetKhudSe(p,up.substring(1));
	}
	public static String subSetAscii(String p,String up){
		if(up.isEmpty()){
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subSetAscii(ch+p,up.substring(1));
		subSetAscii(p,up.substring(1));
		subSetAscii(p+(ch+0),up.substring(1));
			
	}
	public static ArrayList<String> subSetRet(String p,String up){
		ArrayList<String> list = new ArrayList<>();
		if(up.isEmpty()){
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> left = subSetRet(p+ch,up.substring(1));
		ArrayList<String> right = subSetRet(p,up.substring(1));
		
		list.addAll(left);
		list.addAll(right);
		return list;
			
		
	}
	public static ArrayList<String> subSetRetAscii(String p,String up){
		ArrayList<String> list = new ArrayList<>();
		if(up.isEmpty()){
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> first = subSetRetAscii(ch+p,up.substring(1));
		ArrayList<String> second = subSetRetAscii(p,up.substring(1));
		ArrayList<String> third = subSetRetAscii(p+(ch+0),up.substring(1));
		
		list.addAll(first);
		list.addAll(second);
		list.addAll(third);
		return list;
	}
	
}