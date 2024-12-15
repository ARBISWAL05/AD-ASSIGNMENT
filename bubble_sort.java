import java.util.Scanner;
public class bubble_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in array n : ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an array ");
		int arr[]=new int[n];
		int temp;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Before sorting is :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
		System.out.println("After sorting is :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
