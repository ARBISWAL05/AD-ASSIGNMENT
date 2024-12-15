import java.util.Scanner;
public class heap_sort_max {
public static void max_heapify(int[]arr,int i) {
	int l=2*i;int r=(2*i + 1);
	int largest=0;
	if (l<= arr.length && arr[l]>arr[i]) {
		largest = l;
	} else {
		largest = i;
	} if(r <= arr.length && arr[r]>arr[largest]) {
		largest = r;
	} if(largest != i) {
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;
	}
	max_heapify(arr, largest);
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
		System.out.println("heap after heapify");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);		
		}

	}

}
