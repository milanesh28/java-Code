package placement;

import java.util.Scanner;
class conv
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        String bin = sc.next();
        int value;
        int oct = 0;
        while (bin.length()%3!=0)
        for(int i=0;i<bin.length();i=i+3)   
        {
            value=0;                    
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i)-'0')*2;
            value+=(bin.charAt(i)-'0')*1;
            oct+=value;
        }
        System.out.println(oct);
    }
}
