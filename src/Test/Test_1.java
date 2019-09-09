package Test;
import java.util.Scanner;
public class Test_1 {

	public static void main(String[] args) {
		// Baekjoon 2588 
		Scanner sc= new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int result1=n1*((n2%100)%10);
		int result2=n1*((n2%100)/10);
		int result3=n1*(n2/100);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1+result2*10+result3*100);
	}

}
