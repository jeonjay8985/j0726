package j0726;

public class exam08 {

	public static void main(String[] args) {
		// concat

		
		String s1=" Java Programing ";
		String s2="서울시";
		String s3="종로구";
		String s4="110번지";
		
		System.out.println(s1);
		System.out.println(s1.trim()); //s1의 __을 없애고 싶을 때 trim이 공백을 제거해 줌!
		

		String s5=s2.concat(s3);
		String s6=s5.concat(s4);
		System.out.println(s6);
	}

}
