package javacoding_package;
import java.util.*;
import java.io.*;

public class Ifconditioncheckedlar3number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			if(a>c)
				System.out.println(a+"is a largest");
		}
		if(b>a) {
			if(b>c)
				System.out.println(b+"is b largest");
				
		}
		if(c>a) {
			if(c>b)
				System.out.println(c+"is c largest");
		}
		

	}

}
