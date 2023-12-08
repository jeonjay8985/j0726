package j0726;

public class exam03 {

		public static void main(String[] args) {
			// 문자열 잘라내기
			
			String str="920123-1234567";
			String mon=str.substring(2, 4);
			System.out.println("mon : " +mon);
			String day=str.substring(4, 6);
			System.out.println("day : " +day);

	}

}
