package Test4;

public class Test4 {

	public static void main(String[] args) {
		boolean notSelfNum[]=new boolean [10001];//셀프넘버가 아닌 수를 저장하는 불린 배열

		
		for(int i=0; i<notSelfNum.length;i++) {
			if(!notSelfNum[i]) {
				System.out.println(i);
			}
		}
	}
	
	//셀프넘버가 아닌수 구하기
	private static int dn(int n) {
		int dn=n;
		
		while(n>0) {
			dn+=n%10;
			n=n/10;
		}
		
		return dn;
	}

}
