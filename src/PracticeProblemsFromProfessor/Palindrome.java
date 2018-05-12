package PracticeProblemsFromProfessor;

public class Palindrome {

	public static void main(String[] args) {
		
		Palindrome pali = new Palindrome();
		
		System.out.println(pali.isPalidrome("another"));
		System.out.println(pali.isPalidrome("racecar"));
	}
	
	public static boolean isPalidrome(String s){
		if(s.length() == 1){
			return true;
		}else if(s.charAt(0) == s.charAt(s.length()-1)){
			return isPalidrome(s.substring(1, s.length()-1));
		}else{
			return false;
		}
	}
}
