import java.util.Scanner;
public class missing_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr1[] = {1,2,3,4,6,7,8,9,10};
		int sum1 = 0;
		for(int i=0;i<=arr1.length;i++) {
			sum1 = sum1 + i;
		}
		System.out.println("sum1 = "+sum1);
		System.out.println("Enter the array size : ");
		int n = sc.nextInt();
		int sum2 = (n*(n+1))/2;
		System.out.println("sum2 = "+sum2);
		System.out.println("our missing number is : "+(sum2-sum1));
	}
}