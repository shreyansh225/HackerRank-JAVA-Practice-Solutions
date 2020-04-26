import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static boolean flag = true;
static int B,H;

static
{
    Scanner s=new Scanner(System.in);
        B=s.nextInt();
        H=s.nextInt();
        s.close();
        if(H<=0 || B<=0) 
        {
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

/*
Input Format

There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

Constraints

Output Format

If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1

1
3
Sample output 1

3
Sample input 2

-1
2
Sample output 2

java.lang.Exception: Breadth and height must be positive
*/
