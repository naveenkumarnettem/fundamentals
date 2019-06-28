package fundamentals;
import java.util.*;
public class f11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		switch(c)
		{
			case 'R':
				System.out.println("Red");
				break;
			case 'B':
				System.out.println("Blue");
				break;
			case 'G':
				System.out.println("Green");		
				break;
			case 'O':
				System.out.println("Orange");
				break;
			case 'Y':
				System.out.println("Yellow");
				break;
			case 'W':
				System.out.println("White");
				break;		
			default:
				System.out.println("Invalid code");
				break;
		}
	}

	}