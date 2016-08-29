# keypad
import java.util.*;
public class Keypad 
{
public static void main(String[] args)
{
Scanner scanner= new Scanner(System.in);
	String s=scanner.next();
	char c[]=s.toCharArray();
	for(int i=0;i<c.length;i++){
		
		if(c[i]=='2'){
			System.out.println("ABC");
		}
		else	if(c[i]=='3'){
			System.out.println("DEF");
		}
		else if(c[i]=='4'){
			System.out.println("GHI");
		}
		else if(c[i]=='5'){
			System.out.println("JKL");
		}
		else if(c[i]=='6'){
			System.out.println("MNO");
		}
		else if(c[i]=='7'){
			System.out.println("PQRS");
		}
		else	if(c[i]=='8'){
			System.out.println("TUV");
		}
		else if(c[i]=='9'){
			System.out.println("WXYZ");
		}
		else{
			System.out.println("null");
		}
		
		
		
		
		
	}
	
	
	}
}
