package j0726;

public class exam07 {

	public static void main(String[] args) {
		// trim과 concat
		
		String s1=" Java Programing ";
		String s2="Java";
		String s3="Programming";
		
		System.out.println(s1);
		System.out.println(s1.trim()); //s1의 __을 없애고 싶을 때 trim이 공백을 제거해 줌!
		
		String s4=s2.concat(s3); //Java+Programming 합치는 작업!
		System.out.println(s4);
 
	}

}
