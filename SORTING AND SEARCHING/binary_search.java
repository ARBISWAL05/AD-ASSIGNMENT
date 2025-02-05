import java.util.Scanner;
public class binary_search {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		int l=0;
		int r=n-1;
		System.out.println("Enter the elements of this array : ");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
		}
		System.out.println("element we have to search : ");
		int x=sc.nextInt();
		while (l<=r){
			int m=(l+r)/2;
			if (arr[m]==x) {
				System.out.println(m);
				break;
			}
			else if (arr[m]<x) {
				l=m+1;
			}
			else if (arr[m]>x) {
				r=m-1;
			}
			else {
				System.out.println(-1);
			}
		}
		
	}
}
