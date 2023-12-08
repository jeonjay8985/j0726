package j0726;

public class exam04 {

	public static void main(String[] args) {
		// 특정 문자열 위치 찾기
		/*
		String str="자바 프로그래밍";
		int index=str.indexOf("프로그래밍");      //있을때는 있는 위치를 알려줌 ex.index : 3
		System.out.println("index : "+index);  //-1을반환하면 찾는 단어가 없음
		*/
		System.out.println("========================================");
		
		String str="자바 프로그래밍 자바";
		int index1=str.lastIndexOf("프로그래밍");      //있을때는 있는 위치를 알려줌 ex.index : 3
		System.out.println("index1 : "+index1);  
	}
	

}
