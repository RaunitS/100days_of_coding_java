package sorting;

public class ShellSort {

	public static void main(String[] args) {
		int arr1[]= {9,8,3,7,5,6,4,1};
		Shellsort ob = new Shellsort();
		
		ob.shell(arr1, arr1.length);
		System.out.println("sorted array in ascending order:");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		

	}
}
	class Shellsort{
		void shell( int arr[],int n) {
			for(int gap=n/2; gap>0;gap/=2) {
				for(int i=gap;i<n;i+=1){
					int temp=arr[i];
					int j;
					for(j=i;j>=gap && arr[j-gap]>temp;j-=gap) {
						arr[j]=arr[j-gap];
					    
					}
					arr[j]=temp;
					
				}
			}
			
		}
	}
		
		
		
		
	


