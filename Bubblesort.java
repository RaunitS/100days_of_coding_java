package sorting;

public class Bubblesort {

	public static void main(String[] args) {
		int a[]= {2,1,8,-3,6,4,12};
		int n=a.length;
		boolean sorted=false;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted= false;
				}
			}
			if(sorted)break;
		}
		System.out.println("sorted elements are");
		for(int item:a) {
			System.out.print(item+" ");
		}
	}

}
