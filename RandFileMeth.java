import java.io.*;
class RandFileMeth{
    public static void main(String args[]){
        try{
            RandomAccessFile r= new RandomAccessFile("xRand.txt","rw");
            int l= r.length();
            System.out.println("length is"+l);
            r.seek(l);
            String s =("Hi");
            System.out.println("ptr"+r.getFilePointer());
            r.write(s.getBytes());
            r.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}