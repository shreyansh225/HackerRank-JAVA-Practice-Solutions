import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);  
                //-15s specifies that total 15 bit feild for string available the remaining willl be filled with space
                //%03d here 0 is the padding material and total field is 3 bit long
            }
            System.out.println("================================");

    }
}



/*
Input (stdin)

java 100
cpp 65
python 50

Your Output (stdout)
================================
java           100
cpp            065
python         050
================================
*/
