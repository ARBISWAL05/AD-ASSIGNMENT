import java.util.Scanner;
public class lin_rec {
	public static int linearsearch(int[]arr,int i, int key) {
		if(i<0) {
			return -1;
		}
		if(arr[i]==key) {
			return i;
		}
		else {
			return linearsearch(arr,i-1,key);
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("elements are :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of key : ");
		int key=sc.nextInt();
		System.out.println("result is :"+linearsearch(arr,key, key));
	}
}