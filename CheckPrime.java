import java.io.*;
class CheckPrime{
    public static void main(String args[]){
        int n,i,k=0;
        try{
            System.out.println("Enter the number");
            DataInputStream dis= new DataInputStream(System.in);
            n=Integer.parseInt(dis.readLine());
            if(n==0||n==1){
                k=1;
            }
            for(i=2;i<=n/2;++i){
                if(n%i==0){
                    k=1;
                    break;
                }
            }
            if(k=1) throw new PrimeException("this is a prime number");
        }
        catch(PrimeException e)
        {
            System.out.println(e);
        }
    }
}
class PrimeException extends Exception{
    PrimeException(String Mess){
        Super(Mess);
    }
}