package j0726;

public class exam02 {

	public static void main(String[] args) {
		// 문자열 잘라내기
		
		String str="920101-1234567";
		String gu=str.substring(7, 8);//substring(7) ->7번부터 1234567 다 가져올 수 있음 
		System.out.println(gu); //인덱스번호는 0번부터 시작. ex.주민등록번호의 성별 부분만 가져오고싶어
		
		if(gu.equals("1")|| gu.equals("3")) {
			System.out.println("남성입니다");
		}else {
			System.out.println("여성입니다");
		}
		

	}

}
