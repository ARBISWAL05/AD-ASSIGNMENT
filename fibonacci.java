import java.util.Scanner;
public class fibonacci {
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of term in fibonacci series  : ");
		int n=sc.nextInt();
		System.out.println("Fibonacci series is : ");
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
	}
}
