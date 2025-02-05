import java.util.Scanner;
public class selectionsort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before sorting : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
				min=j;
			}
		}
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		System.out.println("after sorting : ");
		for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
  }
 }
}