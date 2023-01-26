import java.io.*;
import java.lang.*;
class test{
	public void Swapfn(int a, int b){
		System.out.println("inside befoe,a is "+a+"& b "+b);
		int c=a;
		a=b;
		b=c;
		System.out.println("inside after,a is "+a+"& b "+b);
	}
}
class CallValue{
	public static void main(String args[]){
		int a=10;
		int b=30;
		System.out.println(" befoe,a is "+a+"& b "+b);
		test t = new test();
		t.Swapfn(a,b);
		System.out.println("inside after,a is "+a+"& b "+b);
	}
}