import java.io.*;
import java.util.*;
public class Middle
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a string");
String str=s.nextLine();
int mid=str.length()/2;
if(str.length()/2==0)
{
str.charAt(mid)='*';
str.charAt(mid+1)='*';
}
else
{
str.charAt(mid)='*';
}
System.out.println(str);
}
}
