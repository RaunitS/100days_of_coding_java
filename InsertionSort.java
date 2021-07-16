//this code is for insertion sort
package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int arr1[]= {34,67,49,46,52,97,35};
		Insertion ob= new Insertion();
		ob.insertionSort(arr1);
		System.out.println("sorted array:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}
}
	class Insertion{
		void insertionSort(int arr[]) {
			int size = arr.length;
			for (int step=1;step<size;step++) {
				int key=arr[step];
				int j=step-1;
				while(j>=0&&key<arr[j]) {
					arr[j+1]=arr[j];
					--j;
				}
				arr[j+1]=key;
			}
	}

	}
