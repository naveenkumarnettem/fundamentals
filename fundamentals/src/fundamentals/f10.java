package fundamentals;
import java.util.*;
public class f10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(Character.isUpperCase(c))
		{
			System.out.println(c+"->"+Character.toLowerCase(c));
		}
		else
		{
			System.out.println(c+"->"+Character.toUpperCase(c));
		}
	
	}

}
