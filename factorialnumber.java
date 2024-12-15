//import java.util.Scanner;
//public class rotating_by_pos {
//	public static int factorial(int n) {
//		if (n==0 || n==1){
//			return 1;
//		}
//		else {
//			return n*factorial(n-1);
//		}
//	}
//	public static void main(String[]args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("find the factorial of :");
//		int n = sc.nextInt();
//		System.out.println("factorial = "+factorial(n));
//	}
//}
import java.util.Scanner;
public class factorialnumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial of a number : ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>1;i--) {
			fact=fact*i;
		}
		System.out.println("factorial is : "+fact);
		}
	}