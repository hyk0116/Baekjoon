package Test2;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String[] arr;
		int count=0;

		StringBuffer strbf=new StringBuffer(s);

		for(int i=1; i<s.length(); i++) {
			if(s.charAt(i)!=s.charAt(i-1)) {
				strbf.insert(i+count, " ");
				count++;
			}
		}

		arr=strbf.toString().split(" ");

		char c;
		int count2;

		for(int i=0; i<arr.length;i++) {
			count2=arr[i].length();
			c=arr[i].charAt(0);
			
			if(count2==1) {
				System.out.print(c);
			}else {
				System.out.print(count2+""+c);
			}
		}


	}

}
