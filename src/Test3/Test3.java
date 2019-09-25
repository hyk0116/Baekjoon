package Test3;
import java.util.Scanner;
import java.util.Arrays;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1978
		Scanner sc=new Scanner(System.in);
		
		
		int a=sc.nextInt();
		int arr[] =new int [a];
		boolean b=true;//소수여부 판단
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
			
			if(arr[i]<=1)
				b=false;//0이나 1일때 
			else {
				for(int j=2;j<arr[i]/2; j++)
					if(arr[i]%j==0)
					b=false;//소수가 아닐때
			}
			if(b)
				count++;
			b=true;
			
		}
	
		System.out.println(count);
			
	}

}
