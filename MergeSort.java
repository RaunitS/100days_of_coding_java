//merge sort algorithm
package sorting;


public class MergeSort {

	public static void main(String[] args) {
	
		int arr1[]= {38,27,43,3,9,82,10};
		Cat ob= new Cat();
		ob.mergeSort(arr1, 0, arr1.length-1);
		System.out.println("printed using enhanced for loop");
		for(int a:arr1 ) {
			System.out.println(a);
		}
		System.out.println("printed using simple for loop to print in the same line");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
		

	}
}
	class Cat {
	 void merge(int arr[],int p, int q, int r) {
		int i,j ,k;
		int n1=q-p+1;
		int n2=r-q;
		int L[]= new int[n1];
		int R[]=new int[n2];
		for(i=0;i<n1;i++) {
			L[i]=arr[p+i];
			
		}
		for(j=0;j<n2;j++) {
			R[j]=arr[q+1+j];
		}
		i=0;
		j=0;
		k=p;
		while(i<n1&&j<n2) {
			if (L[i]<=R[j] ){
				arr[k]=L[i];
				i++;
			}
			else {
				arr[k]=R[j];
				j++;
			}
			k++;
			
		}
		while(i<n1) {
			arr[k]=L[i];
			i++;
			k++;
			
		}
		while(j<n2) {
			arr[k]=R[j];
			j++;
			k++;
			
		}
		
		
	}
	void mergeSort(int arr[],int l,int r) {
		if(l<r) {
			int m=(l+r)/2;
			mergeSort(arr,l,m);
			mergeSort(arr,m+1,r);
			merge(arr,l,m,r);
		}
	}
	}


