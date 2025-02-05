import java.util.Scanner;
public class insertion_sort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements in array n : ");
		int n=sc.nextInt();
		System.out.println("Enter the elements of an array ");
		int arr[]=new int[n];
		int key;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before sorting :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=1;i<n;i++) {
			key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j=j-1;
			}
				arr[j+1]=key;
			}
		System.out.println("After insertion sort :");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}
}
