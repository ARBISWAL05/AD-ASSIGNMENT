import java.util.Scanner;
public class find_max_min {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Elements of array : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min =arr[0];
		int max =arr[0];
		for(int i=0;i<n;i++) {
		System.out.println("Elements are : "+arr[i]);
		}
		for(int i=0;i<n;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
			if (arr[i]>max) {
				max=arr[i];
			}
		}
			System.out.println("min ="+min);
			System.out.println("max ="+max);
			}
		}
