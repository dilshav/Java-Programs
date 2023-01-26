import java.io.*;
class Exceps
{
	public static void main(String args[]){
	int a[],i=0,ch,n;
	DataInputStream dis= new DataInputStream(System.in);
	try{
		System.out.println("enter n");
		n=Integer.parseInt(dis.readLine());
		System.out.println("1.read__2.disp__enter your choice");
		ch=Integer.parseInt(dis.readLine());
		a= new int[n];
		do{
			switch(ch){
				case 1:	System.out.println("enter elements");
						a[i]=Integer.parseInt(dis.readLine());
						i++;
				break;
				case 2: for(i=0;i<n;i++){
						System.out.println(a[i]);
						}
				break;
			}
		}while(ch!=4);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException p)
	{
		p.printStackTrace();
	}
	}
}