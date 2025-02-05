import java.util.Scanner;
public class heap_sort_min {
	public static void heapify_up(int[] arr, int i) {
		if(i > 0) {
			int j = i / 2;
			if (arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
			}
			heapify_up(arr, j);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array n :");
		int n=sc.nextInt();
		System.out.println("Enter elements of array : ");
		int[]arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);		
		}
		heapify_up(arr,n-1);
		System.out.println("heap after heapify");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);		
		}
	}
}
