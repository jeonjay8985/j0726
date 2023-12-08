package j0726;

public class exam06 {

	public static void main(String[] args) {
		// 거꾸로 문자열
		
		String str="Java Programming";
		System.out.println("str.length: "+str.length());
		System.out.println("str.charAt(1)" +str.charAt(1)); 
		System.out.println("str.toUpperCase" +str.toUpperCase());
		System.out.println("str.toLowerCase" +str.toLowerCase()); //자바는 대소문자 구별을 함(html은 안함)
		
		
		for(int i=str.length()-1; i>=0; i--) {   
			System.out.print(str.charAt(i));  
		}
	}

}
