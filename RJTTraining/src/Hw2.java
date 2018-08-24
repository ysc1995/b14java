
public class Hw2 {

	
	/**
	 * Bubble Sort, Selection Sort, Insertion Sort, Linear Search, Binary Search
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		arr[0]=8;
		arr[1]=3;
		arr[2]=6;
		arr[3]=9;
		arr[4]=2;
		arr[5]=1;
		arr[6]=0;
		arr[7]=4;
		arr[8]=7;
		arr[9]=5;
		bubble(arr);
		arr[0]=8;
		arr[1]=3;
		arr[2]=6;
		arr[3]=9;
		arr[4]=2;
		arr[5]=1;
		arr[6]=0;
		arr[7]=4;
		arr[8]=7;
		arr[9]=5;
		selection(arr);
		arr[0]=8;
		arr[1]=3;
		arr[2]=6;
		arr[3]=9;
		arr[4]=2;
		arr[5]=1;
		arr[6]=0;
		arr[7]=4;
		arr[8]=7;
		arr[9]=5;
		insertion(arr);
		arr[0]=8;
		arr[1]=3;
		arr[2]=6;
		arr[3]=9;
		arr[4]=2;
		arr[5]=1;
		arr[6]=0;
		arr[7]=4;
		arr[8]=7;
		arr[9]=5;
		System.out.println(linear(arr,4));
		arr[0]=8;
		arr[1]=3;
		arr[2]=6;
		arr[3]=9;
		arr[4]=2;
		arr[5]=1;
		arr[6]=0;
		arr[7]=4;
		arr[8]=7;
		arr[9]=5;
		System.out.println(binary(arr,4));
		
	}

	private static int binary(int[] arr, int i) {
		bubble(arr);
		int first=0; 
		int second=arr.length-1;
		int index=-1;
		while(first<=second){
			if(arr[second-first/2]==i){
				return (second-first);
			}
			if(arr[(second-first)/2]<i){
				first=(second-first)/2;
			}
			else{
				second=(second-first)/2;
			}
		}
		return index;
	}

	private static int linear(int[] arr, int n) {
		System.out.println();
		
		// TODO Auto-generated method stub
		for (int i = 0 ; i < arr.length; i ++){
			if (arr[i]==n){
				return i;
			}
		}
		return -1;
		
	}

	private static void insertion(int[] arr) {
		System.out.println();
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		for (int i = 0 ; i < 10 ; i ++){
			System.out.print(arr[i]);
		}
	}

	public static void selection(int[] arr) {
		System.out.println();
		
		int min;
		
		for (int i = 0 ; i < arr.length;i++){
			min=i;
			for (int j = i ; j < arr.length;j++){
				if(arr[min]>arr[j]){
					min=j;
				}
				}
				int a;
				a=arr[i];
				arr[i]=arr[min];
				arr[min]=a;
			
			
			
			
		}
		for (int i = 0 ; i < 10 ; i ++){
			System.out.print(arr[i]);
		}
		
	}

	private static void bubble(int[] arr) {
		// TODO Auto-generated method stub
		int a = 0;
		
		for (int i = 0 ; i < arr.length-1;i++){
			for (int j = 0 ; j < arr.length-1-i;j++){
				if (arr[j]>arr[j+1]){
					a=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=a;
				}
			}
		}
		
		for (int i = 0 ; i < 10 ; i ++){
			System.out.print(arr[i]);
		}
	}
	
	

}
