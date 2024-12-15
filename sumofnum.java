import java.util.Scanner;
public class sumofnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Enter the elements of array : ");
		int sum = 0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Elements of array : "+arr[i]);
			sum = sum+arr[i];
		}
		System.out.println("sum of numbers : "+sum);
	}
}
