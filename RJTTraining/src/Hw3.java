import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		
		int[] a = new int[10];
		a[0]=3;
		a[1]=6;
		a[2]=9;
		a[3]=14;
		a[5]=22;
		a[4]=19;
		a[6]=30;
		a[7]=33;
		a[8]=46;
		a[9]=50;
		
		//Given an array of numbers find the two numbers which sum would be 
		//equal to n (Solution should have least complexity)	
		System.out.println(sumEqual(a,31));
		
		
		int[] b = new int[5];
		int[] c = new int[5];
		b[0]=12;
		b[1]=23;
		b[2]=41;
		b[3]=1;
		b[4]=7;
		c[0]=3;
		c[1]=34;
		c[2]=41;
		c[3]=8;
		c[4]=90;
		
		//Program to identify common elements in two arrays [12,23,41,1,7] [3,34,41,8,90]
		System.out.println(commonElements(b,c));
		
		
		
		
		

	}

	public static int commonElements(int[] b, int[] c) {
		// TODO Auto-generated method stub
		Set<Integer> set = new HashSet<Integer>();
		//boolean flag= false;
		for (int i = 0 ; i < b.length;i++){
			set.add(b[i]);
			if(set.contains(c[i])){
				//System.out.println("common element:"+b[i]);
				//flag = true;
				return b[i];
			}
		}
		return -1;
		
	}

	public static String sumEqual(int[] a, int n) {
		// TODO Auto-generated method stub
		Set<Integer> set = new TreeSet<Integer>();
		//boolean flag = false;
		for (int i = 0 ; i < a.length;i++){
			if (set.contains(n-a[i])){
				String stringBuilder =n-a[i]+"+"+a[i]+"="+n;
				//System.out.println(n-a[i]+"+"+a[i]+"="+n);
				//flag = true;
				return stringBuilder;
				
			}
			else{
				set.add(a[i]);
			}
		}
		String stringBuilder = "no results funded";
		return stringBuilder;
		
		
	}

}
