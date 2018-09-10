
public class Hw4 {

	/**
	 * Write a java program to find 2nd largest number in an array.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a ={1,3,5,2,7,4,9,6};
		System.out.println(findSecondLargetest(a));
	}

	public static int findSecondLargetest(int[] a) {
		int largest=a[1];
		int second=a[0];
		if(a[0]>a[1]){
			largest = a[0];
			second = a[1];
		}
		for (int i =2 ; i < a.length;i++){
			if(a[i]>largest){
				second = largest;
				largest = a[i];
			}
		}
		return second;
	}

}
