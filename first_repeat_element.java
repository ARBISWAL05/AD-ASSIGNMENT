import java.util.Scanner;
public class first_repeat_element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("Elements are : "+arr[i]);
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("First repeated element is :"+arr[j]);
				}
				break;
			}
		}
	}
}
