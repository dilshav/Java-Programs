import java.io.*;
import java.lang.*;
class ArrayException
{
public static void main(String args[])
{
int a[];
int n,i;
DataInputStream din= new DataInputStream(System.in);
try{
System.out.println("enter the size");
n=Integer.parseInt(din.readLine());
a= new int[n];
System.out.println("enter elements");
for(i=0;i<n;i++)
{
a[i]=Integer.parseInt(din.readLine());
}
System.out.println("elements are");
for(i=0;i<n;i++)
{
System.out.println(a[i]);
}
}
catch(IOException e)
{
System.out.println("error"+e);
}
catch(ArrayIndexoutofBoundException p)
{
    System.out.println(p);
}
}
}