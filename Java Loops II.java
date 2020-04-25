import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int x=0;
            for(int k=1;k<=n;k++)
            {
                x=(int)Math.pow(2,k-1)*b + x;
                System.out.print(a+x+" ");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
/*
Input (stdin)

2
0 2 10
5 3 5
Expected Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/
