package j0726;

public class exam01 {

	public static void main(String[] args) {
		// 문자열
		
		String board="번호,제목,글쓴이";       //만약 010-1111-2222 를 나눠야한다면
		String bArr[]=board.split(",");    //,가 아니라 -로 나눈다. 스플릿은 문자열을 분리시키는거!
		for(int i=0; i<bArr.length; i++) {
			System.out.printf("bArr[%d]=%s\n", i, bArr[i]); //스트링인 경우 %d\n이 아니라 %s\n !
		}

	}

}
