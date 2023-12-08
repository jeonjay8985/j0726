package j0726;

public class exam05 {

	public static void main(String[] args) {
		// 처음부터 문자열
		
		String str="java programming";
		System.out.println("str.length: "+str.length());
		System.out.println("str.charAt(1)" +str.charAt(1)); //charAt도 일종의 배열 (1)이면 a가져옴
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));  //처음부터 한 자 한 자 찍어줌
		}

	}

}
