/*Input and Add Numbers
What about practicing taking input?
Write a program to take two integers 
x
 and 
y
 as input from the user, add those two integers and print the output.

Input Format
Two space-separated integers are provided 
x
 and 
y
.

Output Format
Print the addition of 
x
 and 
y
.

Constraints
−
1000
<=
a
,
b
<=
2000

Time Limit
1
 second
Example
Input
4 
5
Output
9
Sample Test Case Explanation
4+5=9*/
package javacoding_package;
import java.util.*;
import java.io.*;

public class InputandAddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	      int a,b;
	       a=sc.nextInt();
	       b=sc.nextInt();
	      System.out.println(a+b);
	}

}
