package fundamentals;
import java.util.*;
public class f18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		long num; 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		num=sc.nextLong();
		for(;num!=0;){
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println(sum);
	
	}

}
