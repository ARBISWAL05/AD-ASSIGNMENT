import java.util.Scanner;
public class linear_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter elements : ");
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Enter a number to search : ");
		int x=sc.nextInt();
		for(int i=0;i<n;i++) {
			if (arr[i]==x) {
				System.out.print("index number :"+i);
			}
		}
	}
}
