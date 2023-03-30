public class RotateString{
	public static void main(String[]args){
		String s = "abcde";
		String t = "cdeab";
		System.out.println(isRotate(s,t));
	}
	public static boolean isRotate(String s,String t){
		return s.length() == t.length() && (s+t).contains(t);
	}
}