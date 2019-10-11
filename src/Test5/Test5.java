package Test5;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2884 알람시계
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		
		if(M-45<0) {
			H--;
			M= M+60-45;
	
		}
		else {
			M-=45;
		}
		if(H<=0) {
			H=23;	
		}
	
		System.out.println(H+" "+M);
	}

}
