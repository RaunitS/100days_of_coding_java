package sorting;

public class Selectionsort {

	public static void main(String[] args) {
		int a[]= {3,1,-2,7,4,0};
		int n= a.length;
		for(int i=0;i<n-1;i++) {
			int minInt=i;
			for(int j=i;j<n;j++) {
				if(a[j]<a[minInt]) {
					minInt=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInt];
			a[minInt]=temp;
		}
		System.out.println("sorted elements are");
		for(int m:a) {
			System.out.print(m+" ");
		}
	}

}
