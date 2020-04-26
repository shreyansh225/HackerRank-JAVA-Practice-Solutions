import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i;
        Scanner scan=new Scanner(System.in);
        for(i=1;scan.hasNextLine();i++)
        {
        String str= scan.nextLine();
        System.out.println(i+" "+str);
        }
    }
}

/*
Input (stdin)

Hello world
I am a file
Read me until end-of-file.

Output (stdout)

1 Hello world
2 I am a file
3 Read me until end-of-file.

*/
