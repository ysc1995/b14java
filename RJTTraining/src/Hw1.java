
public class Hw1 {

	
	/**
	 * Fibonacci Series, Prime Number, Palindrome Number, Factorial Number, Armstrong Number
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		fibonacci();
		prime();
		palindrome();
		System.out.println(factorial(5));
		int res[] = armstrong();
		for (int i = 0 ; i < 14; i ++){
			System.out.print(res[i]+" ");
		}
	}
	
	public static int[] armstrong() {
		System.out.print("Armstrong: ");
		int [] a = new int[14];
		int count=0;
		for (int i = 0 ; i < 1000; i ++){
			if (i<10){
				//System.out.print(" "+i);
				a[count]=i;
				count++;
			}
			else if(i<100){
				int tem = i;
				int res = (int) (Math.pow(tem%10,2)+Math.pow(tem/10, 2));
				
				if(res == i){
					//System.out.print(" "+i);
					a[count]=i;
					count++;
				}
			}
			else{
				int tem = i;
				int res = (int) (Math.pow(tem%10,3)+Math.pow((tem/10)%10,3)+Math.pow((tem/100)%10,3));
				if(res == i){
					//System.out.print(" "+i);
					a[count]=i;
					count++;
				}
			}
		}
		return a;
		
	}

	public static int factorial(int n) {
		System.out.println();
		int res = 1;
		for (int i = 1; i < n+1 ; i ++){
			res=res*i;
		}
		return res;
		
	}

	public static void palindrome() {
		System.out.println();
		System.out.print("Palindrome: ");
		for (int i = 0 ; i < 100; i ++){
			int ten = 0;
			int ind = 0;
			if (i<10){
				System.out.print(" "+i);
			}
			if (i<100&&i>10){
				ind = i%10;
				ten = i/10;
				if (ind == ten){
					System.out.print(" "+i);
				}
			}
		}
		
	}

	public static void fibonacci(){
		int first = 0;
		int second = 1;
		int tem=0;
		System.out.print("fibonacci: "+ first+" ");
		System.out.print(second);
		for (int i = 0; i < 10; i++){
			tem=first+second;
			first=second;
			second=tem;
			System.out.print(" "+second);
		}
	}
	
	public static void prime(){
		System.out.println();
		System.out.print("prime: ");
		for (int i = 2 ; i < 40;i++){
			boolean flag = false;
			
			for (int j = 2; j < Math.sqrt(i)+1;j++){
				if (i%j == 0){
					flag=true;
				}
			}
			if (i ==2){
				System.out.print(" "+i);
			}
			if (flag == false){
				System.out.print(" "+i);
			}
		}
	}

}
